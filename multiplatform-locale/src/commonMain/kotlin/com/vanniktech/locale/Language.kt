package com.vanniktech.locale

enum class Language(
  /** ISO 639-1 code - https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes */
  val identifier: String,
  /** [HEBREW] & [INDONESIAN] changed their identifier. We are backwards compatible and support both. */
  val legacyIdentifier: String? = null,
  /** Countries, where this language is officially spoken in. */
  val officialCountries: List<Country>,
  /** Countries, where this language is spoken in. */
  val otherCountries: List<Country>,
) {
  ARABIC(
    identifier = "ar",
    officialCountries = listOf(Country.SAUDI_ARABIA, Country.ALGERIA, Country.BAHRAIN, Country.MALI, Country.NIGER, Country.SENEGAL, Country.CHAD, Country.COMOROS, Country.DJIBOUTI, Country.EGYPT, Country.IRAQ, Country.JORDAN, Country.KUWAIT, Country.LEBANON, Country.LIBYA, Country.MAURITANIA, Country.MOROCCO, Country.OMAN, Country.QATAR, Country.SOMALIA, Country.SUDAN, Country.SYRIA, Country.TUNISIA, Country.UNITED_ARAB_EMIRATES, Country.YEMEN),
    otherCountries = listOf(Country.PALESTINE, Country.SOMALIA, Country.SAHRAWI_ARAB_DEMOCRATIC_REPUBLIC, Country.TANZANIA),
  ),
  BULGARIAN(
    identifier = "bg",
    officialCountries = listOf(Country.BULGARIA),
    otherCountries = listOf(Country.GREECE, Country.ROMANIA, Country.MOLDOVA, Country.UKRAINE),
  ),
  CHINESE(
    identifier = "zh",
    officialCountries = listOf(Country.CHINA, Country.TAIWAN, Country.HONG_KONG, Country.SINGAPORE),
    otherCountries = emptyList(),
  ),
  CZECH(
    identifier = "cs",
    officialCountries = listOf(Country.CZECHIA),
    otherCountries = listOf(Country.POLAND, Country.SERBIA, Country.UKRAINE, Country.SLOVAKIA, Country.BULGARIA, Country.AUSTRIA),
  ),
  DANISH(
    identifier = "da",
    officialCountries = listOf(Country.DENMARK, Country.GREENLAND, Country.FAROE_ISLANDS),
    otherCountries = emptyList(),
  ),
  DUTCH(
    identifier = "nl",
    officialCountries = listOf(Country.NETHERLANDS, Country.BELGIUM, Country.SURINAME, Country.ARUBA, Country.CURACAO, Country.SINT_MAARTEN),
    otherCountries = emptyList(),
  ),
  ENGLISH(
    identifier = "en",
    officialCountries = listOf(Country.USA, Country.CANADA, Country.AUSTRALIA, Country.ENGLAND, Country.NEW_ZEALAND, Country.CHRISTMAS_ISLAND, Country.COCOS_ISLANDS, Country.TOKELAU, Country.BRITISH_INDIAN_OCEAN_TERRITORY, Country.GUERNSEY, Country.MONTSERRAT),
    otherCountries = listOf(Country.BAHRAIN, Country.BANGLADESH, Country.BRUNEI, Country.CYPRUS, Country.ERITREA, Country.ETHIOPIA, Country.GREENLAND, Country.ICELAND, Country.ISRAEL, Country.JORDAN, Country.KUWAIT, Country.MALAYSIA, Country.MALDIVES, Country.MYANMAR, Country.QATAR, Country.SRI_LANKA, Country.UNITED_ARAB_EMIRATES),
  ),
  ESTONIAN(
    identifier = "et",
    officialCountries = listOf(Country.ESTONIA),
    otherCountries = emptyList(),
  ),
  FINISH(
    identifier = "fi",
    officialCountries = listOf(Country.FINLAND, Country.SWEDEN),
    otherCountries = emptyList(),
  ),
  FRENCH(
    identifier = "fr",
    officialCountries = listOf(Country.FRANCE, Country.CANADA, Country.BELGIUM, Country.BENIN, Country.BURKINA_FASO, Country.BURUNDI, Country.CAMEROON, Country.CHAD, Country.COTE_DIVOIRE, Country.DEMOCRATIC_REPUBLIC_OF_CONGO, Country.DJIBOUTI, Country.EQUATORIAL_GUINEA, Country.HAITI, Country.LUXEMBOURG, Country.MADAGASCAR, Country.MALI, Country.MONACO, Country.NIGER, Country.RWANDA, Country.SENEGAL, Country.SEYCHELLES, Country.SWITZERLAND, Country.TOGO, Country.VANUATU),
    otherCountries = emptyList(),
  ),
  GERMAN(
    identifier = "de",
    officialCountries = listOf(Country.GERMANY, Country.AUSTRIA, Country.BELGIUM, Country.LUXEMBOURG, Country.SWITZERLAND, Country.LIECHTENSTEIN),
    otherCountries = emptyList(),
  ),
  GREEK(
    identifier = "el",
    officialCountries = listOf(Country.GREECE, Country.CYPRUS),
    otherCountries = emptyList(),
  ),
  HEBREW(
    identifier = "he",
    legacyIdentifier = "iw",
    officialCountries = listOf(Country.ISRAEL),
    otherCountries = emptyList(),
  ),
  HUNGARIAN(
    identifier = "hu",
    officialCountries = listOf(Country.HUNGARY),
    otherCountries = listOf(Country.ROMANIA, Country.SLOVAKIA, Country.SERBIA, Country.AUSTRIA, Country.SLOVENIA),
  ),
  INDONESIAN(
    identifier = "id",
    legacyIdentifier = "in",
    officialCountries = listOf(Country.INDONESIA),
    otherCountries = emptyList(),
  ),
  ITALIAN(
    identifier = "it",
    officialCountries = listOf(Country.ITALY, Country.SAN_MARINO, Country.SWITZERLAND, Country.VATICAN_CITY),
    otherCountries = listOf(Country.CROATIA, Country.SLOVENIA, Country.AUSTRIA),
  ),
  JAPANESE(
    identifier = "ja",
    officialCountries = listOf(Country.JAPAN),
    otherCountries = emptyList(),
  ),
  KOREAN(
    identifier = "ko",
    officialCountries = listOf(Country.SOUTH_KOREA, Country.NORTH_KOREA),
    otherCountries = emptyList(),
  ),
  LATVIAN(
    identifier = "lv",
    officialCountries = listOf(Country.LATVIA),
    otherCountries = emptyList(),
  ),
  LITHUANIAN(
    identifier = "lt",
    officialCountries = listOf(Country.LITHUANIA),
    otherCountries = emptyList(),
  ),
  NORWEGIAN(
    identifier = "no",
    officialCountries = listOf(Country.NORWAY),
    otherCountries = emptyList(),
  ),
  POLISH(
    identifier = "pl",
    officialCountries = listOf(Country.POLAND),
    otherCountries = emptyList(),
  ),
  PORTUGUESE(
    identifier = "pt",
    officialCountries = listOf(Country.PORTUGAL, Country.BRAZIL, Country.ANGOLA, Country.MOZAMBIQUE),
    otherCountries = listOf(Country.GUINEA_BISSAU, Country.CAPE_VERDE, Country.SAO_TOME_AND_PRINCE, Country.MACAO),
  ),
  ROMANIAN(
    identifier = "ro",
    officialCountries = listOf(Country.ROMANIA, Country.MOLDOVA),
    otherCountries = emptyList(),
  ),
  RUSSIAN(
    identifier = "ru",
    officialCountries = listOf(Country.RUSSIA, Country.BELARUS, Country.KAZAKHSTAN, Country.KYRGYZSTAN),
    otherCountries = listOf(Country.AZERBAIJAN, Country.ESTONIA, Country.GEORGIA, Country.LATVIA, Country.UKRAINE, Country.LITHUANIA, Country.MOLDOVA, Country.TAJIKISTAN, Country.TURKMENISTAN, Country.UZBEKISTAN, Country.ISRAEL),
  ),
  SERBIAN(
    identifier = "sr",
    officialCountries = listOf(Country.SERBIA),
    otherCountries = listOf(Country.CROATIA, Country.BOSNIA_AND_HERZEGOVINA, Country.MONTENEGRO),
  ),
  SLOVAK(
    identifier = "sk",
    officialCountries = listOf(Country.SLOVAKIA),
    otherCountries = listOf(Country.SERBIA, Country.CZECHIA, Country.HUNGARY, Country.POLAND, Country.ROMANIA, Country.UKRAINE),
  ),
  SLOVENIAN(
    identifier = "sl",
    officialCountries = listOf(Country.SLOVENIA),
    otherCountries = listOf(Country.AUSTRIA, Country.ITALY),
  ),
  SPANISH(
    identifier = "es",
    officialCountries = listOf(Country.SPAIN, Country.MEXICO, Country.COLOMBIA, Country.ARGENTINA, Country.CHILE, Country.NICARAGUA, Country.URUGUAY, Country.EQUATORIAL_GUINEA, Country.PANAMA, Country.COSTA_RICA, Country.EL_SALVADOR, Country.PARAGUAY, Country.HONDURAS, Country.DOMINICAN_REPUBLIC, Country.CUBA, Country.BOLIVIA, Country.ECUADOR, Country.GUATEMALA, Country.VENEZUELA, Country.PERU, Country.PARAGUAY, Country.BOLIVIA),
    otherCountries = listOf(Country.USA, Country.BELIZE, Country.ANDORRA, Country.GIBRALTAR),
  ),
  SWEDISH(
    identifier = "sv",
    officialCountries = listOf(Country.SWEDEN, Country.FINLAND),
    otherCountries = listOf(Country.ESTONIA, Country.LATVIA),
  ),
  TURKISH(
    identifier = "tr",
    officialCountries = listOf(Country.TURKEY),
    otherCountries = emptyList(),
  ),
  UKRAINIAN(
    identifier = "uk",
    officialCountries = listOf(Country.UKRAINE),
    otherCountries = listOf(Country.KAZAKHSTAN, Country.MOLDOVA, Country.POLAND, Country.ROMANIA, Country.LITHUANIA, Country.SLOVAKIA),
  ),
  VIETNAMESE(
    identifier = "vi",
    officialCountries = listOf(Country.VIETNAM),
    otherCountries = emptyList(),
  ),
  ;

  val defaultCountry = officialCountries.first()

  companion object {
    fun from(identifier: String): Language =
      requireNotNull(fromOrNull(identifier)) { "Can't get language from $identifier" }

    fun fromOrNull(identifier: String?): Language? =
      values().firstOrNull { it.identifier.equals(identifier, ignoreCase = true) || it.legacyIdentifier?.equals(identifier, ignoreCase = true) == true }

    fun fromLocale(locale: String): Language =
      requireNotNull(fromLocaleOrNull(locale)) { "Can't get language from $locale" }

    fun fromLocaleOrNull(locale: String?): Language? =
      fromOrNull(localeSplit(locale).getOrNull(0))
  }
}

/** Returns the display name of [Language] in the current language. */
expect fun Language.displayName(): String
