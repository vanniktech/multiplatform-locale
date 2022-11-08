package com.vanniktech.locale

import platform.Foundation.NSLocale
import platform.Foundation.currentLocale
import platform.Foundation.localizedStringForCountryCode
import platform.Foundation.localizedStringForLanguageCode

actual fun Language.displayName(): String =
  NSLocale.currentLocale.localizedStringForLanguageCode(code).orEmpty().capitalized()

actual fun Country.displayName() = when (this) {
  Country.INTERNATIONAL_WATERS -> "International Waters"
  else -> NSLocale.currentLocale.localizedStringForCountryCode(identifier).orEmpty().capitalized()
}
