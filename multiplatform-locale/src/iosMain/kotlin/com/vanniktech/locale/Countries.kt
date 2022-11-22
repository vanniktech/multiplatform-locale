package com.vanniktech.locale

import platform.Foundation.NSLocale
import platform.Foundation.countryCode
import platform.Foundation.currentLocale

actual object Countries {
  actual fun currentCountryCode(): String? = NSLocale.currentLocale.countryCode
}
