package com.vanniktech.locale.sample.jvm

import com.vanniktech.locale.Country
import com.vanniktech.locale.Language
import com.vanniktech.locale.Locale
import com.vanniktech.locale.Locales
import com.vanniktech.locale.displayName

fun main() {
  val currentLocaleString = Locales.currentLocaleString()
  println("Current Locale: $currentLocaleString")
  println("Google Play Store Locale: ${Locale.fromOrNull(currentLocaleString)?.googlePlayStoreLocale()?.toString() ?: "/"}")
  println("Apple App Store Locale: ${Locale.fromOrNull(currentLocaleString)?.googlePlayStoreLocale()?.toString() ?: "/"}")
  println()
  println("Current Locale Strings: ${Locales.currentLocaleStrings().joinToString(separator = ", ")}")
  println()
  println("All countries: ${Country.values().joinToString { it.displayName() } }")
  println()
  println("All languages: ${Language.values().joinToString { it.displayName() } }")
}
