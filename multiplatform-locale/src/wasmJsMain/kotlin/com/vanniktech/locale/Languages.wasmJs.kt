package com.vanniktech.locale

@Suppress("EXPECT_ACTUAL_CLASSIFIERS_ARE_IN_BETA_WARNING")
actual object Languages {
  /** Returns the current ISO 639-1 [Language.code] - https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes. */
  actual fun currentLanguageCode(): String = countryDataFromLocale().officialLanguageCode.toString()
}
