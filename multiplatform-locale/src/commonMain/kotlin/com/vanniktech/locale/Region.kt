package com.vanniktech.locale

enum class Region(
  /** ISO 3166-1 alpha-2 code - https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2 */
  override val code: String,
  /** ISO 3166-1 alpha-3 code - https://en.wikipedia.org/wiki/ISO_3166-1_alpha-3 */
  override val code3: String,
) : Territory {
  EUROPEAN_UNION(code = "EU", code3 = "EUE"),
  LATIN_AMERICA(code = "419", code3 = "419"),
  CANARY_ISLANDS(code = "IC", code3 = ""),
  INTERNATIONAL_WATERS(code = "XZ", code3 = "XZZ"), // https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#User-assigned_code_elemen
  ;

  override val emoji: String? get() =
    when (this) {
      EUROPEAN_UNION -> """🇪🇺"""
      LATIN_AMERICA -> null
      CANARY_ISLANDS -> """🇮🇨"""
      INTERNATIONAL_WATERS -> """🌊"""
    }

  companion object {
    fun fromOrNull(identifier: String?) = when {
      identifier.isNullOrBlank() -> null
      else -> entries.firstOrNull { it.code.equals(identifier, ignoreCase = true) || it.code3.equals(identifier, ignoreCase = true) }
    }

    fun fromLocaleOrNull(locale: String?): Region? = fromOrNull(localeComponents(locale)?.country)

    /** Tries every possible combination that I know to somehow get a meaningful country. */
    fun fromLenientOrNull(string: String?) = entries.firstOrNull { it.name.equals(string, ignoreCase = true) }
      ?: fromOrNull(string)
      ?: fromLocaleOrNull(string)
  }
}
