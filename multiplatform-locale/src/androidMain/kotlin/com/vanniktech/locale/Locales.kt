package com.vanniktech.locale

import android.os.Build.VERSION.SDK_INT
import android.os.LocaleList
import java.util.Locale

@Suppress("EXPECT_ACTUAL_CLASSIFIERS_ARE_IN_BETA_WARNING")
actual object Locales {
  actual fun currentLocaleString(): String = Locale.getDefault().toString()

  actual fun currentLocaleStrings() = when {
    SDK_INT >= 24 -> {
      val locales = LocaleList.getDefault()
      (0 until locales.size()).map { locales[it] }
    }
    else -> {
      listOf(Locale.getDefault())
    }
  }.map { it.toString() }
}
