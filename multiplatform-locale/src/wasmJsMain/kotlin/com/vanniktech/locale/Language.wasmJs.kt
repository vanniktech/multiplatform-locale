package com.vanniktech.locale

/** Returns the display name of [Language] in the current language. */
actual fun Language.displayName(): String {
  // Look at [countryDataFromLocale] for reason
  return countryPropertyFor("countryCode", this.code.uppercase())
    .officialLanguageNameLocal
    .toString()
}
