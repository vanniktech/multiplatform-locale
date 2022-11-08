package com.vanniktech.locale

data class Locale(
  val language: Language,
  val country: Country?,
) : Comparable<Locale> {
  override fun toString() = listOfNotNull(
    language.identifier,
    country?.identifier,
  ).joinToString(separator = "-")

  /** Returns the optional [GooglePlayStoreLocale] that can be used for localizing the Google Play Store. */
  fun googlePlayStoreLocale(): GooglePlayStoreLocale? {
    val optimized = Locale(language, country ?: language.defaultCountry)
    return GooglePlayStoreLocale.values()
      .groupBy { Language.fromLocaleOrNull(it.toString()) }
      .firstNotNullOfOrNull { (key, locales) ->
        locales.firstNotNullOfOrNull { locale ->
          locale.takeIf {
            fromOrNull(it.name, inferDefaultCountry = false) == optimized
          }
        } ?: locales.firstNotNullOfOrNull { locale -> locale.takeIf { language == key } }
      }
  }

  /** Returns the optional [AppleAppStoreLocale] that can be used for localizing the Apple App Store. */
  fun appleAppStoreLocale(): AppleAppStoreLocale? {
    val optimized = Locale(language, country ?: language.defaultCountry)
    return AppleAppStoreLocale.values()
      .groupBy { Language.fromLocaleOrNull(it.toString()) }
      .firstNotNullOfOrNull { (key, locales) ->
        locales.firstNotNullOfOrNull { locale ->
          locale.takeIf {
            val isChineseTaiwan = it.name == "zh_Hant" && language == Language.CHINESE && country == Country.TAIWAN
            fromOrNull(it.name, inferDefaultCountry = false) == optimized || isChineseTaiwan
          }
        } ?: locales.firstNotNullOfOrNull { locale -> locale.takeIf { language == key } }
      }
  }

  override fun compareTo(other: Locale): Int =
    compareValuesBy(this, other, { it.language }, { it.country })

  companion object {
    fun from(locale: String, inferDefaultCountry: Boolean) =
      requireNotNull(fromOrNull(locale, inferDefaultCountry)) { "Can't get locale for $locale" }

    fun fromOrNull(locale: String?, inferDefaultCountry: Boolean): Locale? {
      val language = Language.fromLocaleOrNull(locale)
      val country = Country.fromLocaleOrNull(locale)

      return if (language != null) {
        Locale(
          language,
          country ?: when (inferDefaultCountry) {
            true -> language.defaultCountry
            else -> null
          },
        )
      } else {
        null
      }
    }

    fun fromAndroidValuesDirectoryName(androidValuesDirectoryName: String, inferDefaultCountry: Boolean) =
      requireNotNull(fromAndroidValuesDirectoryNameOrNull(androidValuesDirectoryName, inferDefaultCountry)) { "Can't get locale for $androidValuesDirectoryName" }

    fun fromAndroidValuesDirectoryNameOrNull(androidValuesDirectoryName: String, inferDefaultCountry: Boolean): Locale? {
      val requiredPrefix = "values"
      require(androidValuesDirectoryName.startsWith(requiredPrefix)) { "$androidValuesDirectoryName does not start with $requiredPrefix" }

      val name = androidValuesDirectoryName
        .removePrefix(requiredPrefix)
        .removePrefix("-")
      return when (name.isBlank()) {
        true -> Locale(Language.ENGLISH, null)
        else -> fromOrNull(name.replace("-r", "-"), inferDefaultCountry = inferDefaultCountry)
      }
    }
  }
}

internal fun localeSplit(locale: String?) = when {
  locale == null -> emptyList()
  locale.contains("-") -> locale.split("-")
  locale.contains("_") -> locale.split("_")
  else -> listOf(locale)
}
