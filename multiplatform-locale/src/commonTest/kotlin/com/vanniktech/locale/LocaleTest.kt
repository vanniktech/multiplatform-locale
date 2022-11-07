package com.vanniktech.locale

import kotlin.test.Test
import kotlin.test.assertEquals

class LocaleTest {
  @Test fun sorted() {
    assertEquals(
      expected = listOf(
        Locale(Language.ENGLISH, country = Country.USA),
        Locale(Language.GERMAN, country = Country.GERMANY),
      ),
      actual = listOf(
        Locale(Language.GERMAN, country = Country.GERMANY),
        Locale(Language.ENGLISH, country = Country.USA),
      ).sorted(),
    )
  }

  @Test fun fromOrNull() {
    listOf(
      Triple(Locale(Language.ENGLISH, country = null), "en", false),
      Triple(Locale(Language.GERMAN, country = null), "de", false),
      Triple(Locale(Language.ENGLISH, country = Country.USA), "en", true),
      Triple(Locale(Language.GERMAN, country = Country.GERMANY), "de", true),
      Triple(Locale(Language.ENGLISH, Country.ENGLAND), "en-GB", false),
      Triple(Locale(Language.ENGLISH, Country.USA), "en-US", false),
      Triple(Locale(Language.ENGLISH, Country.USA), "en_US", false),
      Triple(Locale(Language.DUTCH, Country.NETHERLANDS), "nl-NL", false),
      Triple(Locale(Language.DUTCH, Country.NETHERLANDS), "nl_NL", false),
      Triple(Locale(Language.ITALIAN, Country.ITALY), "it-IT", false),
      Triple(Locale(Language.ITALIAN, Country.ITALY), "it_IT", false),
      Triple(Locale(Language.GERMAN, Country.USA), "de-US", false),
      Triple(Locale(Language.GERMAN, Country.USA), "de_US", false),
      Triple(Locale(Language.DANISH, Country.DENMARK), "da-DK", false),
      Triple(Locale(Language.DANISH, Country.DENMARK), "da_DK", false),
      Triple(Locale(Language.KOREAN, Country.SOUTH_KOREA), "ko_KR", false),
      Triple(Locale(Language.KOREAN, Country.SOUTH_KOREA), "ko-KR", false),
      Triple(Locale(Language.KOREAN, Country.NORTH_KOREA), "ko_KP", false),
      Triple(Locale(Language.KOREAN, Country.NORTH_KOREA), "ko-KP", false),
      Triple(Locale(Language.JAPANESE, Country.JAPAN), "ja-JP", false),
      Triple(Locale(Language.JAPANESE, Country.JAPAN), "ja_JP", false),
      Triple(Locale(Language.PORTUGUESE, Country.PORTUGAL), "pt-PT", false),
      Triple(Locale(Language.PORTUGUESE, Country.PORTUGAL), "pt_PT", false),
      Triple(Locale(Language.PORTUGUESE, Country.BRAZIL), "pt-BR", false),
      Triple(Locale(Language.PORTUGUESE, Country.BRAZIL), "pt_BR", false),
      Triple(Locale(Language.CHINESE, Country.CHINA), "zh-CN", false),
      Triple(Locale(Language.CHINESE, Country.CHINA), "zh_CN_#Hans", false),
      Triple(Locale(Language.SERBIAN, Country.SERBIA), "sr-RS", false),
      Triple(Locale(Language.SERBIAN, Country.SERBIA), "sr_RS_#Latn", false),
      Triple(Locale(Language.SLOVAK, Country.SLOVAKIA), "sk-SK", false),
      Triple(Locale(Language.SLOVAK, Country.SLOVAKIA), "sk_SK", false),
    ).forEach { (locale, localeString, inferDefaultCountry) ->
      assertEquals(expected = locale, actual = Locale.fromOrNull(localeString, inferDefaultCountry = inferDefaultCountry))
    }
  }

  @Test fun googlePlayStoreLocaleAllPossibilities() {
    assertEquals(
      expected = listOf(
        GooglePlayStoreLocale.ar,
        GooglePlayStoreLocale.bg,
        GooglePlayStoreLocale.zh_CN,
        GooglePlayStoreLocale.zh_TW,
        GooglePlayStoreLocale.zh_HK,
        GooglePlayStoreLocale.cs_CZ,
        GooglePlayStoreLocale.da_DK,
        GooglePlayStoreLocale.nl_NL,
        GooglePlayStoreLocale.en_US,
        GooglePlayStoreLocale.en_CA,
        GooglePlayStoreLocale.en_AU,
        GooglePlayStoreLocale.en_GB,
        GooglePlayStoreLocale.et,
        GooglePlayStoreLocale.fi_FI,
        GooglePlayStoreLocale.fr_FR,
        GooglePlayStoreLocale.fr_CA,
        GooglePlayStoreLocale.de_DE,
        GooglePlayStoreLocale.el_GR,
        GooglePlayStoreLocale.iw_IL,
        GooglePlayStoreLocale.hu_HU,
        GooglePlayStoreLocale.id,
        GooglePlayStoreLocale.it_IT,
        GooglePlayStoreLocale.ja_JP,
        GooglePlayStoreLocale.ko_KR,
        GooglePlayStoreLocale.lv,
        GooglePlayStoreLocale.lt,
        GooglePlayStoreLocale.no_NO,
        GooglePlayStoreLocale.pl_PL,
        GooglePlayStoreLocale.pt_PT,
        GooglePlayStoreLocale.pt_BR,
        GooglePlayStoreLocale.ro,
        GooglePlayStoreLocale.ru_RU,
        GooglePlayStoreLocale.sr,
        GooglePlayStoreLocale.sk,
        GooglePlayStoreLocale.sl,
        GooglePlayStoreLocale.es_ES,
        GooglePlayStoreLocale.es_US,
        GooglePlayStoreLocale.sv_SE,
        GooglePlayStoreLocale.tr_TR,
        GooglePlayStoreLocale.uk,
        GooglePlayStoreLocale.vi,
      ),
      actual = Language.values().flatMap { language -> (language.officialCountries + language.otherCountries).mapNotNull { Locale(language, it).googlePlayStoreLocale() } }.distinct(),
    )
  }

  @Test fun googlePlayStoreLocaleLenient() {
    // Italian only has one GooglePlayStoreLocale, so we'll match regardless of Country.
    assertEquals(
      expected = GooglePlayStoreLocale.it_IT,
      actual = Locale(Language.ITALIAN, null).googlePlayStoreLocale(),
    )

    assertEquals(
      expected = GooglePlayStoreLocale.it_IT,
      actual = Locale(Language.ITALIAN, Country.AUSTRIA).googlePlayStoreLocale(),
    )

    // English has many, so we'll try to be as close as possible.
    assertEquals(
      expected = GooglePlayStoreLocale.en_AU,
      actual = Locale(Language.ENGLISH, Country.AUSTRIA).googlePlayStoreLocale(),
    )

    assertEquals(
      expected = GooglePlayStoreLocale.en_US,
      actual = Locale(Language.ENGLISH, Country.USA).googlePlayStoreLocale(),
    )

    assertEquals(
      expected = GooglePlayStoreLocale.en_CA,
      actual = Locale(Language.ENGLISH, Country.CANADA).googlePlayStoreLocale(),
    )
  }

  @Test fun appleAppStoreLocaleStringAllPossibilities() {
    assertEquals(
      expected = listOf(
        AppleAppStoreLocale.ar_SA,
        AppleAppStoreLocale.zh_Hans,
        AppleAppStoreLocale.zh_Hant,
        AppleAppStoreLocale.cs,
        AppleAppStoreLocale.da,
        AppleAppStoreLocale.nl_NL,
        AppleAppStoreLocale.en_US,
        AppleAppStoreLocale.en_CA,
        AppleAppStoreLocale.en_AU,
        AppleAppStoreLocale.en_GB,
        AppleAppStoreLocale.fi,
        AppleAppStoreLocale.fr_FR,
        AppleAppStoreLocale.fr_CA,
        AppleAppStoreLocale.de_DE,
        AppleAppStoreLocale.el,
        AppleAppStoreLocale.he,
        AppleAppStoreLocale.hu,
        AppleAppStoreLocale.id,
        AppleAppStoreLocale.it,
        AppleAppStoreLocale.ja,
        AppleAppStoreLocale.ko,
        AppleAppStoreLocale.no,
        AppleAppStoreLocale.pl,
        AppleAppStoreLocale.pt_PT,
        AppleAppStoreLocale.pt_BR,
        AppleAppStoreLocale.ro,
        AppleAppStoreLocale.ru,
        AppleAppStoreLocale.sk,
        AppleAppStoreLocale.es_ES,
        AppleAppStoreLocale.es_MX,
        AppleAppStoreLocale.sv,
        AppleAppStoreLocale.tr,
        AppleAppStoreLocale.uk,
        AppleAppStoreLocale.vi,
      ),
      actual = Language.values().flatMap { language -> (language.officialCountries + language.otherCountries).mapNotNull { Locale(language, it).appleAppStoreLocale() } }.distinct(),
    )
  }

  @Test fun appleAppStoreLocaleStringLenient() {
    // Swedish only has one GooglePlayStoreLocale, so we'll match regardless of Country.
    assertEquals(
      expected = AppleAppStoreLocale.it,
      actual = Locale(Language.ITALIAN, null).appleAppStoreLocale(),
    )

    assertEquals(
      expected = AppleAppStoreLocale.it,
      actual = Locale(Language.ITALIAN, Country.AUSTRIA).appleAppStoreLocale(),
    )

    // English has many, so we'll try to be as close as possible.
    assertEquals(
      expected = AppleAppStoreLocale.en_AU,
      actual = Locale(Language.ENGLISH, Country.AUSTRIA).appleAppStoreLocale(),
    )

    assertEquals(
      expected = AppleAppStoreLocale.en_US,
      actual = Locale(Language.ENGLISH, Country.USA).appleAppStoreLocale(),
    )

    assertEquals(
      expected = AppleAppStoreLocale.en_CA,
      actual = Locale(Language.ENGLISH, Country.CANADA).appleAppStoreLocale(),
    )
  }

  @Test fun fromAndroidValuesDirectoryNameOrNull() {
    listOf(
      Triple(null, "values-foo", false),
      Triple(Locale(Language.ENGLISH, null), "values", false),
      Triple(Locale(Language.ARABIC, null), "values-ar", false),
      Triple(Locale(Language.BULGARIAN, null), "values-bg", false),
      Triple(Locale(Language.CZECH, null), "values-cs", false),
      Triple(Locale(Language.GERMAN, null), "values-de", false),
      Triple(Locale(Language.GREEK, null), "values-el", false),
      Triple(Locale(Language.SPANISH, null), "values-es", false),
      Triple(Locale(Language.FINISH, null), "values-fi", false),
      Triple(Locale(Language.FRENCH, null), "values-fr", false),
      Triple(Locale(Language.HUNGARIAN, null), "values-hu", false),
      Triple(Locale(Language.INDONESIAN, null), "values-in", false),
      Triple(Locale(Language.ITALIAN, null), "values-it", false),
      Triple(Locale(Language.HEBREW, null), "values-iw", false),
      Triple(Locale(Language.DUTCH, null), "values-nl", false),
      Triple(Locale(Language.NORWEGIAN, null), "values-no", false),
      Triple(Locale(Language.POLISH, null), "values-pl", false),
      Triple(Locale(Language.PORTUGUESE, null), "values-pt", false),
      Triple(Locale(Language.PORTUGUESE, Country.BRAZIL), "values-pt-rBR", false),
      Triple(Locale(Language.ROMANIAN, null), "values-ro", false),
      Triple(Locale(Language.RUSSIAN, null), "values-ru", false),
      Triple(Locale(Language.SWEDISH, null), "values-sv", false),
      Triple(Locale(Language.TURKISH, null), "values-tr", false),
      Triple(Locale(Language.UKRAINIAN, null), "values-uk", false),
      Triple(Locale(Language.VIETNAMESE, null), "values-vi", false),
      Triple(Locale(Language.CHINESE, Country.CHINA), "values-zh-rCN", false),
      Triple(Locale(Language.CHINESE, Country.TAIWAN), "values-zh-rTW", false),
    ).forEach { (locale, localeString, inferDefaultCountry) ->
      assertEquals(expected = locale, actual = Locale.fromAndroidValuesDirectoryNameOrNull(localeString, inferDefaultCountry = inferDefaultCountry))
    }
  }
}
