package com.vanniktech.locale

import kotlin.test.Test
import kotlin.test.assertEquals

class CountryTest {
  @Test fun displayName() {
    assertEquals(expected = "United Kingdom", actual = Country.ENGLAND.displayName())
    assertEquals(expected = "Germany", actual = Country.GERMANY.displayName())
    assertEquals(expected = "International Waters", actual = Country.INTERNATIONAL_WATERS.displayName())
  }

  @Test fun fromOrNull() {
    assertEquals(expected = null, actual = Country.fromOrNull("xxx"))
    assertEquals(expected = null, actual = Country.fromOrNull(null))
    assertEquals(expected = Country.ARMENIA, actual = Country.fromOrNull("AM"))
    assertEquals(expected = Country.ARMENIA, actual = Country.fromOrNull("am"))
    assertEquals(expected = Country.USA, actual = Country.fromOrNull("US"))
    assertEquals(expected = null, actual = Country.fromOrNull("USA"))
  }

  @Test fun fromLocaleOrNull() {
    assertEquals(expected = Country.USA, actual = Country.fromLocaleOrNull("de-US"))
    assertEquals(expected = Country.USA, actual = Country.fromLocaleOrNull("en-US"))
    assertEquals(expected = Country.USA, actual = Country.fromLocaleOrNull("de_US"))
    assertEquals(expected = Country.USA, actual = Country.fromLocaleOrNull("en_US"))
    assertEquals(expected = null, actual = Country.fromLocaleOrNull("en"))
    assertEquals(expected = null, actual = Country.fromLocaleOrNull("de"))
    assertEquals(expected = null, actual = Country.fromLocaleOrNull(""))
    assertEquals(expected = null, actual = Country.fromLocaleOrNull(null))
  }

  @Test fun fromLenientOrNull() {
    assertEquals(expected = null, actual = Country.fromLenientOrNull("xxx"))
    assertEquals(expected = null, actual = Country.fromLenientOrNull(null))
    assertEquals(expected = Country.USA, actual = Country.fromLenientOrNull("US"))
    assertEquals(expected = Country.USA, actual = Country.fromLenientOrNull("us"))
    assertEquals(expected = Country.USA, actual = Country.fromLenientOrNull("USA"))
    assertEquals(expected = Country.USA, actual = Country.fromLenientOrNull("usa"))
    assertEquals(expected = Country.USA, actual = Country.fromLenientOrNull("en-US"))
    assertEquals(expected = Country.GERMANY, actual = Country.fromLenientOrNull("en-DE"))
    assertEquals(expected = Country.VIETNAM, actual = Country.fromLenientOrNull("VIETNAM"))
    assertEquals(expected = Country.ZAMBIA, actual = Country.fromLenientOrNull("zambia"))
  }

  @Test fun country() {
    assertEquals(
      expected = """
AD-ANDORRA
AE-UNITED_ARAB_EMIRATES
AF-AFGHANISTAN
AG-ANTIGUA_AND_BARBUDA
AI-ANGUILLA
AL-ALBANIA
AM-ARMENIA
AO-ANGOLA
AQ-ANTARCTICA
AR-ARGENTINA
AS-AMERICAN_SAMOA
AT-AUSTRIA
AU-AUSTRALIA
AW-ARUBA
AX-ALAND_ISLANDS
AZ-AZERBAIJAN
BA-BOSNIA_AND_HERZEGOVINA
BB-BARBADOS
BD-BANGLADESH
BE-BELGIUM
BF-BURKINA_FASO
BG-BULGARIA
BH-BAHRAIN
BI-BURUNDI
BJ-BENIN
BL-SAINT_BARTS
BM-BERMUDA
BN-BRUNEI
BO-BOLIVIA
BQ-BONAIRE
BR-BRAZIL
BS-BAHAMAS
BT-BHUTAN
BW-BOTSWANA
BY-BELARUS
BZ-BELIZE
CA-CANADA
CC-COCOS_ISLANDS
CD-DEMOCRATIC_REPUBLIC_OF_CONGO
CF-CENTRAL_AFRICAN_REPUBLIC
CG-REPUBLIC_OF_THE_CONGO
CH-SWITZERLAND
CI-COTE_DIVOIRE
CK-COOK_ISLANDS
CL-CHILE
CM-CAMEROON
CN-CHINA
CO-COLOMBIA
CR-COSTA_RICA
CU-CUBA
CV-CAPE_VERDE
CW-CURACAO
CX-CHRISTMAS_ISLAND
CY-CYPRUS
CZ-CZECHIA
DE-GERMANY
DJ-DJIBOUTI
DK-DENMARK
DM-DOMINICA
DO-DOMINICAN_REPUBLIC
DZ-ALGERIA
EC-ECUADOR
EE-ESTONIA
EG-EGYPT
EH-SAHRAWI_ARAB_DEMOCRATIC_REPUBLIC
ER-ERITREA
ES-SPAIN
ET-ETHIOPIA
FI-FINLAND
FJ-FIJI
FK-FALKLAND_ISLANDS
FM-MICRONESIA
FO-FAROE_ISLANDS
FR-FRANCE
GA-GABON
GB-ENGLAND
GD-GRENADA
GE-GEORGIA
GF-FRENCH_GUIANA
GG-GUERNSEY
GH-GHANA
GI-GIBRALTAR
GL-GREENLAND
GM-GAMBIA
GN-GUINEA
GP-GUADELOUPE
GQ-EQUATORIAL_GUINEA
GR-GREECE
GT-GUATEMALA
GU-GUAM
GW-GUINEA_BISSAU
GY-GUYANA
HK-HONG_KONG
HN-HONDURAS
HR-CROATIA
HT-HAITI
HU-HUNGARY
IC-CANARY_ISLANDS
ID-INDONESIA
IE-IRELAND
IL-ISRAEL
IM-ISLE_OF_MAN
IN-INDIA
IO-BRITISH_INDIAN_OCEAN_TERRITORY
IQ-IRAQ
IR-IRAN
IS-ICELAND
IT-ITALY
JE-JERSEY
JM-JAMAICA
JO-JORDAN
JP-JAPAN
KE-KENYA
KG-KYRGYZSTAN
KH-CAMBODIA
KI-KIRIBATI
KM-COMOROS
KN-SAINT_KITTS_AND_NEVIS
KP-NORTH_KOREA
KR-SOUTH_KOREA
KW-KUWAIT
KY-CAYMAN_ISLANDS
KZ-KAZAKHSTAN
LA-LAOS
LB-LEBANON
LC-SAINT_LUCIA
LI-LIECHTENSTEIN
LK-SRI_LANKA
LR-LIBERIA
LS-LESOTHO
LT-LITHUANIA
LU-LUXEMBOURG
LV-LATVIA
LY-LIBYA
MA-MOROCCO
MC-MONACO
MD-MOLDOVA
ME-MONTENEGRO
MG-MADAGASCAR
MH-MARSHALL_ISLAND
MK-NORTH_MACEDONIA
ML-MALI
MM-MYANMAR
MN-MONGOLIA
MO-MACAO
MP-NORTHERN_MARIANA_ISLANDS
MQ-MARTINIQUE
MR-MAURITANIA
MS-MONTSERRAT
MT-MALTA
MU-MAURITIUS
MV-MALDIVES
MW-MALAWI
MX-MEXICO
MY-MALAYSIA
MZ-MOZAMBIQUE
NA-NAMIBIA
NC-NEW_CALEDONIA
NE-NIGER
NF-NORFOLK_ISLAND
NG-NIGERIA
NI-NICARAGUA
NL-NETHERLANDS
NO-NORWAY
NP-NEPAL
NR-NAURU
NU-NIUE
NZ-NEW_ZEALAND
OM-OMAN
PA-PANAMA
PE-PERU
PF-FRENCH_POLYNESIA
PG-PAPUA_NEW_GUINEA
PH-PHILIPPINES
PK-PAKISTAN
PL-POLAND
PN-PITCAIRN_ISLANDS
PR-PUERTO_RICO
PS-PALESTINE
PT-PORTUGAL
PW-PALAU
PY-PARAGUAY
QA-QATAR
RE-REUNION
RO-ROMANIA
RS-SERBIA
RU-RUSSIA
RW-RWANDA
SA-SAUDI_ARABIA
SB-SOLOMON_ISLANDS
SC-SEYCHELLES
SD-SUDAN
SE-SWEDEN
SG-SINGAPORE
SI-SLOVENIA
SK-SLOVAKIA
SL-SIERRA_LEONE
SM-SAN_MARINO
SN-SENEGAL
SO-SOMALIA
SR-SURINAME
SS-SOUTH_SUDAN
ST-SAO_TOME_AND_PRINCE
SV-EL_SALVADOR
SX-SINT_MAARTEN
SY-SYRIA
SZ-ESWATINI
TC-TURKS_AND_CAICOS
TD-CHAD
TG-TOGO
TH-THAILAND
TJ-TAJIKISTAN
TK-TOKELAU
TL-TIMOR_LESTE
TM-TURKMENISTAN
TN-TUNISIA
TO-TONGA
TR-TURKEY
TT-TRINIDAD_AND_TOBAGO
TV-TUVALU
TW-TAIWAN
TZ-TANZANIA
UA-UKRAINE
UG-UGANDA
US-USA
UY-URUGUAY
UZ-UZBEKISTAN
VA-VATICAN_CITY
VC-SAINT_VINCENT_AND_THE_GRENADINES
VE-VENEZUELA
VG-BRITISH_VIRGIN_ISLANDS
VI-US_VIRGIN_ISLANDS
VN-VIETNAM
VU-VANUATU
WF-WALLIS_AND_FUTUNA
WS-SAMOA
XK-KOSOVO
XZ-INTERNATIONAL_WATERS
YE-YEMEN
YT-MAYOTTE
ZA-SOUTH_AFRICA
ZM-ZAMBIA
ZW-ZIMBABWE
      """.trimMargin(),
      actual = Country.values().sortedBy { it.code }.joinToString(separator = "\n") { "${it.code}-${it.name}" },
    )
  }

  @Test fun noDuplicates() {
    val unique = Country.values().map { it.code }.toSet()
    assertEquals(expected = Country.values().size, actual = unique.size)
  }
}
