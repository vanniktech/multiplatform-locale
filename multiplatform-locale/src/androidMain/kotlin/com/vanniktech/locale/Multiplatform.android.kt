package com.vanniktech.locale

internal actual fun Language.commonDisplayName() = java.util.Locale(
  code,
  "",
).displayLanguage.capitalized()

internal actual fun Territory.commonDisplayName() = when (this) {
  Region.INTERNATIONAL_WATERS -> "International Waters"
  else -> java.util.Locale(
    java.util.Locale.getDefault().language,
    code,
  ).displayCountry.capitalized()
}

fun Locale.toJavaLocale() = java.util.Locale(
  language.code,
  territory?.code.orEmpty(),
)
