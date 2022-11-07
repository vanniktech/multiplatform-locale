package com.vanniktech.locale

actual fun Language.displayName() = java.util.Locale(
  identifier,
  "",
).displayLanguage.capitalize()

actual fun Country.displayName() = when (this) {
  Country.INTERNATIONAL_WATERS -> "International Waters"
  else -> java.util.Locale(
    java.util.Locale.getDefault().language,
    identifier,
  ).displayCountry.capitalize()
}

fun Locale.toJavaLocale() = java.util.Locale(
  language.identifier,
  country?.identifier.orEmpty(),
)
