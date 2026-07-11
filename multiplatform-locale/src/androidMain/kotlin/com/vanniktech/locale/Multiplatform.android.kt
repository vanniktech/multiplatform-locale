package com.vanniktech.locale

import java.util.Locale as JavaLocale

internal actual fun Language.commonDisplayName() = JavaLocale.Builder()
  .setLanguage(code)
  .build()
  .displayLanguage.capitalized()

internal actual fun Territory.commonDisplayName() = when (this) {
  Region.INTERNATIONAL_WATERS -> "International Waters"
  else -> JavaLocale.Builder()
    .setLanguage(JavaLocale.getDefault().language)
    .setRegion(code)
    .build()
    .displayCountry.capitalized()
}

fun Locale.toJavaLocale() = JavaLocale.Builder()
  .setLanguage(language.code)
  .setRegion(territory?.code.orEmpty())
  .build()
