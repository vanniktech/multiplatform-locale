package com.vanniktech.locale.google.play.store

import com.vanniktech.locale.Country
import com.vanniktech.locale.Language
import com.vanniktech.locale.Locale
import kotlin.test.Test
import kotlin.test.assertEquals

class GooglePlayStoreLocaleTest {
  @Test fun googlePlayStoreLocaleAllPossibilities() {
    assertEquals(
      expected = listOf(
        GooglePlayStoreLocale.ar,
        GooglePlayStoreLocale.af,
        GooglePlayStoreLocale.sq,
        GooglePlayStoreLocale.am,
        GooglePlayStoreLocale.hy_AM,
        GooglePlayStoreLocale.az_AZ,
        GooglePlayStoreLocale.be,
        GooglePlayStoreLocale.bn_BD,
        GooglePlayStoreLocale.bg,
        GooglePlayStoreLocale.my_MM,
        GooglePlayStoreLocale.km_KH,
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
        GooglePlayStoreLocale.fil,
        GooglePlayStoreLocale.fi_FI,
        GooglePlayStoreLocale.fr_FR,
        GooglePlayStoreLocale.fr_CA,
        GooglePlayStoreLocale.ka_GE,
        GooglePlayStoreLocale.de_DE,
        GooglePlayStoreLocale.el_GR,
        GooglePlayStoreLocale.gu,
        GooglePlayStoreLocale.iw_IL,
        GooglePlayStoreLocale.is_IS,
        GooglePlayStoreLocale.hi_IN,
        GooglePlayStoreLocale.hu_HU,
        GooglePlayStoreLocale.id,
        GooglePlayStoreLocale.it_IT,
        GooglePlayStoreLocale.ja_JP,
        GooglePlayStoreLocale.kn_IN,
        GooglePlayStoreLocale.ko_KR,
        GooglePlayStoreLocale.lo_LA,
        GooglePlayStoreLocale.lv,
        GooglePlayStoreLocale.lt,
        GooglePlayStoreLocale.mk_MK,
        GooglePlayStoreLocale.ms_MY,
        GooglePlayStoreLocale.ml_IN,
        GooglePlayStoreLocale.mr_IN,
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
        GooglePlayStoreLocale.es_419,
        GooglePlayStoreLocale.es_US,
        GooglePlayStoreLocale.sw,
        GooglePlayStoreLocale.sv_SE,
        GooglePlayStoreLocale.ta_IN,
        GooglePlayStoreLocale.te_IN,
        GooglePlayStoreLocale.th,
        GooglePlayStoreLocale.tr_TR,
        GooglePlayStoreLocale.uk,
        GooglePlayStoreLocale.ur,
        GooglePlayStoreLocale.vi,
      ),
      actual = Language.entries.flatMap { language -> (language.officialTerritories + language.otherTerritories).mapNotNull { Locale(language, it).googlePlayStoreLocale() } }.distinct(),
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
}
