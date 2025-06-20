package com.vanniktech.locale

data class Locale(
  val language: Language,
  val territory: Territory?,
) : Comparable<Locale> {
  override fun toString() = listOfNotNull(
    language.code,
    territory?.code,
  ).joinToString(separator = "-")

  override fun compareTo(other: Locale): Int = compareValuesBy(this, other, { it.language }, { it.territory as Comparable<*> })

  companion object {
    fun from(locale: String) = requireNotNull(fromOrNull(locale)) { "Can't get locale for $locale" }

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

    fun fromAndroidValuesDirectoryName(androidValuesDirectoryName: String) = requireNotNull(fromAndroidValuesDirectoryNameOrNull(androidValuesDirectoryName)) { "Can't get locale for $androidValuesDirectoryName" }

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

internal fun localeComponents(localeString: String?): LocaleComponents? {
  val parts = localeString?.split("-", "_")?.filter { it.isNotBlank() }.orEmpty()
  val language = parts.getOrNull(0)

  if (language != null && isValidLanguage(language)) {
    when (parts.size) {
      0 -> Unit
      1 -> return LocaleComponents(language = language, country = null)
      2 -> return LocaleComponents(language = language, country = parts[1].takeIf(::isValidCountryOrRegion))
      else -> return when {
        isValidScript(parts[1]) && isValidCountryOrRegion(parts[2]) -> LocaleComponents(language = language, country = parts[2])
        else -> LocaleComponents(language = language, country = parts[1].takeIf(::isValidCountryOrRegion))
      }
    }
  }

  return null
}

private fun isValidLanguage(lang: String) = lang.matches(VALID_LANGUAGE_REGEX)
private val VALID_LANGUAGE_REGEX = Regex("^[a-z]{2,3}$")

private fun isValidScript(script: String) = script.matches(VALID_SCRIPT_REGEX)
private val VALID_SCRIPT_REGEX = Regex("^[A-Z][a-z]{3}$")

private fun isValidCountryOrRegion(country: String) = country.matches(VALID_COUNTRY_OR_REGION_REGEX)
private val VALID_COUNTRY_OR_REGION_REGEX = Regex("^[A-Z]{2}$|^[0-9]{3}$|^XZZ$")

internal data class LocaleComponents(
  val language: String,
  val country: String?,
)
