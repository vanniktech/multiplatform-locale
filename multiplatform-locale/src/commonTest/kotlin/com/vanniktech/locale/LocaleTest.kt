package com.vanniktech.locale

import kotlin.test.Test
import kotlin.test.assertEquals

class LocaleTest {
  @Test fun sorted() {
    assertEquals(
      expected = listOf(
        Locale(Language.ENGLISH, territory = Country.USA),
        Locale(Language.GERMAN, territory = Country.GERMANY),
      ),
      actual = listOf(
        Locale(Language.GERMAN, territory = Country.GERMANY),
        Locale(Language.ENGLISH, territory = Country.USA),
      ).sorted(),
    )
  }

  @Test fun fromOrNull() {
    listOf(
      Pair(Locale(Language.ENGLISH, territory = null), "en"),
      Pair(Locale(Language.GERMAN, territory = null), "de"),
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
      Pair(Locale(Language.URDU, Country.PAKISTAN), "ur_PK"),
      Pair(Locale(Language.CENTRAL_KMHER, Country.ENGLAND), "km-GB"),
      Pair(Locale(Language.AMHARIC, Country.ETHIOPIA), "am-ET"),
      Pair(Locale(Language.FILIPINO, Country.PHILIPPINES), "fil-PH"),
      Pair(Locale(Language.ICELANDIC, Country.ICELAND), "is_IS"),
      Pair(Locale(Language.SPANISH, Region.LATIN_AMERICA), "es-419"),
      Pair(Locale(Language.SPANISH, Region.CANARY_ISLANDS), "es-IC"),
      Pair(Locale(Language.BOSNIAN, Country.BOSNIA_AND_HERZEGOVINA), "bs-BA"),
    ).forEach { (locale, localeString) ->
      assertEquals(
        message = localeString,
        expected = locale,
        actual = Locale.fromOrNull(localeString),
      )
    }
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
      Pair(Locale(Language.TAMIL, Country.INDIA), "ta-IN"),
      Pair(Locale(Language.MARATHI, Country.INDIA), "mr-IN"),
    ).forEach { (locale, androidValuesDirectoryName) ->
      assertEquals(message = androidValuesDirectoryName, expected = locale, actual = Locale.fromAndroidValuesDirectoryNameOrNull(androidValuesDirectoryName))
    }
  }
}
