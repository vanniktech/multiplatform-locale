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
  val githubDirectory = "/Users/niklas/dev/GitHub/".toPath()
  val countriesPath = githubDirectory / "countries/lib/countries/data/countries".toPath()
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
  val parsedCountries = fileSystem.list(countriesPath)
    .flatMap { yaml.decodeFromSource(serializer, fileSystem.source(countriesPath / it)).values }
    .map {
      val fallback = it.isoShortName.uppercase()
        .replace(" ", "_")
        .replace(",", "")
        .replace("-", "_")
        .replace(".", "")
        .replace("'", "")
        .replace("(", "")
        .replace(")", "")

      it.copy(
        isoShortName = overwrittenNames.remove(fallback) ?: fallback,
      )
    }

  val otherCountries = listOf(
    // https://github.com/countries/countries/issues/793#issuecomment-2027531814
    CountryDto(
      alpha2 = "XK",
      alpha3 = "XKX",
      countryCode = "383",
      isoShortName = "KOSOVO",
      continent = "EUROPE",
      geo = Geo(
        latitude = 42.5833,
        longitude = 21.0001,
        maxLatitude = 43.139,
        maxLongitude = 21.835,
        minLatitude = 41.877,
        minLongitude = 19.949,
      ),
    ),
  )

  val countries = (parsedCountries + otherCountries).sortedBy { it.isoShortName }
  val enumOutput = countries
    .map {
      val callingCode = it.nanpPrefix ?: it.countryCode
      val continent = it.continent.uppercase()
        .replace(" ", "_")
        .replace("AUSTRALIA", "OCEANIA")

      "${it.isoShortName}(code = \"${it.alpha2}\", code3 = \"${it.alpha3}\", callingCodes = listOf(\"+$callingCode\"), continent = Continent.$continent),"
    }

  require(overwrittenNames.isEmpty()) { "Unmatched overwritten names: $overwrittenNames" }
  println(enumOutput.joinToString(separator = "\n"))

  fileSystem.write(githubDirectory / "multiplatform-locale/multiplatform-locale-geo/src/commonMain/kotlin/com/vanniktech/locale/geo/CountryGeo.kt") {
    writeUtf8(
      """
      |package com.vanniktech.locale.geo
      |
      |import com.vanniktech.locale.Country
      |
      |
      """.trimMargin(),
    )

    countries.forEach {
      writeUtf8(
        """
      |private val GEO_${it.isoShortName} = Geo(
      |  latitude = ${it.geo.latitude},
      |  longitude = ${it.geo.longitude},
      |  maxLatitude = ${it.geo.maxLatitude},
      |  maxLongitude = ${it.geo.maxLongitude},
      |  minLatitude = ${it.geo.minLatitude},
      |  minLongitude = ${it.geo.minLongitude},
      |)
      |
      |
        """.trimMargin(),
      )
    }

    writeUtf8(
      """
      |val Country.geo get() = when (this) {
      |
      """.trimMargin(),
    )

    countries.forEach {
      writeUtf8(
        """
      |  Country.${it.isoShortName} -> GEO_${it.isoShortName}
      |
        """.trimMargin(),
      )
    }

    writeUtf8(
      """
    |}
    |
      """.trimMargin(),
    )
  }
}

// https://github.com/countries/countries/blob/master/lib/countries/data/countries/TL.yaml
@Serializable data class CountryDto(
  @SerialName("alpha2") val alpha2: String,
  @SerialName("alpha3") val alpha3: String,
  @SerialName("country_code") val countryCode: String,
  @SerialName("nanp_prefix") val nanpPrefix: String? = null,
  @SerialName("iso_short_name") val isoShortName: String,
  @SerialName("continent") val continent: String,
  @SerialName("geo") val geo: Geo,
)

@Serializable data class Geo(
  @SerialName("latitude") val latitude: Double,
  @SerialName("longitude") val longitude: Double,
  @SerialName("max_latitude") val maxLatitude: Double,
  @SerialName("max_longitude") val maxLongitude: Double,
  @SerialName("min_latitude") val minLatitude: Double,
  @SerialName("min_longitude") val minLongitude: Double,
)
