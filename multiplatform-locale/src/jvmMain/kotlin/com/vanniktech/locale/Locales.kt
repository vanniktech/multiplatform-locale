package com.vanniktech.locale

import java.util.Locale

actual object Locales {
  actual fun currentLocaleString(): String = Locale.getDefault().toString()

  actual fun currentLocaleStrings() = listOf(currentLocaleString())
}
