package com.vanniktech.locale

actual fun Language.displayName() = java.util.Locale(
  code,
  "",
).displayLanguage.capitalized()

actual fun Territory.displayName() = when (this) {
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
