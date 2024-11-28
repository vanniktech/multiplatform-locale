package com.vanniktech.locale.apple.app.store

import com.vanniktech.locale.Country
import com.vanniktech.locale.Language
import com.vanniktech.locale.Locale
import kotlin.test.Test
import kotlin.test.assertEquals

class AppleAppStoreLocaleTest {
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
      actual = Language.entries.flatMap { language -> (language.officialTerritories + language.otherTerritories).mapNotNull { Locale(language, it).appleAppStoreLocale() } }.distinct(),
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
}
