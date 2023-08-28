package com.vanniktech.locale

enum class Country(
  /** ISO 3166-1 alpha-2 code - https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2 */
  val code: String,
  /** ISO 3166-1 alpha-3 code - https://en.wikipedia.org/wiki/ISO_3166-1_alpha-3 */
  val code3: String,
  /** The flag as an Emoji. */
  val emoji: String,
  /**
   * The calling code that can be used for calling.
   * May contain more than one entry for some rarities.
   * Note that [INTERNATIONAL_WATERS] does not have any calling codes.
   * Table overview: https://en.wikipedia.org/wiki/List_of_country_calling_codes
   */
  val callingCodes: List<String>,
) {
  AFGHANISTAN(code = "AF", code3 = "AFG", emoji = """🇦🇫""", listOf("+93")),
  ALAND_ISLANDS(code = "AX", code3 = "ALA", emoji = """🇦🇽""", listOf("+358")),
  ALBANIA(code = "AL", code3 = "ALB", emoji = """🇦🇱""", listOf("+355")),
  ALGERIA(code = "DZ", code3 = "DZA", emoji = """🇩🇿""", listOf("+213")),
  AMERICAN_SAMOA(code = "AS", code3 = "ASM", emoji = """🇦🇸""", listOf("+1684")),
  ANDORRA(code = "AD", code3 = "AND", emoji = """🇦🇩""", listOf("+376")),
  ANGOLA(code = "AO", code3 = "AGO", emoji = """🇦🇴""", listOf("+244")),
  ANGUILLA(code = "AI", code3 = "AIA", emoji = """🇦🇮""", listOf("+1264")),
  ANTARCTICA(code = "AQ", code3 = "ATA", emoji = """🇦🇶""", listOf("+672")),
  ANTIGUA_AND_BARBUDA(code = "AG", code3 = "ATG", emoji = """🇦🇬""", listOf("+1268")),
  ARGENTINA(code = "AR", code3 = "ARG", emoji = """🇦🇷""", listOf("+54")),
  ARMENIA(code = "AM", code3 = "ARM", emoji = """🇦🇲""", listOf("+374")),
  ARUBA(code = "AW", code3 = "ABW", emoji = """🇦🇼""", listOf("+297")),
  AUSTRALIA(code = "AU", code3 = "AUS", emoji = """🇦🇺""", listOf("+61")),
  AUSTRIA(code = "AT", code3 = "AUT", emoji = """🇦🇹""", listOf("+43")),
  AZERBAIJAN(code = "AZ", code3 = "AZE", emoji = """🇦🇿""", listOf("+994")),
  BAHAMAS(code = "BS", code3 = "BHS", emoji = """🇧🇸""", listOf("+1242")),
  BAHRAIN(code = "BH", code3 = "BHR", emoji = """🇧🇭""", listOf("+973")),
  BANGLADESH(code = "BD", code3 = "BGD", emoji = """🇧🇩""", listOf("+880")),
  BARBADOS(code = "BB", code3 = "BRB", emoji = """🇧🇧""", listOf("+1246")),
  BELARUS(code = "BY", code3 = "BLR", emoji = """🇧🇾""", listOf("+375")),
  BELGIUM(code = "BE", code3 = "BEL", emoji = """🇧🇪""", listOf("+32")),
  BELIZE(code = "BZ", code3 = "BLZ", emoji = """🇧🇿""", listOf("+501")),
  BENIN(code = "BJ", code3 = "BEN", emoji = """🇧🇯""", listOf("+229")),
  BERMUDA(code = "BM", code3 = "BMU", emoji = """🇧🇲""", listOf("+1441")),
  BHUTAN(code = "BT", code3 = "BTN", emoji = """🇧🇹""", listOf("+975")),
  BOLIVIA(code = "BO", code3 = "BOL", emoji = """🇧🇴""", listOf("+591")),
  BONAIRE(code = "BQ", code3 = "BES", emoji = """🇧🇶""", listOf("+599")),
  BOSNIA_AND_HERZEGOVINA(code = "BA", code3 = "BIH", emoji = """🇧🇦""", listOf("+387")),
  BOTSWANA(code = "BW", code3 = "BWA", emoji = """🇧🇼""", listOf("+267")),
  BRAZIL(code = "BR", code3 = "BRA", emoji = """🇧🇷""", listOf("+55")),
  BRITISH_INDIAN_OCEAN_TERRITORY(code = "IO", code3 = "IOT", emoji = """🇮🇴""", listOf("+246")),
  BRITISH_VIRGIN_ISLANDS(code = "VG", code3 = "VGB", emoji = """🇻🇬""", listOf("+1284")),
  BRUNEI(code = "BN", code3 = "BRN", emoji = """🇧🇳""", listOf("+673")),
  BULGARIA(code = "BG", code3 = "BGR", emoji = """🇧🇬""", listOf("+359")),
  BURKINA_FASO(code = "BF", code3 = "BFA", emoji = """🇧🇫""", listOf("+226")),
  BURUNDI(code = "BI", code3 = "BDI", emoji = """🇧🇮""", listOf("+257")),
  CAMBODIA(code = "KH", code3 = "KHM", emoji = """🇰🇭""", listOf("+855")),
  CAMEROON(code = "CM", code3 = "CMR", emoji = """🇨🇲""", listOf("+237")),
  CANADA(code = "CA", code3 = "CAN", emoji = """🇨🇦""", listOf("+1")),
  CANARY_ISLANDS(code = "IC", code3 = "", emoji = """🇮🇨""", listOf("+34")),
  CAPE_VERDE(code = "CV", code3 = "CPV", emoji = """🇨🇻""", listOf("+238")),
  CAYMAN_ISLANDS(code = "KY", code3 = "CYM", emoji = """🇰🇾""", listOf("+345")),
  CENTRAL_AFRICAN_REPUBLIC(code = "CF", code3 = "CAF", emoji = """🇨🇫""", listOf("+236")),
  CHAD(code = "TD", code3 = "TCD", emoji = """🇹🇩""", listOf("+235")),
  CHILE(code = "CL", code3 = "CHL", emoji = """🇨🇱""", listOf("+56")),
  CHINA(code = "CN", code3 = "CHN", emoji = """🇨🇳""", listOf("+86")),
  CHRISTMAS_ISLAND(code = "CX", code3 = "CXR", emoji = """🇨🇽""", listOf("+61")),
  COCOS_ISLANDS(code = "CC", code3 = "CCK", emoji = """🇨🇨""", listOf("+61")),
  COLOMBIA(code = "CO", code3 = "COL", emoji = """🇨🇴""", listOf("+57")),
  COMOROS(code = "KM", code3 = "COM", emoji = """🇰🇲""", listOf("+269")),
  COOK_ISLANDS(code = "CK", code3 = "COK", emoji = """🇨🇰""", listOf("+682")),
  COSTA_RICA(code = "CR", code3 = "CRI", emoji = """🇨🇷""", listOf("+506")),
  COTE_DIVOIRE(code = "CI", code3 = "CIV", emoji = """🇫🇷""", listOf("+225")),
  CROATIA(code = "HR", code3 = "HRV", emoji = """🇭🇷""", listOf("+385")),
  CUBA(code = "CU", code3 = "CUB", emoji = """🇨🇺""", listOf("+53")),
  CURACAO(code = "CW", code3 = "CUW", emoji = """🇨🇼""", listOf("+599")),
  CYPRUS(code = "CY", code3 = "CYP", emoji = """🇨🇾""", listOf("+357")),
  CZECHIA(code = "CZ", code3 = "CZE", emoji = """🇨🇿""", listOf("+420")),
  DEMOCRATIC_REPUBLIC_OF_CONGO(code = "CD", code3 = "COD", emoji = """🇨🇩""", listOf("+243")),
  DENMARK(code = "DK", code3 = "DNK", emoji = """🇩🇰""", listOf("+45")),
  DJIBOUTI(code = "DJ", code3 = "DJI", emoji = """🇩🇯""", listOf("+253")),
  DOMINICA(code = "DM", code3 = "DMA", emoji = """🇩🇲""", listOf("+1767")),
  DOMINICAN_REPUBLIC(code = "DO", code3 = "DOM", emoji = """🇩🇴""", listOf("+1809", "+1829", "+1849")),
  ECUADOR(code = "EC", code3 = "ECU", emoji = """🇪🇨""", listOf("+593")),
  EGYPT(code = "EG", code3 = "EGY", emoji = """🇪🇬""", listOf("+20")),
  EL_SALVADOR(code = "SV", code3 = "SLV", emoji = """🇸🇻""", listOf("+503")),
  ENGLAND(code = "GB", code3 = "GBR", emoji = """🏴󠁧󠁢󠁥󠁮󠁧󠁿󠁧""", listOf("+44")),
  EQUATORIAL_GUINEA(code = "GQ", code3 = "GNQ", emoji = """🇬🇶""", listOf("+240")),
  ERITREA(code = "ER", code3 = "ERI", emoji = """🇪🇷""", listOf("+291")),
  ESTONIA(code = "EE", code3 = "EST", emoji = """🇪🇪""", listOf("+372")),
  ESWATINI(code = "SZ", code3 = "SWZ", emoji = """🇸🇿""", listOf("+268")),
  ETHIOPIA(code = "ET", code3 = "ETH", emoji = """🇪🇹""", listOf("+251")),
  FALKLAND_ISLANDS(code = "FK", code3 = "FLK", emoji = """🇫🇰""", listOf("+500")),
  FAROE_ISLANDS(code = "FO", code3 = "FRO", emoji = """🇫🇴""", listOf("+298")),
  FIJI(code = "FJ", code3 = "FJI", emoji = """🇫🇯""", listOf("+679")),
  FINLAND(code = "FI", code3 = "FIN", emoji = """🇫🇮""", listOf("+358")),
  FRANCE(code = "FR", code3 = "FRA", emoji = """🇫🇷""", listOf("+33")),
  FRENCH_GUIANA(code = "GF", code3 = "GUF", emoji = """🇬🇫""", listOf("+594")),
  FRENCH_POLYNESIA(code = "PF", code3 = "PYF", emoji = """🇵🇫""", listOf("+689")),
  FRENCH_SOUTHERN_AND_ANTARCTIC_LANDS(code = "TF", code3 = "ATF", emoji = """🇹🇫""", listOf("+33")),
  GABON(code = "GA", code3 = "GAB", emoji = """🇬🇦""", listOf("+241")),
  GAMBIA(code = "GM", code3 = "GMB", emoji = """🇬🇲""", listOf("+220")),
  GEORGIA(code = "GE", code3 = "GEO", emoji = """🇬🇪""", listOf("+995")),
  GERMANY(code = "DE", code3 = "DEU", emoji = """🇩🇪""", listOf("+49")),
  GHANA(code = "GH", code3 = "GHA", emoji = """🇬🇭""", listOf("+233")),
  GIBRALTAR(code = "GI", code3 = "GIB", emoji = """🇬🇮""", listOf("+350")),
  GREECE(code = "GR", code3 = "GRC", emoji = """🇬🇷""", listOf("+30")),
  GREENLAND(code = "GL", code3 = "GRL", emoji = """🇬🇱""", listOf("+299")),
  GRENADA(code = "GD", code3 = "GRD", emoji = """🇬🇩""", listOf("+1473")),
  GUADELOUPE(code = "GP", code3 = "GLP", emoji = """🇬🇵""", listOf("+590")),
  GUAM(code = "GU", code3 = "GUM", emoji = """🇬🇺""", listOf("+1671")),
  GUATEMALA(code = "GT", code3 = "GTM", emoji = """🇬🇹""", listOf("+502")),
  GUERNSEY(code = "GG", code3 = "GGY", emoji = """🇬🇬""", listOf("+44")),
  GUINEA(code = "GN", code3 = "GIN", emoji = """🇬🇳""", listOf("+224")),
  GUINEA_BISSAU(code = "GW", code3 = "GNB", emoji = """🇬🇼""", listOf("+245")),
  GUYANA(code = "GY", code3 = "GUY", emoji = """🇬🇾""", listOf("+592")),
  HAITI(code = "HT", code3 = "HTI", emoji = """🇭🇹""", listOf("+509")),
  HONDURAS(code = "HN", code3 = "HND", emoji = """🇭🇳""", listOf("+504")),
  HONG_KONG(code = "HK", code3 = "HKG", emoji = """🇭🇰""", listOf("+852")),
  HUNGARY(code = "HU", code3 = "HUN", emoji = """🇭🇺""", listOf("+36")),
  ICELAND(code = "IS", code3 = "ISL", emoji = """🇮🇸""", listOf("+354")),
  INDIA(code = "IN", code3 = "IND", emoji = """🇮🇳""", listOf("+91")),
  INDONESIA(code = "ID", code3 = "IDN", emoji = """🇮🇩""", listOf("+62")),
  INTERNATIONAL_WATERS(code = "XZ", code3 = "XZZ", emoji = """🌊""", listOf()), // https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#User-assigned_code_elemen
  IRAN(code = "IR", code3 = "IRN", emoji = """🇮🇷""", listOf("+98")),
  IRAQ(code = "IQ", code3 = "IRQ", emoji = """🇮🇶""", listOf("+964")),
  IRELAND(code = "IE", code3 = "IRL", emoji = """🇮🇪""", listOf("+353")),
  ISLE_OF_MAN(code = "IM", code3 = "IMN", emoji = """🇮🇲""", listOf("+44")),
  ISRAEL(code = "IL", code3 = "ISR", emoji = """🇮🇱""", listOf("+972")),
  ITALY(code = "IT", code3 = "ITA", emoji = """🇮🇹""", listOf("+39")),
  JAMAICA(code = "JM", code3 = "JAM", emoji = """🇯🇲""", listOf("+1658", "+1876")),
  JAPAN(code = "JP", code3 = "JPN", emoji = """🇯🇵""", listOf("+81")),
  JERSEY(code = "JE", code3 = "JEY", emoji = """🇯🇪""", listOf("+44")),
  JORDAN(code = "JO", code3 = "JOR", emoji = """🇯🇴""", listOf("+962")),
  KAZAKHSTAN(code = "KZ", code3 = "KAZ", emoji = """🇰🇿""", listOf("+77")),
  KENYA(code = "KE", code3 = "KEN", emoji = """🇰🇪""", listOf("+254")),
  KIRIBATI(code = "KI", code3 = "KIR", emoji = """🇰🇮""", listOf("+686")),
  KOSOVO(code = "XK", code3 = "UNK", emoji = """🇽🇰""", listOf("+383")),
  KUWAIT(code = "KW", code3 = "KWT", emoji = """🇰🇼""", listOf("+965")),
  KYRGYZSTAN(code = "KG", code3 = "KGZ", emoji = """🇰🇬""", listOf("+996")),
  LAOS(code = "LA", code3 = "LAO", emoji = """🇱🇦""", listOf("+856")),
  LATVIA(code = "LV", code3 = "LVA", emoji = """🇱🇻""", listOf("+371")),
  LEBANON(code = "LB", code3 = "LBN", emoji = """🇱🇧""", listOf("+961")),
  LESOTHO(code = "LS", code3 = "LSO", emoji = """🇱🇸""", listOf("+266")),
  LIBERIA(code = "LR", code3 = "LBR", emoji = """🇱🇷""", listOf("+231")),
  LIBYA(code = "LY", code3 = "LBY", emoji = """🇱🇾""", listOf("+218")),
  LIECHTENSTEIN(code = "LI", code3 = "LIE", emoji = """🇱🇮""", listOf("+423")),
  LITHUANIA(code = "LT", code3 = "LTU", emoji = """🇱🇹""", listOf("+370")),
  LUXEMBOURG(code = "LU", code3 = "LUX", emoji = """🇱🇺""", listOf("+352")),
  MACAO(code = "MO", code3 = "MAC", emoji = """🇲🇴""", listOf("+853")),
  MADAGASCAR(code = "MG", code3 = "MDG", emoji = """🇲🇬""", listOf("+261")),
  MALAWI(code = "MW", code3 = "MWI", emoji = """🇲🇼""", listOf("+265")),
  MALAYSIA(code = "MY", code3 = "MYS", emoji = """🇲🇾""", listOf("+60")),
  MALDIVES(code = "MV", code3 = "MDV", emoji = """🇲🇻""", listOf("+960")),
  MALI(code = "ML", code3 = "MLI", emoji = """🇲🇱""", listOf("+223")),
  MALTA(code = "MT", code3 = "MLT", emoji = """🇲🇹""", listOf("+356")),
  MARSHALL_ISLAND(code = "MH", code3 = "MHL", emoji = """🇲🇭""", listOf("+692")),
  MARTINIQUE(code = "MQ", code3 = "MTQ", emoji = """🇲🇶""", listOf("+596")),
  MAURITANIA(code = "MR", code3 = "MRT", emoji = """🇲🇷""", listOf("+222")),
  MAURITIUS(code = "MU", code3 = "MUS", emoji = """🇲🇺""", listOf("+230")),
  MAYOTTE(code = "YT", code3 = "MYT", emoji = """🇾🇹""", listOf("+262")),
  MEXICO(code = "MX", code3 = "MEX", emoji = """🇲🇽""", listOf("+52")),
  MICRONESIA(code = "FM", code3 = "FSM", emoji = """🇫🇲""", listOf("+691")),
  MOLDOVA(code = "MD", code3 = "MDA", emoji = """🇲🇩""", listOf("+373")),
  MONACO(code = "MC", code3 = "MCO", emoji = """🇲🇨""", listOf("+377")),
  MONGOLIA(code = "MN", code3 = "MNG", emoji = """🇲🇳""", listOf("+976")),
  MONTENEGRO(code = "ME", code3 = "MNE", emoji = """🇲🇪""", listOf("+382")),
  MONTSERRAT(code = "MS", code3 = "MSR", emoji = """🇲🇸""", listOf("+1664")),
  MOROCCO(code = "MA", code3 = "MAR", emoji = """🇲🇦""", listOf("+212")),
  MOZAMBIQUE(code = "MZ", code3 = "MOZ", emoji = """🇲🇿""", listOf("+258")),
  MYANMAR(code = "MM", code3 = "MMR", emoji = """🇲🇲""", listOf("+95")),
  NAMIBIA(code = "NA", code3 = "NAM", emoji = """🇳🇦""", listOf("+264")),
  NAURU(code = "NR", code3 = "NRU", emoji = """🇳🇷""", listOf("+674")),
  NEPAL(code = "NP", code3 = "NPL", emoji = """🇳🇵""", listOf("+977")),
  NETHERLANDS(code = "NL", code3 = "NLD", emoji = """🇳🇱""", listOf("+31")),
  NEW_CALEDONIA(code = "NC", code3 = "NCL", emoji = """🇳🇨""", listOf("+687")),
  NEW_ZEALAND(code = "NZ", code3 = "NZL", emoji = """🇳🇿""", listOf("+64")),
  NICARAGUA(code = "NI", code3 = "NIC", emoji = """🇳🇮""", listOf("+505")),
  NIGER(code = "NE", code3 = "NER", emoji = """🇳🇪""", listOf("+227")),
  NIGERIA(code = "NG", code3 = "NGA", emoji = """🇳🇬""", listOf("+234")),
  NIUE(code = "NU", code3 = "NIU", emoji = """🇳🇺""", listOf("+683")),
  NORFOLK_ISLAND(code = "NF", code3 = "NFK", emoji = """🇳🇫""", listOf("+672")),
  NORTHERN_MARIANA_ISLANDS(code = "MP", code3 = "MNP", emoji = """🇲🇵""", listOf("+1670")),
  NORTH_KOREA(code = "KP", code3 = "PRK", emoji = """🇰🇵""", listOf("+850")),
  NORTH_MACEDONIA(code = "MK", code3 = "MKD", emoji = """🇲🇰""", listOf("+389")),
  NORWAY(code = "NO", code3 = "NOR", emoji = """🇳🇴""", listOf("+47")),
  OMAN(code = "OM", code3 = "OMN", emoji = """🇴🇲""", listOf("+968")),
  PAKISTAN(code = "PK", code3 = "PAK", emoji = """🇵🇰""", listOf("+92")),
  PALAU(code = "PW", code3 = "PLW", emoji = """🇵🇼""", listOf("+680")),
  PALESTINE(code = "PS", code3 = "PSE", emoji = """🇵🇸""", listOf("+970")),
  PANAMA(code = "PA", code3 = "PAN", emoji = """🇵🇦""", listOf("+507")),
  PAPUA_NEW_GUINEA(code = "PG", code3 = "PNG", emoji = """🇵🇬""", listOf("+675")),
  PARAGUAY(code = "PY", code3 = "PRY", emoji = """🇵🇾""", listOf("+595")),
  PERU(code = "PE", code3 = "PER", emoji = """🇵🇾""", listOf("+51")),
  PHILIPPINES(code = "PH", code3 = "PHL", emoji = """🇵🇭""", listOf("+63")),
  PITCAIRN_ISLANDS(code = "PN", code3 = "PCN", emoji = """🇵🇳""", listOf("+872")),
  POLAND(code = "PL", code3 = "POL", emoji = """🇵🇱""", listOf("+48")),
  PORTUGAL(code = "PT", code3 = "PRT", emoji = """🇵🇹""", listOf("+351")),
  PUERTO_RICO(code = "PR", code3 = "PRI", emoji = """🇵🇷""", listOf("+1787", "+1939")),
  QATAR(code = "QA", code3 = "QAT", emoji = """🇶🇦""", listOf("+974")),
  REPUBLIC_OF_THE_CONGO(code = "CG", code3 = "COG", emoji = """🇨🇬""", listOf("+242")),
  REUNION(code = "RE", code3 = "REU", emoji = """🇷🇪""", listOf("+262")),
  ROMANIA(code = "RO", code3 = "ROU", emoji = """🇷🇴""", listOf("+40")),
  RUSSIA(code = "RU", code3 = "RUS", emoji = """🇷🇺""", listOf("+7")),
  RWANDA(code = "RW", code3 = "RWA", emoji = """🇷🇼""", listOf("+250")),
  SAHRAWI_ARAB_DEMOCRATIC_REPUBLIC(code = "EH", code3 = "ESH", emoji = """🇪🇭""", listOf("+212")),
  SAINT_BARTS(code = "BL", code3 = "BLM", emoji = """🇧🇱""", listOf("+590")),
  SAINT_HELENA_ASCENSION_AND_TRISTAN_DA_CUNHA(code = "SH", code3 = "SHN", emoji = """🇸🇭""", listOf("+290")),
  SAINT_KITTS_AND_NEVIS(code = "KN", code3 = "KNA", emoji = """🇰🇳""", listOf("+1869")),
  SAINT_LUCIA(code = "LC", code3 = "LCA", emoji = """🇱🇨""", listOf("+1758")),
  SAINT_MARTIN(code = "MF", code3 = "MAF", emoji = """🇲🇫""", listOf("+590")),
  SAINT_PIERRE_AND_MIQUELON(code = "PM", code3 = "SPM", emoji = """🇵🇲""", listOf("+508")),
  SAINT_VINCENT_AND_THE_GRENADINES(code = "VC", code3 = "VCT", emoji = """🇻🇨""", listOf("+1784")),
  SAMOA(code = "WS", code3 = "WSM", emoji = """🇼🇸""", listOf("+685")),
  SAN_MARINO(code = "SM", code3 = "SMR", emoji = """🇸🇲""", listOf("+378")),
  SAO_TOME_AND_PRINCE(code = "ST", code3 = "STP", emoji = """🇸🇹""", listOf("+239")),
  SAUDI_ARABIA(code = "SA", code3 = "SAU", emoji = """🇸🇦""", listOf("+966")),
  SENEGAL(code = "SN", code3 = "SEN", emoji = """🇸🇳""", listOf("+221")),
  SERBIA(code = "RS", code3 = "SRB", emoji = """🇷🇸""", listOf("+381")),
  SEYCHELLES(code = "SC", code3 = "SYC", emoji = """🇸🇨""", listOf("+248")),
  SIERRA_LEONE(code = "SL", code3 = "SLE", emoji = """🇸🇱""", listOf("+232")),
  SINGAPORE(code = "SG", code3 = "SGP", emoji = """🇸🇬""", listOf("+65")),
  SINT_MAARTEN(code = "SX", code3 = "SXM", emoji = """🇸🇽""", listOf("+721")),
  SLOVAKIA(code = "SK", code3 = "SVK", emoji = """🇸🇰""", listOf("+421")),
  SLOVENIA(code = "SI", code3 = "SVN", emoji = """🇸🇮""", listOf("+386")),
  SOLOMON_ISLANDS(code = "SB", code3 = "SLB", emoji = """🇸🇧""", listOf("+677")),
  SOMALIA(code = "SO", code3 = "SOM", emoji = """🇸🇴""", listOf("+252")),
  SOUTH_AFRICA(code = "ZA", code3 = "ZAF", emoji = """🇿🇦""", listOf("+27")),
  SOUTH_GEORGIA_AND_THE_SOUTH_SANDWICH_ISLANDS(code = "GS", code3 = "SGS", emoji = """🇬🇸""", listOf("+500")),
  SOUTH_KOREA(code = "KR", code3 = "KOR", emoji = """🇰🇷""", listOf("+82")),
  SOUTH_SUDAN(code = "SS", code3 = "SSD", emoji = """🇸🇸""", listOf("+211")),
  SPAIN(code = "ES", code3 = "ESP", emoji = """🇪🇸""", listOf("+34")),
  SRI_LANKA(code = "LK", code3 = "LKA", emoji = """🇱🇰""", listOf("+94")),
  SUDAN(code = "SD", code3 = "SDN", emoji = """🇸🇩""", listOf("+249")),
  SURINAME(code = "SR", code3 = "SUR", emoji = """🇸🇷""", listOf("+597")),
  SVALBARD_AND_JAN_MAYEN(code = "SJ", code3 = "SJM", emoji = """🇸🇯""", listOf("+47")),
  SWEDEN(code = "SE", code3 = "SWE", emoji = """🇸🇪""", listOf("+46")),
  SWITZERLAND(code = "CH", code3 = "CHE", emoji = """🇨🇭""", listOf("+41")),
  SYRIA(code = "SY", code3 = "SYR", emoji = """🇸🇾""", listOf("+963")),
  TAIWAN(code = "TW", code3 = "TWN", emoji = """🇹🇼""", listOf("+886")),
  TAJIKISTAN(code = "TJ", code3 = "TJK", emoji = """🇹🇯""", listOf("+992")),
  TANZANIA(code = "TZ", code3 = "TZA", emoji = """🇹🇿""", listOf("+255")),
  THAILAND(code = "TH", code3 = "THA", emoji = """🇹🇭""", listOf("+66")),
  TIMOR_LESTE(code = "TL", code3 = "TLS", emoji = """🇹🇱""", listOf("+670")),
  TOGO(code = "TG", code3 = "TGO", emoji = """🇹🇬""", listOf("+228")),
  TOKELAU(code = "TK", code3 = "TKL", emoji = """🇹🇰""", listOf("+690")),
  TONGA(code = "TO", code3 = "TON", emoji = """🇹🇴""", listOf("+676")),
  TRINIDAD_AND_TOBAGO(code = "TT", code3 = "TTO", emoji = """🇹🇹""", listOf("+1868")),
  TUNISIA(code = "TN", code3 = "TUN", emoji = """🇹🇳""", listOf("+216")),
  TURKEY(code = "TR", code3 = "TUR", emoji = """🇹🇷""", listOf("+90")),
  TURKMENISTAN(code = "TM", code3 = "TKM", emoji = """🇹🇲""", listOf("+993")),
  TURKS_AND_CAICOS(code = "TC", code3 = "TCA", emoji = """🇹🇨""", listOf("+1649")),
  TUVALU(code = "TV", code3 = "TUV", emoji = """🇹🇻""", listOf("+688")),
  UGANDA(code = "UG", code3 = "UGA", emoji = """🇺🇬""", listOf("+256")),
  UKRAINE(code = "UA", code3 = "UKR", emoji = """🇺🇦""", listOf("+380")),
  UNITED_ARAB_EMIRATES(code = "AE", code3 = "ARE", emoji = """🇦🇪""", listOf("+971")),
  URUGUAY(code = "UY", code3 = "URY", emoji = """🇺🇾""", listOf("+598")),
  USA(code = "US", code3 = "USA", emoji = """🇺🇸""", listOf("+1")),
  US_VIRGIN_ISLANDS(code = "VI", code3 = "VIR", emoji = """🇻🇮""", listOf("+1340")),
  UZBEKISTAN(code = "UZ", code3 = "UZB", emoji = """🇺🇿""", listOf("+998")),
  VANUATU(code = "VU", code3 = "VUT", emoji = """🇻🇺""", listOf("+678")),
  VATICAN_CITY(code = "VA", code3 = "VAT", emoji = """🇻🇦""", listOf("+379")),
  VENEZUELA(code = "VE", code3 = "VEN", emoji = """🇻🇪""", listOf("+58")),
  VIETNAM(code = "VN", code3 = "VNM", emoji = """🇻🇳""", listOf("+84")),
  WALLIS_AND_FUTUNA(code = "WF", code3 = "WLF", emoji = """🇼🇫""", listOf("+681")),
  YEMEN(code = "YE", code3 = "YEM", emoji = """🇾🇪""", listOf("+967")),
  ZAMBIA(code = "ZM", code3 = "ZMB", emoji = """🇿🇲""", listOf("+260")),
  ZIMBABWE(code = "ZW", code3 = "ZWE", emoji = """🇿🇼""", listOf("+263")),
  ;

  companion object {
    fun fromOrNull(identifier: String?) = when {
      identifier.isNullOrBlank() -> null
      else -> values().firstOrNull { it.code.equals(identifier, ignoreCase = true) || it.code3.equals(identifier, ignoreCase = true) }
    }

    fun fromLocaleOrNull(locale: String?): Country? {
      val splits = localeSplit(locale)
      return fromOrNull(splits.getOrNull(1))
    }

    /** Tries every possible combination that I know to somehow get a meaningful country. */
    fun fromLenientOrNull(string: String?) = values().firstOrNull { it.name.equals(string, ignoreCase = true) }
      ?: fromOrNull(string)
      ?: fromLocaleOrNull(string)
  }
}

/** Returns the display name of [Country] in the current language. */
expect fun Country.displayName(): String
