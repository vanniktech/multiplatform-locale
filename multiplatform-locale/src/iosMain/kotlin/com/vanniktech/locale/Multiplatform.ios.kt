package com.vanniktech.locale

import platform.Foundation.NSLocale
import platform.Foundation.currentLocale
import platform.Foundation.localizedStringForCountryCode
import platform.Foundation.localizedStringForLanguageCode

internal actual fun Language.commonDisplayName(): String = NSLocale.currentLocale.localizedStringForLanguageCode(code).orEmpty().capitalized()

internal actual fun Territory.commonDisplayName() = when (this) {
  Region.INTERNATIONAL_WATERS -> "International Waters"
  else -> NSLocale.currentLocale.localizedStringForCountryCode(code).orEmpty().capitalized()
}
