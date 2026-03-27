package com.vanniktech.locale

import java.util.Locale as JavaLocale

internal actual fun Language.commonDisplayName() = JavaLocale.of(
  code,
  "",
).displayLanguage.capitalized()

internal actual fun Territory.commonDisplayName() = when (this) {
  Region.INTERNATIONAL_WATERS -> "International Waters"
  else -> JavaLocale.of(
    JavaLocale.getDefault().language,
    code,
  ).displayCountry.capitalized()
}

fun Locale.toJavaLocale() = JavaLocale.of(
  language.code,
  territory?.code.orEmpty(),
)
