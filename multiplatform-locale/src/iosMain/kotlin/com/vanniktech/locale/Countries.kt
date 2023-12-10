package com.vanniktech.locale

import platform.Foundation.NSLocale
import platform.Foundation.countryCode
import platform.Foundation.currentLocale

@Suppress("EXPECT_ACTUAL_CLASSIFIERS_ARE_IN_BETA_WARNING")
actual object Countries {
  actual fun currentCountryCode(): String? = NSLocale.currentLocale.countryCode
}
