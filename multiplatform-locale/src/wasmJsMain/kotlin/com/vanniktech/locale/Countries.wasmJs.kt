package com.vanniktech.locale

@Suppress("EXPECT_ACTUAL_CLASSIFIERS_ARE_IN_BETA_WARNING")
actual object Countries {
    /** Returns the current optional ISO 3166-1 alpha-2 [Country.code] - https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2 */
    actual fun currentCountryCode(): String? = countryDataFromLocale().countryCode.toString()
}
