package com.vanniktech.locale

actual fun Language.displayName() = java.util.Locale(
  code,
  "",
).displayLanguage.capitalized()

actual fun Country.displayName() = when (this) {
  Country.INTERNATIONAL_WATERS -> "International Waters"
  else -> java.util.Locale(
    java.util.Locale.getDefault().language,
    identifier,
  ).displayCountry.capitalized()
}

fun Locale.toJavaLocale() = java.util.Locale(
  language.code,
  country?.identifier.orEmpty(),
)
