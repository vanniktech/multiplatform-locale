package com.vanniktech.locale

/** Returns the display name of [Country] in the current language. */
actual fun Country.displayName(): String {
  // Look at [countryDataFromLocale] for reason
  return countryPropertyFor("countryCode", this.code.uppercase())
    .countryNameLocal
    .toString()
}
