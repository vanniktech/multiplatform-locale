package com.vanniktech.locale

import platform.Foundation.NSLocale
import platform.Foundation.currentLocale
import platform.Foundation.localeIdentifier
import platform.Foundation.preferredLanguages

@Suppress("EXPECT_ACTUAL_CLASSIFIERS_ARE_IN_BETA_WARNING")
actual object Locales {
  actual fun currentLocaleString() = NSLocale.currentLocale.localeIdentifier

  actual fun currentLocaleStrings() = NSLocale.preferredLanguages.mapNotNull { it.toString() }
}
