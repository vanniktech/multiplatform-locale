package com.vanniktech.locale.generator

import com.charleskorn.kaml.Yaml
import com.charleskorn.kaml.YamlConfiguration
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.builtins.MapSerializer
import kotlinx.serialization.builtins.serializer
import okio.FileSystem
import okio.Path.Companion.toPath

fun main() {
  // Adjust the path of the https://github.com/countries/countries repository as needed.
  val path = "/Users/niklas/dev/GitHub/countries/lib/countries/data/countries".toPath()
  val fileSystem = FileSystem.SYSTEM

  val overwrittenNames = mutableMapOf(
    // Names that we want to keep.
    "BOLIVIA_PLURINATIONAL_STATE_OF" to "BOLIVIA",
    "BONAIRE_SINT_EUSTATIUS_AND_SABA" to "BONAIRE",
    "BRUNEI_DARUSSALAM" to "BRUNEI",
    "CURAÇAO" to "CURACAO",
    "CÔTE_DIVOIRE" to "COTE_DIVOIRE",
    "HOLY_SEE" to "VATICAN_CITY",
    "IRAN_ISLAMIC_REPUBLIC_OF" to "IRAN",
    "KOREA_DEMOCRATIC_PEOPLES_REPUBLIC_OF" to "NORTH_KOREA",
    "KOREA_REPUBLIC_OF" to "SOUTH_KOREA",
    "LAO_PEOPLES_DEMOCRATIC_REPUBLIC" to "LAOS",
    "MICRONESIA_FEDERATED_STATES_OF" to "MICRONESIA",
    "MOLDOVA_REPUBLIC_OF" to "MOLDOVA",
    "PALESTINE_STATE_OF" to "PALESTINE",
    "RUSSIAN_FEDERATION" to "RUSSIA",
    "RÉUNION" to "REUNION",
    "SAINT_MARTIN_FRENCH_PART" to "SAINT_MARTIN",
    "SINT_MAARTEN_DUTCH_PART" to "SINT_MAARTEN",
    "SYRIAN_ARAB_REPUBLIC" to "SYRIA",
    "TAIWAN_PROVINCE_OF_CHINA" to "TAIWAN",
    "TANZANIA_UNITED_REPUBLIC_OF" to "TANZANIA",
    "TÜRKIYE" to "TURKEY",
    "UNITED_KINGDOM_OF_GREAT_BRITAIN_AND_NORTHERN_IRELAND" to "ENGLAND",
    "UNITED_STATES_OF_AMERICA" to "USA",
    "VENEZUELA_BOLIVARIAN_REPUBLIC_OF" to "VENEZUELA",
    "VIET_NAM" to "VIETNAM",
    "ÅLAND_ISLANDS" to "ALAND_ISLANDS",

    // Congo.
    "CONGO" to "REPUBLIC_OF_THE_CONGO", // This might be fine.
    "CONGO_DEMOCRATIC_REPUBLIC_OF_THE" to "DEMOCRATIC_REPUBLIC_OF_CONGO", // Should be DEMOCRATIC_REPUBLIC_OF_THE_CONGO.

    // Names that we might align at some point.
    "CABO_VERDE" to "CAPE_VERDE",
    "COCOS_KEELING_ISLANDS" to "COCOS_ISLANDS",
    "FALKLAND_ISLANDS_MALVINAS" to "FALKLAND_ISLANDS",
    "FRENCH_SOUTHERN_TERRITORIES" to "FRENCH_SOUTHERN_AND_ANTARCTIC_LANDS",
    "MARSHALL_ISLANDS" to "MARSHALL_ISLAND",
    "PITCAIRN" to "PITCAIRN_ISLANDS",
    "SAINT_BARTHÉLEMY" to "SAINT_BARTS", // Should be SAINT_BARTHELEMY.
    "SAO_TOME_AND_PRINCIPE" to "SAO_TOME_AND_PRINCE",
    "TURKS_AND_CAICOS_ISLANDS" to "TURKS_AND_CAICOS",
    "VIRGIN_ISLANDS_BRITISH" to "BRITISH_VIRGIN_ISLANDS",
    "VIRGIN_ISLANDS_US" to "US_VIRGIN_ISLANDS",
    "WESTERN_SAHARA" to "SAHRAWI_ARAB_DEMOCRATIC_REPUBLIC",
  )

  val yaml = Yaml(configuration = YamlConfiguration(strictMode = false))
  val serializer = MapSerializer(String.serializer(), CountryDto.serializer())
  val parsedCountries = fileSystem.list(path)
    .flatMap {
      yaml.decodeFromSource(serializer, fileSystem.source(path / it)).values
    }

  val otherCountries = listOf(
    // https://github.com/countries/countries/issues/793#issuecomment-2027531814
    CountryDto(
      alpha2 = "XK",
      alpha3 = "XKX",
      countryCode = "383",
      isoShortName = "Kosovo",
      continent = "EUROPE",
    ),
  )

  val enumOutput = (parsedCountries + otherCountries)
    .map {
      val fallback = it.isoShortName.uppercase()
        .replace(" ", "_")
        .replace(",", "")
        .replace("-", "_")
        .replace(".", "")
        .replace("'", "")
        .replace("(", "")
        .replace(")", "")

      val name = overwrittenNames.remove(fallback) ?: fallback
      val callingCode = it.nanpPrefix ?: it.countryCode
      val continent = it.continent.uppercase()
        .replace(" ", "_")
        .replace("AUSTRALIA", "OCEANIA")

      "$name(code = \"${it.alpha2}\", code3 = \"${it.alpha3}\", callingCodes = listOf(\"+$callingCode\"), continents = listOf(Continent.$continent)),"
    }
    .sorted()

  require(overwrittenNames.isEmpty()) { "Unmatched overwritten names: $overwrittenNames" }
  println(enumOutput.joinToString(separator = "\n"))
}

// https://github.com/countries/countries/blob/master/lib/countries/data/countries/TL.yaml
@Serializable data class CountryDto(
  @SerialName("alpha2") val alpha2: String,
  @SerialName("alpha3") val alpha3: String,
  @SerialName("country_code") val countryCode: String,
  @SerialName("nanp_prefix") val nanpPrefix: String? = null,
  @SerialName("iso_short_name") val isoShortName: String,
  @SerialName("continent") val continent: String,
)
