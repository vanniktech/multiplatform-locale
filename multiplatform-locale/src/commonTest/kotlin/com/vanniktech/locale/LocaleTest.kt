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
      Pair(Locale(Language.ENGLISH, country = null), "en"),
      Pair(Locale(Language.GERMAN, country = null), "de"),
      Pair(Locale(Language.ENGLISH, Country.ENGLAND), "en-GB"),
      Pair(Locale(Language.ENGLISH, Country.USA), "en-US"),
      Pair(Locale(Language.ENGLISH, Country.USA), "en_US"),
      Pair(Locale(Language.DUTCH, Country.NETHERLANDS), "nl-NL"),
      Pair(Locale(Language.DUTCH, Country.NETHERLANDS), "nl_NL"),
      Pair(Locale(Language.ITALIAN, Country.ITALY), "it-IT"),
      Pair(Locale(Language.ITALIAN, Country.ITALY), "it_IT"),
      Pair(Locale(Language.GERMAN, Country.USA), "de-US"),
      Pair(Locale(Language.GERMAN, Country.USA), "de_US"),
      Pair(Locale(Language.DANISH, Country.DENMARK), "da-DK"),
      Pair(Locale(Language.DANISH, Country.DENMARK), "da_DK"),
      Pair(Locale(Language.KOREAN, Country.SOUTH_KOREA), "ko_KR"),
      Pair(Locale(Language.KOREAN, Country.SOUTH_KOREA), "ko-KR"),
      Pair(Locale(Language.KOREAN, Country.NORTH_KOREA), "ko_KP"),
      Pair(Locale(Language.KOREAN, Country.NORTH_KOREA), "ko-KP"),
      Pair(Locale(Language.JAPANESE, Country.JAPAN), "ja-JP"),
      Pair(Locale(Language.JAPANESE, Country.JAPAN), "ja_JP"),
      Pair(Locale(Language.PORTUGUESE, Country.PORTUGAL), "pt-PT"),
      Pair(Locale(Language.PORTUGUESE, Country.PORTUGAL), "pt_PT"),
      Pair(Locale(Language.PORTUGUESE, Country.BRAZIL), "pt-BR"),
      Pair(Locale(Language.PORTUGUESE, Country.BRAZIL), "pt_BR"),
      Pair(Locale(Language.CHINESE, Country.CHINA), "zh-CN"),
      Pair(Locale(Language.CHINESE, Country.CHINA), "zh_CN_#Hans"),
      Pair(Locale(Language.SERBIAN, Country.SERBIA), "sr-RS"),
      Pair(Locale(Language.SERBIAN, Country.SERBIA), "sr_RS_#Latn"),
      Pair(Locale(Language.SLOVAK, Country.SLOVAKIA), "sk-SK"),
      Pair(Locale(Language.SLOVAK, Country.SLOVAKIA), "sk_SK"),
      Pair(Locale(Language.THAI, Country.THAILAND), "th-TH"),
      Pair(Locale(Language.ARABIC, Country.EGYPT), "ar_EG_#u-nu-latn"),
      Pair(Locale(Language.HINDI, Country.INDIA), "hi-IN"),
      Pair(Locale(Language.GUJARATI, Country.INDIA), "gu-IN"),
      Pair(Locale(Language.MALAY, Country.MALAYSIA), "ms_MY"),
      Pair(Locale(Language.FARSI, Country.IRAN), "fa-IR"),
      Pair(Locale(Language.ARMENIAN, Country.ARMENIA), "hy-AM"),
      Pair(Locale(Language.CROATIAN, Country.CROATIA), "hr-HR"),
      Pair(Locale(Language.AZERBAIJANI, Country.AZERBAIJAN), "az-AZ"),
      Pair(Locale(Language.BURMESE, Country.MYANMAR), "my-MM"),
      Pair(Locale(Language.IRISH, Country.IRELAND), "ga-IE"),
      Pair(Locale(Language.UZBEK, Country.UZBEKISTAN), "uz_UZ"),
      Pair(Locale(Language.CATALAN, Country.SPAIN), "ca_ES"),
      Pair(Locale(Language.BOKMAL, Country.NORWAY), "nb_NO"),
      Pair(Locale(Language.MALAYALAM, Country.INDIA), "ml-IN"),
    ).forEach { (locale, localeString) ->
      assertEquals(message = localeString, expected = locale, actual = Locale.fromOrNull(localeString))
    }
  }

  @Test fun googlePlayStoreLocaleAllPossibilities() {
    assertEquals(
      expected = listOf(
        GooglePlayStoreLocale.ar,
        GooglePlayStoreLocale.hy_AM,
        GooglePlayStoreLocale.az_AZ,
        GooglePlayStoreLocale.be,
        GooglePlayStoreLocale.bg,
        GooglePlayStoreLocale.my_MM,
        GooglePlayStoreLocale.zh_CN,
        GooglePlayStoreLocale.zh_TW,
        GooglePlayStoreLocale.zh_HK,
        GooglePlayStoreLocale.ca,
        GooglePlayStoreLocale.cs_CZ,
        GooglePlayStoreLocale.hr,
        GooglePlayStoreLocale.da_DK,
        GooglePlayStoreLocale.nl_NL,
        GooglePlayStoreLocale.en_US,
        GooglePlayStoreLocale.en_CA,
        GooglePlayStoreLocale.en_AU,
        GooglePlayStoreLocale.en_GB,
        GooglePlayStoreLocale.et,
        GooglePlayStoreLocale.fa_IR,
        GooglePlayStoreLocale.fa_AF,
        GooglePlayStoreLocale.fa,
        GooglePlayStoreLocale.fa_AE,
        GooglePlayStoreLocale.fi_FI,
        GooglePlayStoreLocale.fr_FR,
        GooglePlayStoreLocale.fr_CA,
        GooglePlayStoreLocale.de_DE,
        GooglePlayStoreLocale.el_GR,
        GooglePlayStoreLocale.gu,
        GooglePlayStoreLocale.iw_IL,
        GooglePlayStoreLocale.hi_IN,
        GooglePlayStoreLocale.hu_HU,
        GooglePlayStoreLocale.id,
        GooglePlayStoreLocale.it_IT,
        GooglePlayStoreLocale.ja_JP,
        GooglePlayStoreLocale.ko_KR,
        GooglePlayStoreLocale.lv,
        GooglePlayStoreLocale.lt,
        GooglePlayStoreLocale.ms_MY,
        GooglePlayStoreLocale.ml_IN,
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
        GooglePlayStoreLocale.th,
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

    assertEquals(
      expected = GooglePlayStoreLocale.fr_FR,
      actual = Locale(Language.FRENCH, null).googlePlayStoreLocale(),
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
        AppleAppStoreLocale.ca,
        AppleAppStoreLocale.cs,
        AppleAppStoreLocale.hr,
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
        AppleAppStoreLocale.hi,
        AppleAppStoreLocale.hu,
        AppleAppStoreLocale.id,
        AppleAppStoreLocale.it,
        AppleAppStoreLocale.ja,
        AppleAppStoreLocale.ko,
        AppleAppStoreLocale.ms,
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
        AppleAppStoreLocale.th,
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

    assertEquals(
      expected = AppleAppStoreLocale.fr_FR,
      actual = Locale(Language.FRENCH, null).appleAppStoreLocale(),
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

  @Test fun fromAndroidValuesDirectoryName() {
    assertEquals(expected = Locale(Language.ENGLISH, null), actual = Locale.fromAndroidValuesDirectoryName("values"))
  }

  @Test fun fromAndroidValuesDirectoryNameOrNull() {
    listOf(
      Pair(null, ""),
      Pair(null, "values-foo"),
      Pair(Locale(Language.ENGLISH, null), "values"),
      Pair(Locale(Language.ARABIC, null), "values-ar"),
      Pair(Locale(Language.BULGARIAN, null), "values-bg"),
      Pair(Locale(Language.CZECH, null), "values-cs"),
      Pair(Locale(Language.GERMAN, null), "values-de"),
      Pair(Locale(Language.GREEK, null), "values-el"),
      Pair(Locale(Language.SPANISH, null), "values-es"),
      Pair(Locale(Language.FINNISH, null), "values-fi"),
      Pair(Locale(Language.FRENCH, null), "values-fr"),
      Pair(Locale(Language.HUNGARIAN, null), "values-hu"),
      Pair(Locale(Language.INDONESIAN, null), "values-in"),
      Pair(Locale(Language.ITALIAN, null), "values-it"),
      Pair(Locale(Language.HEBREW, null), "values-iw"),
      Pair(Locale(Language.DUTCH, null), "values-nl"),
      Pair(Locale(Language.NORWEGIAN, null), "values-no"),
      Pair(Locale(Language.POLISH, null), "values-pl"),
      Pair(Locale(Language.PORTUGUESE, null), "values-pt"),
      Pair(Locale(Language.PORTUGUESE, Country.BRAZIL), "values-pt-rBR"),
      Pair(Locale(Language.ROMANIAN, null), "values-ro"),
      Pair(Locale(Language.RUSSIAN, null), "values-ru"),
      Pair(Locale(Language.SWEDISH, null), "values-sv"),
      Pair(Locale(Language.TURKISH, null), "values-tr"),
      Pair(Locale(Language.UKRAINIAN, null), "values-uk"),
      Pair(Locale(Language.VIETNAMESE, null), "values-vi"),
      Pair(Locale(Language.CHINESE, Country.CHINA), "values-zh-rCN"),
      Pair(Locale(Language.CHINESE, Country.TAIWAN), "values-zh-rTW"),
      Pair(Locale(Language.CHINESE, Country.TAIWAN), "zh-rTW"),
      Pair(Locale(Language.AZERBAIJANI, Country.AZERBAIJAN), "az_AZ_#Latn"),
      Pair(Locale(Language.BELARUSIAN, Country.BELARUS), "be-BY"),
    ).forEach { (locale, androidValuesDirectoryName) ->
      assertEquals(message = androidValuesDirectoryName, expected = locale, actual = Locale.fromAndroidValuesDirectoryNameOrNull(androidValuesDirectoryName))
    }
  }
}
