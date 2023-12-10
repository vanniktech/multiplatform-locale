package com.vanniktech.locale

import platform.Foundation.NSLocale
import platform.Foundation.currentLocale
import platform.Foundation.languageCode

@Suppress("EXPECT_ACTUAL_CLASSIFIERS_ARE_IN_BETA_WARNING")
actual object Languages {
  actual fun currentLanguageCode() = NSLocale.currentLocale.languageCode
}
