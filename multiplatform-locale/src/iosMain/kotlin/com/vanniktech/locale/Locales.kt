package com.vanniktech.locale

import platform.Foundation.NSLocale
import platform.Foundation.currentLocale
import platform.Foundation.localeIdentifier
import platform.Foundation.preferredLanguages

actual object Locales {
  actual fun currentLocaleString() = NSLocale.currentLocale.localeIdentifier

  actual fun currentLocaleStrings() = NSLocale.preferredLanguages.mapNotNull { it.toString() }
}
