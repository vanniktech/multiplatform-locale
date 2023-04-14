package com.vanniktech.locale

enum class Language(
  /** ISO 639-1 code - https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes */
  val code: String,
  /** [HEBREW] & [INDONESIAN] changed their identifier. We are backwards compatible and support both. */
  val legacyCode: String? = null,
  /** Countries, where this language is officially spoken in. */
  val officialCountries: List<Country>,
  /** Countries, where this language is spoken in. */
  val otherCountries: List<Country>,
) {
  ARABIC(
    code = "ar",
    officialCountries = listOf(Country.SAUDI_ARABIA, Country.ALGERIA, Country.BAHRAIN, Country.MALI, Country.NIGER, Country.SENEGAL, Country.CHAD, Country.COMOROS, Country.DJIBOUTI, Country.EGYPT, Country.IRAQ, Country.JORDAN, Country.KUWAIT, Country.LEBANON, Country.LIBYA, Country.MAURITANIA, Country.MOROCCO, Country.OMAN, Country.QATAR, Country.SOMALIA, Country.SUDAN, Country.SYRIA, Country.TUNISIA, Country.UNITED_ARAB_EMIRATES, Country.YEMEN),
    otherCountries = listOf(Country.PALESTINE, Country.SOMALIA, Country.SAHRAWI_ARAB_DEMOCRATIC_REPUBLIC, Country.TANZANIA),
  ),
  ARMENIAN(
    code = "hy",
    officialCountries = listOf(Country.ARMENIA),
    otherCountries = emptyList(),
  ),
  AZERBAIJANI(
    code = "az",
    officialCountries = listOf(Country.AZERBAIJAN),
    otherCountries = emptyList(),
  ),
  BULGARIAN(
    code = "bg",
    officialCountries = listOf(Country.BULGARIA),
    otherCountries = listOf(Country.GREECE, Country.ROMANIA, Country.MOLDOVA, Country.UKRAINE),
  ),
  BURMESE(
    code = "my",
    officialCountries = listOf(Country.MYANMAR),
    otherCountries = listOf(),
  ),
  CHINESE(
    code = "zh",
    officialCountries = listOf(Country.CHINA, Country.TAIWAN, Country.HONG_KONG, Country.SINGAPORE),
    otherCountries = emptyList(),
  ),
  CATALAN(
    code = "ca",
    officialCountries = listOf(Country.SPAIN), // Ish. Not really.
    otherCountries = listOf(Country.ANDORRA),
  ),
  CZECH(
    code = "cs",
    officialCountries = listOf(Country.CZECHIA),
    otherCountries = listOf(Country.POLAND, Country.SERBIA, Country.UKRAINE, Country.SLOVAKIA, Country.BULGARIA, Country.AUSTRIA),
  ),
  CROATIAN(
    code = "hr",
    officialCountries = listOf(Country.CROATIA),
    otherCountries = listOf(Country.AUSTRIA, Country.ITALY, Country.SERBIA),
  ),
  DANISH(
    code = "da",
    officialCountries = listOf(Country.DENMARK, Country.GREENLAND, Country.FAROE_ISLANDS),
    otherCountries = emptyList(),
  ),
  DUTCH(
    code = "nl",
    officialCountries = listOf(Country.NETHERLANDS, Country.BELGIUM, Country.SURINAME, Country.ARUBA, Country.CURACAO, Country.SINT_MAARTEN),
    otherCountries = emptyList(),
  ),
  ENGLISH(
    code = "en",
    officialCountries = listOf(Country.USA, Country.CANADA, Country.AUSTRALIA, Country.ENGLAND, Country.NEW_ZEALAND, Country.CHRISTMAS_ISLAND, Country.COCOS_ISLANDS, Country.TOKELAU, Country.BRITISH_INDIAN_OCEAN_TERRITORY, Country.GUERNSEY, Country.MONTSERRAT),
    otherCountries = listOf(Country.BAHRAIN, Country.BANGLADESH, Country.BRUNEI, Country.CYPRUS, Country.ERITREA, Country.ETHIOPIA, Country.GREENLAND, Country.ICELAND, Country.ISRAEL, Country.JORDAN, Country.KUWAIT, Country.MALAYSIA, Country.MALDIVES, Country.MYANMAR, Country.QATAR, Country.SRI_LANKA, Country.UNITED_ARAB_EMIRATES),
  ),
  ESTONIAN(
    code = "et",
    officialCountries = listOf(Country.ESTONIA),
    otherCountries = emptyList(),
  ),
  FARSI(
    code = "fa",
    officialCountries = listOf(Country.IRAN),
    otherCountries = listOf(Country.AFGHANISTAN, Country.BAHRAIN, Country.IRAQ, Country.OMAN, Country.YEMEN, Country.UNITED_ARAB_EMIRATES),
  ),
  FINNISH(
    code = "fi",
    officialCountries = listOf(Country.FINLAND, Country.SWEDEN),
    otherCountries = emptyList(),
  ),
  FRENCH(
    code = "fr",
    officialCountries = listOf(Country.FRANCE, Country.CANADA, Country.BELGIUM, Country.BENIN, Country.BURKINA_FASO, Country.BURUNDI, Country.CAMEROON, Country.CHAD, Country.COTE_DIVOIRE, Country.DEMOCRATIC_REPUBLIC_OF_CONGO, Country.DJIBOUTI, Country.EQUATORIAL_GUINEA, Country.HAITI, Country.LUXEMBOURG, Country.MADAGASCAR, Country.MALI, Country.MONACO, Country.NIGER, Country.RWANDA, Country.SENEGAL, Country.SEYCHELLES, Country.SWITZERLAND, Country.TOGO, Country.VANUATU),
    otherCountries = emptyList(),
  ),
  GERMAN(
    code = "de",
    officialCountries = listOf(Country.GERMANY, Country.AUSTRIA, Country.BELGIUM, Country.LUXEMBOURG, Country.SWITZERLAND, Country.LIECHTENSTEIN),
    otherCountries = emptyList(),
  ),
  GREEK(
    code = "el",
    officialCountries = listOf(Country.GREECE, Country.CYPRUS),
    otherCountries = emptyList(),
  ),
  GUJARATI(
    code = "gu",
    officialCountries = listOf(Country.INDIA, Country.SRI_LANKA, Country.SINGAPORE),
    otherCountries = listOf(Country.MALAYSIA, Country.MAURITIUS, Country.FIJI, Country.SOUTH_AFRICA),
  ),
  HEBREW(
    code = "he",
    legacyCode = "iw",
    officialCountries = listOf(Country.ISRAEL),
    otherCountries = emptyList(),
  ),
  HINDI(
    code = "hi",
    officialCountries = listOf(Country.INDIA),
    otherCountries = listOf(Country.MAURITIUS, Country.FIJI, Country.SURINAME, Country.GUYANA, Country.TRINIDAD_AND_TOBAGO, Country.NEPAL),
  ),
  HUNGARIAN(
    code = "hu",
    officialCountries = listOf(Country.HUNGARY),
    otherCountries = listOf(Country.ROMANIA, Country.SLOVAKIA, Country.SERBIA, Country.AUSTRIA, Country.SLOVENIA),
  ),
  INDONESIAN(
    code = "id",
    legacyCode = "in",
    officialCountries = listOf(Country.INDONESIA),
    otherCountries = emptyList(),
  ),
  IRISH(
    code = "ga",
    officialCountries = listOf(Country.IRELAND),
    otherCountries = listOf(),
  ),
  ITALIAN(
    code = "it",
    officialCountries = listOf(Country.ITALY, Country.SAN_MARINO, Country.SWITZERLAND, Country.VATICAN_CITY),
    otherCountries = listOf(Country.CROATIA, Country.SLOVENIA, Country.AUSTRIA),
  ),
  JAPANESE(
    code = "ja",
    officialCountries = listOf(Country.JAPAN),
    otherCountries = emptyList(),
  ),
  KOREAN(
    code = "ko",
    officialCountries = listOf(Country.SOUTH_KOREA, Country.NORTH_KOREA),
    otherCountries = emptyList(),
  ),
  LATVIAN(
    code = "lv",
    officialCountries = listOf(Country.LATVIA),
    otherCountries = emptyList(),
  ),
  LITHUANIAN(
    code = "lt",
    officialCountries = listOf(Country.LITHUANIA),
    otherCountries = emptyList(),
  ),
  MALAY(
    code = "ms",
    officialCountries = listOf(Country.MALAYSIA, Country.BRUNEI, Country.INDONESIA, Country.SINGAPORE),
    otherCountries = emptyList(),
  ),
  NORWEGIAN(
    code = "no",
    officialCountries = listOf(Country.NORWAY),
    otherCountries = emptyList(),
  ),
  POLISH(
    code = "pl",
    officialCountries = listOf(Country.POLAND),
    otherCountries = emptyList(),
  ),
  PORTUGUESE(
    code = "pt",
    officialCountries = listOf(Country.PORTUGAL, Country.BRAZIL, Country.ANGOLA, Country.MOZAMBIQUE),
    otherCountries = listOf(Country.GUINEA_BISSAU, Country.CAPE_VERDE, Country.SAO_TOME_AND_PRINCE, Country.MACAO),
  ),
  ROMANIAN(
    code = "ro",
    officialCountries = listOf(Country.ROMANIA, Country.MOLDOVA),
    otherCountries = emptyList(),
  ),
  RUSSIAN(
    code = "ru",
    officialCountries = listOf(Country.RUSSIA, Country.BELARUS, Country.KAZAKHSTAN, Country.KYRGYZSTAN),
    otherCountries = listOf(Country.AZERBAIJAN, Country.ESTONIA, Country.GEORGIA, Country.LATVIA, Country.UKRAINE, Country.LITHUANIA, Country.MOLDOVA, Country.TAJIKISTAN, Country.TURKMENISTAN, Country.UZBEKISTAN, Country.ISRAEL),
  ),
  SERBIAN(
    code = "sr",
    officialCountries = listOf(Country.SERBIA),
    otherCountries = listOf(Country.CROATIA, Country.BOSNIA_AND_HERZEGOVINA, Country.MONTENEGRO),
  ),
  SLOVAK(
    code = "sk",
    officialCountries = listOf(Country.SLOVAKIA),
    otherCountries = listOf(Country.SERBIA, Country.CZECHIA, Country.HUNGARY, Country.POLAND, Country.ROMANIA, Country.UKRAINE),
  ),
  SLOVENIAN(
    code = "sl",
    officialCountries = listOf(Country.SLOVENIA),
    otherCountries = listOf(Country.AUSTRIA, Country.ITALY),
  ),
  SPANISH(
    code = "es",
    officialCountries = listOf(Country.SPAIN, Country.MEXICO, Country.COLOMBIA, Country.ARGENTINA, Country.CHILE, Country.NICARAGUA, Country.URUGUAY, Country.EQUATORIAL_GUINEA, Country.PANAMA, Country.COSTA_RICA, Country.EL_SALVADOR, Country.PARAGUAY, Country.HONDURAS, Country.DOMINICAN_REPUBLIC, Country.CUBA, Country.BOLIVIA, Country.ECUADOR, Country.GUATEMALA, Country.VENEZUELA, Country.PERU, Country.PARAGUAY, Country.BOLIVIA),
    otherCountries = listOf(Country.USA, Country.BELIZE, Country.ANDORRA, Country.GIBRALTAR),
  ),
  SWEDISH(
    code = "sv",
    officialCountries = listOf(Country.SWEDEN, Country.FINLAND),
    otherCountries = listOf(Country.ESTONIA, Country.LATVIA),
  ),
  THAI(
    code = "th",
    officialCountries = listOf(Country.THAILAND),
    otherCountries = emptyList(),
  ),
  TURKISH(
    code = "tr",
    officialCountries = listOf(Country.TURKEY),
    otherCountries = emptyList(),
  ),
  UKRAINIAN(
    code = "uk",
    officialCountries = listOf(Country.UKRAINE),
    otherCountries = listOf(Country.KAZAKHSTAN, Country.MOLDOVA, Country.POLAND, Country.ROMANIA, Country.LITHUANIA, Country.SLOVAKIA),
  ),
  UZBEK(
    code = "uz",
    officialCountries = listOf(Country.UZBEKISTAN),
    otherCountries = listOf(Country.KAZAKHSTAN, Country.KYRGYZSTAN, Country.TAJIKISTAN, Country.TURKMENISTAN),
  ),
  VIETNAMESE(
    code = "vi",
    officialCountries = listOf(Country.VIETNAM),
    otherCountries = emptyList(),
  ),
  ;

  val defaultCountry = officialCountries.first()

  companion object {
    fun from(identifier: String): Language =
      requireNotNull(fromOrNull(identifier)) { "Can't get language from $identifier" }

    fun fromOrNull(identifier: String?): Language? =
      values().firstOrNull { it.code.equals(identifier, ignoreCase = true) || it.legacyCode?.equals(identifier, ignoreCase = true) == true }

    fun fromLocale(locale: String): Language =
      requireNotNull(fromLocaleOrNull(locale)) { "Can't get language from $locale" }

    fun fromLocaleOrNull(locale: String?): Language? =
      fromOrNull(localeSplit(locale).getOrNull(0))
  }
}

/** Returns the display name of [Language] in the current language. */
expect fun Language.displayName(): String
