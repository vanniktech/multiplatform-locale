package com.vanniktech.locale

data class Locale(
  val language: Language,
  val territory: Territory?,
) : Comparable<Locale> {
  override fun toString() = listOfNotNull(
    language.code,
    territory?.code,
  ).joinToString(separator = "-")

  /** Returns the optional [GooglePlayStoreLocale] that can be used for localizing the Google Play Store. */
  fun googlePlayStoreLocale(): GooglePlayStoreLocale? {
    val optimized = Locale(
      language = language,
      territory = territory ?: language.defaultCountry,
    )
    return GooglePlayStoreLocale.entries
      .groupBy { Language.fromLocaleOrNull(it.toString()) }
      .firstNotNullOfOrNull { (key, locales) ->
        locales.firstNotNullOfOrNull { locale ->
          locale.takeIf {
            fromOrNull(it.name) == optimized
          }
        } ?: locales.firstNotNullOfOrNull { locale -> locale.takeIf { language == key } }
      }
  }

  /** Returns the optional [AppleAppStoreLocale] that can be used for localizing the Apple App Store. */
  fun appleAppStoreLocale(): AppleAppStoreLocale? {
    val optimized = Locale(
      language = language,
      territory = territory ?: language.defaultCountry,
    )
    return AppleAppStoreLocale.entries
      .groupBy { Language.fromLocaleOrNull(it.toString()) }
      .firstNotNullOfOrNull { (key, locales) ->
        locales.firstNotNullOfOrNull { locale ->
          locale.takeIf {
            val isChineseTaiwan = it.name == "zh_Hant" && language == Language.CHINESE && territory == Country.TAIWAN
            fromOrNull(it.name) == optimized || isChineseTaiwan
          }
        } ?: locales.firstNotNullOfOrNull { locale -> locale.takeIf { language == key } }
      }
  }

  override fun compareTo(other: Locale): Int =
    compareValuesBy(this, other, { it.language }, { it.territory as Comparable<*> })

  companion object {
    fun from(locale: String) =
      requireNotNull(fromOrNull(locale)) { "Can't get locale for $locale" }

    fun fromOrNull(locale: String?): Locale? {
      val language = Language.fromLocaleOrNull(locale)

      return if (language != null) {
        Locale(
          language = language,
          territory = Country.fromLocaleOrNull(locale) ?: Region.fromLocaleOrNull(locale),
        )
      } else {
        null
      }
    }

    fun fromAndroidValuesDirectoryName(androidValuesDirectoryName: String) =
      requireNotNull(fromAndroidValuesDirectoryNameOrNull(androidValuesDirectoryName)) { "Can't get locale for $androidValuesDirectoryName" }

    fun fromAndroidValuesDirectoryNameOrNull(androidValuesDirectoryName: String): Locale? {
      val name = androidValuesDirectoryName
        .removePrefix("values")
        .removePrefix("-")

      return when (androidValuesDirectoryName) {
        "values" -> Locale(Language.ENGLISH, null)
        else -> fromOrNull(name.replace("-r", "-"))
      }
    }
  }
}

internal fun localeSplit(locale: String?) = when {
  locale == null -> emptyList()
  locale.contains("_") -> locale.split("_")
  locale.contains("-") -> locale.split("-")
  else -> listOf(locale)
}
