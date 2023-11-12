package com.vanniktech.locale

import java.util.Locale

@Suppress("EXPECT_ACTUAL_CLASSIFIERS_ARE_IN_BETA_WARNING")
actual object Locales {
  actual fun currentLocaleString(): String = Locale.getDefault().toString()

  actual fun currentLocaleStrings() = listOf(currentLocaleString())
}
