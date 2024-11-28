package com.vanniktech.locale.apple.app.store

import com.vanniktech.locale.Country
import com.vanniktech.locale.Language
import com.vanniktech.locale.Locale
import com.vanniktech.locale.Locale.Companion.fromOrNull

/** All the locales supported by the Apple App Store. */
@Suppress("ktlint:standard:enum-entry-name-case") enum class AppleAppStoreLocale {
  ar_SA,
  ca,
  cs,
  da,
  de_DE,
  el,
  en_AU,
  en_CA,
  en_GB,
  en_US,
  es_ES,
  es_MX,
  fi,
  fr_CA,
  fr_FR,
  he,
  hi,
  hr,
  hu,
  id,
  it,
  ja,
  ko,
  ms,
  nl_NL,
  no,
  pl,
  pt_BR,
  pt_PT,
  ro,
  ru,
  sk,
  sv,
  th,
  tr,
  uk,
  vi,
  zh_Hans,
  zh_Hant,
  ;

  override fun toString() = name.replace("_", "-")
}

/** Returns the optional [AppleAppStoreLocale] that can be used for localizing the Apple App Store. */
fun Locale.appleAppStoreLocale(): AppleAppStoreLocale? {
  val optimized = Locale(
    language = language,
    territory = territory ?: language.defaultCountry,
  )
  return AppleAppStoreLocale.entries
    .groupBy { Language.fromLocaleOrNull(it.toString()) }
    .firstNotNullOfOrNull { (key, locales) ->
      locales.firstNotNullOfOrNull { locale ->
        locale.takeIf {
          val isChineseTaiwan = it.name == "zh_Hant" && language == Language.CHINESE && territory == Country.TAIWAN
          fromOrNull(it.name) == optimized || isChineseTaiwan
        }
      } ?: locales.firstNotNullOfOrNull { locale -> locale.takeIf { language == key } }
    }
}
