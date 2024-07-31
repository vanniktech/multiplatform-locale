package com.vanniktech.locale

enum class Language(
  /** ISO 639-1 code - https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes */
  val code: String,
  /** [HEBREW] & [INDONESIAN] changed their identifier. We are backwards compatible and support both. */
  val legacyCode: String? = null,
  /** Territories, where this [Language] is officially spoken in. */
  val officialTerritories: List<Territory>,
  /** Territories, where this [Language] is spoken in. */
  val otherTerritories: List<Territory>,
) {
  ARABIC(
    code = "ar",
    officialTerritories = listOf(Country.SAUDI_ARABIA, Country.ALGERIA, Country.BAHRAIN, Country.MALI, Country.NIGER, Country.SENEGAL, Country.CHAD, Country.COMOROS, Country.DJIBOUTI, Country.EGYPT, Country.IRAQ, Country.JORDAN, Country.KUWAIT, Country.LEBANON, Country.LIBYA, Country.MAURITANIA, Country.MOROCCO, Country.OMAN, Country.QATAR, Country.SOMALIA, Country.SUDAN, Country.SYRIA, Country.TUNISIA, Country.UNITED_ARAB_EMIRATES, Country.YEMEN),
    otherTerritories = listOf(Country.PALESTINE, Country.SOMALIA, Country.SAHRAWI_ARAB_DEMOCRATIC_REPUBLIC, Country.TANZANIA),
  ),
  AMHARIC(
    code = "am",
    officialTerritories = listOf(Country.ETHIOPIA),
    otherTerritories = emptyList(),
  ),
  ARMENIAN(
    code = "hy",
    officialTerritories = listOf(Country.ARMENIA),
    otherTerritories = emptyList(),
  ),
  AZERBAIJANI(
    code = "az",
    officialTerritories = listOf(Country.AZERBAIJAN),
    otherTerritories = emptyList(),
  ),
  BELARUSIAN(
    code = "be",
    officialTerritories = listOf(Country.BELARUS),
    otherTerritories = listOf(Country.RUSSIA, Country.LITHUANIA, Country.LATVIA, Country.POLAND, Country.UKRAINE),
  ),
  BOKMAL(
    code = "nb",
    officialTerritories = listOf(Country.NORWAY),
    otherTerritories = listOf(),
  ),
  BULGARIAN(
    code = "bg",
    officialTerritories = listOf(Country.BULGARIA),
    otherTerritories = listOf(Country.GREECE, Country.ROMANIA, Country.MOLDOVA, Country.UKRAINE),
  ),
  BURMESE(
    code = "my",
    officialTerritories = listOf(Country.MYANMAR),
    otherTerritories = listOf(),
  ),
  CENTRAL_KMHER(
    code = "km",
    officialTerritories = listOf(Country.CAMBODIA),
    otherTerritories = emptyList(),
  ),
  CHINESE(
    code = "zh",
    officialTerritories = listOf(Country.CHINA, Country.TAIWAN, Country.HONG_KONG, Country.SINGAPORE, Country.MACAO),
    otherTerritories = emptyList(),
  ),
  CATALAN(
    code = "ca",
    officialTerritories = listOf(Country.SPAIN),
    otherTerritories = listOf(Country.ANDORRA),
  ),
  CZECH(
    code = "cs",
    officialTerritories = listOf(Country.CZECHIA),
    otherTerritories = listOf(Country.POLAND, Country.SERBIA, Country.UKRAINE, Country.SLOVAKIA, Country.BULGARIA, Country.AUSTRIA),
  ),
  CROATIAN(
    code = "hr",
    officialTerritories = listOf(Country.CROATIA),
    otherTerritories = listOf(Country.AUSTRIA, Country.ITALY, Country.SERBIA),
  ),
  DANISH(
    code = "da",
    officialTerritories = listOf(Country.DENMARK, Country.GREENLAND, Country.FAROE_ISLANDS),
    otherTerritories = emptyList(),
  ),
  DUTCH(
    code = "nl",
    officialTerritories = listOf(Country.NETHERLANDS, Country.BELGIUM, Country.SURINAME, Country.ARUBA, Country.CURACAO, Country.SINT_MAARTEN),
    otherTerritories = emptyList(),
  ),
  ENGLISH(
    code = "en",
    officialTerritories = listOf(Country.USA, Country.CANADA, Country.AUSTRALIA, Country.ENGLAND, Country.NEW_ZEALAND, Country.CHRISTMAS_ISLAND, Country.COCOS_ISLANDS, Country.TOKELAU, Country.BRITISH_INDIAN_OCEAN_TERRITORY, Country.GUERNSEY, Country.MONTSERRAT),
    otherTerritories = listOf(Country.BAHRAIN, Country.BANGLADESH, Country.BRUNEI, Country.CYPRUS, Country.ERITREA, Country.ETHIOPIA, Country.GREENLAND, Country.ICELAND, Country.ISRAEL, Country.JORDAN, Country.KUWAIT, Country.MALAYSIA, Country.MALDIVES, Country.MYANMAR, Country.QATAR, Country.SRI_LANKA, Country.UNITED_ARAB_EMIRATES),
  ),
  ESTONIAN(
    code = "et",
    officialTerritories = listOf(Country.ESTONIA),
    otherTerritories = emptyList(),
  ),
  FARSI(
    code = "fa",
    officialTerritories = listOf(Country.IRAN),
    otherTerritories = listOf(Country.AFGHANISTAN, Country.BAHRAIN, Country.IRAQ, Country.OMAN, Country.YEMEN, Country.UNITED_ARAB_EMIRATES),
  ),
  FILIPINO(
    code = "fil",
    officialTerritories = listOf(Country.PHILIPPINES),
    otherTerritories = emptyList(),
  ),
  FINNISH(
    code = "fi",
    officialTerritories = listOf(Country.FINLAND, Country.SWEDEN),
    otherTerritories = emptyList(),
  ),
  FRENCH(
    code = "fr",
    officialTerritories = listOf(Country.FRANCE, Country.CANADA, Country.BELGIUM, Country.BENIN, Country.BURKINA_FASO, Country.BURUNDI, Country.CAMEROON, Country.CHAD, Country.COTE_DIVOIRE, Country.DEMOCRATIC_REPUBLIC_OF_CONGO, Country.DJIBOUTI, Country.EQUATORIAL_GUINEA, Country.HAITI, Country.LUXEMBOURG, Country.MADAGASCAR, Country.MALI, Country.MONACO, Country.NIGER, Country.RWANDA, Country.SENEGAL, Country.SEYCHELLES, Country.SWITZERLAND, Country.TOGO, Country.VANUATU),
    otherTerritories = emptyList(),
  ),
  GERMAN(
    code = "de",
    officialTerritories = listOf(Country.GERMANY, Country.AUSTRIA, Country.BELGIUM, Country.LUXEMBOURG, Country.SWITZERLAND, Country.LIECHTENSTEIN),
    otherTerritories = emptyList(),
  ),
  GREEK(
    code = "el",
    officialTerritories = listOf(Country.GREECE, Country.CYPRUS),
    otherTerritories = emptyList(),
  ),
  GUJARATI(
    code = "gu",
    officialTerritories = listOf(Country.INDIA, Country.SRI_LANKA, Country.SINGAPORE),
    otherTerritories = listOf(Country.MALAYSIA, Country.MAURITIUS, Country.FIJI, Country.SOUTH_AFRICA),
  ),
  HEBREW(
    code = "he",
    legacyCode = "iw",
    officialTerritories = listOf(Country.ISRAEL),
    otherTerritories = emptyList(),
  ),
  ICELANDIC(
    code = "is",
    officialTerritories = listOf(Country.ICELAND),
    otherTerritories = emptyList(),
  ),
  HINDI(
    code = "hi",
    officialTerritories = listOf(Country.INDIA),
    otherTerritories = listOf(Country.MAURITIUS, Country.FIJI, Country.SURINAME, Country.GUYANA, Country.TRINIDAD_AND_TOBAGO, Country.NEPAL),
  ),
  HUNGARIAN(
    code = "hu",
    officialTerritories = listOf(Country.HUNGARY),
    otherTerritories = listOf(Country.ROMANIA, Country.SLOVAKIA, Country.SERBIA, Country.AUSTRIA, Country.SLOVENIA),
  ),
  INDONESIAN(
    code = "id",
    legacyCode = "in",
    officialTerritories = listOf(Country.INDONESIA),
    otherTerritories = emptyList(),
  ),
  IRISH(
    code = "ga",
    officialTerritories = listOf(Country.IRELAND),
    otherTerritories = listOf(),
  ),
  ITALIAN(
    code = "it",
    officialTerritories = listOf(Country.ITALY, Country.SAN_MARINO, Country.SWITZERLAND, Country.VATICAN_CITY),
    otherTerritories = listOf(Country.CROATIA, Country.SLOVENIA, Country.AUSTRIA),
  ),
  JAPANESE(
    code = "ja",
    officialTerritories = listOf(Country.JAPAN),
    otherTerritories = emptyList(),
  ),
  KOREAN(
    code = "ko",
    officialTerritories = listOf(Country.SOUTH_KOREA, Country.NORTH_KOREA),
    otherTerritories = emptyList(),
  ),
  LATVIAN(
    code = "lv",
    officialTerritories = listOf(Country.LATVIA),
    otherTerritories = emptyList(),
  ),
  LITHUANIAN(
    code = "lt",
    officialTerritories = listOf(Country.LITHUANIA),
    otherTerritories = emptyList(),
  ),
  MALAY(
    code = "ms",
    officialTerritories = listOf(Country.MALAYSIA, Country.BRUNEI, Country.INDONESIA, Country.SINGAPORE),
    otherTerritories = emptyList(),
  ),
  MALAYALAM(
    code = "ml",
    officialTerritories = listOf(Country.INDIA),
    otherTerritories = emptyList(),
  ),
  MARATHI(
    code = "mr",
    officialTerritories = listOf(Country.INDIA),
    otherTerritories = emptyList(),
  ),
  NORWEGIAN(
    code = "no",
    officialTerritories = listOf(Country.NORWAY),
    otherTerritories = emptyList(),
  ),
  POLISH(
    code = "pl",
    officialTerritories = listOf(Country.POLAND),
    otherTerritories = emptyList(),
  ),
  PORTUGUESE(
    code = "pt",
    officialTerritories = listOf(Country.PORTUGAL, Country.BRAZIL, Country.ANGOLA, Country.MOZAMBIQUE),
    otherTerritories = listOf(Country.GUINEA_BISSAU, Country.CAPE_VERDE, Country.SAO_TOME_AND_PRINCE, Country.MACAO),
  ),
  ROMANIAN(
    code = "ro",
    officialTerritories = listOf(Country.ROMANIA, Country.MOLDOVA),
    otherTerritories = emptyList(),
  ),
  RUSSIAN(
    code = "ru",
    officialTerritories = listOf(Country.RUSSIA, Country.BELARUS, Country.KAZAKHSTAN, Country.KYRGYZSTAN),
    otherTerritories = listOf(Country.AZERBAIJAN, Country.ESTONIA, Country.GEORGIA, Country.LATVIA, Country.UKRAINE, Country.LITHUANIA, Country.MOLDOVA, Country.TAJIKISTAN, Country.TURKMENISTAN, Country.UZBEKISTAN, Country.ISRAEL),
  ),
  SERBIAN(
    code = "sr",
    officialTerritories = listOf(Country.SERBIA),
    otherTerritories = listOf(Country.CROATIA, Country.BOSNIA_AND_HERZEGOVINA, Country.MONTENEGRO),
  ),
  SLOVAK(
    code = "sk",
    officialTerritories = listOf(Country.SLOVAKIA),
    otherTerritories = listOf(Country.SERBIA, Country.CZECHIA, Country.HUNGARY, Country.POLAND, Country.ROMANIA, Country.UKRAINE),
  ),
  SLOVENIAN(
    code = "sl",
    officialTerritories = listOf(Country.SLOVENIA),
    otherTerritories = listOf(Country.AUSTRIA, Country.ITALY),
  ),
  SPANISH(
    code = "es",
    officialTerritories = listOf(Country.SPAIN, Country.MEXICO, Country.COLOMBIA, Country.ARGENTINA, Country.CHILE, Country.NICARAGUA, Country.URUGUAY, Country.EQUATORIAL_GUINEA, Country.PANAMA, Country.COSTA_RICA, Country.EL_SALVADOR, Country.PARAGUAY, Country.HONDURAS, Country.DOMINICAN_REPUBLIC, Country.CUBA, Country.BOLIVIA, Country.ECUADOR, Country.GUATEMALA, Country.VENEZUELA, Country.PERU, Country.PARAGUAY, Country.BOLIVIA, Region.CANARY_ISLANDS, Region.LATIN_AMERICA),
    otherTerritories = listOf(Country.USA, Country.BELIZE, Country.ANDORRA, Country.GIBRALTAR),
  ),
  SWEDISH(
    code = "sv",
    officialTerritories = listOf(Country.SWEDEN, Country.FINLAND),
    otherTerritories = listOf(Country.ESTONIA, Country.LATVIA),
  ),
  TAMIL(
    code = "ta",
    officialTerritories = listOf(Country.INDIA),
    otherTerritories = emptyList(),
  ),
  TAGALOG(
    code = "tl",
    officialTerritories = listOf(Country.PHILIPPINES),
    otherTerritories = emptyList(),
  ),
  TELUGU(
    code = "te",
    officialTerritories = listOf(Country.INDIA),
    otherTerritories = emptyList(),
  ),
  THAI(
    code = "th",
    officialTerritories = listOf(Country.THAILAND),
    otherTerritories = emptyList(),
  ),
  TURKISH(
    code = "tr",
    officialTerritories = listOf(Country.TURKEY),
    otherTerritories = emptyList(),
  ),
  UKRAINIAN(
    code = "uk",
    officialTerritories = listOf(Country.UKRAINE),
    otherTerritories = listOf(Country.KAZAKHSTAN, Country.MOLDOVA, Country.POLAND, Country.ROMANIA, Country.LITHUANIA, Country.SLOVAKIA),
  ),
  URDU(
    code = "ur",
    officialTerritories = listOf(Country.PAKISTAN),
    otherTerritories = listOf(),
  ),
  UZBEK(
    code = "uz",
    officialTerritories = listOf(Country.UZBEKISTAN),
    otherTerritories = listOf(Country.KAZAKHSTAN, Country.KYRGYZSTAN, Country.TAJIKISTAN, Country.TURKMENISTAN),
  ),
  VIETNAMESE(
    code = "vi",
    officialTerritories = listOf(Country.VIETNAM),
    otherTerritories = emptyList(),
  ),
  ;

  val defaultCountry = officialTerritories.first()

  companion object {
    fun from(identifier: String): Language =
      requireNotNull(fromOrNull(identifier)) { "Can't get language from $identifier" }

    fun fromOrNull(identifier: String?): Language? =
      entries.firstOrNull { it.code.equals(identifier, ignoreCase = true) || it.legacyCode?.equals(identifier, ignoreCase = true) == true }

    fun fromLocale(locale: String): Language =
      requireNotNull(fromLocaleOrNull(locale)) { "Can't get language from $locale" }

    fun fromLocaleOrNull(locale: String?): Language? =
      fromOrNull(localeSplit(locale).getOrNull(0))
  }
}

/** Returns the display name of [Language] in the current language. */
expect fun Language.displayName(): String
