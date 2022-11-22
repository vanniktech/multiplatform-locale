package com.vanniktech.locale

import platform.Foundation.NSLocale
import platform.Foundation.currentLocale
import platform.Foundation.languageCode

actual object Languages {
  actual fun currentLanguageCode() = NSLocale.currentLocale.languageCode
}
