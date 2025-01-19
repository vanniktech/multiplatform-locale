package com.vanniktech.locale

import kotlin.test.Test
import kotlin.test.assertEquals

class RegionTest {
  @Test fun uniqueEmojis() {
    val emojis = Region.entries.groupBy { it.emoji }
    emojis.forEach { (emoji, countries) ->
      assertEquals(message = "Emoji $emoji found multiple times: ${countries.joinToString { it.displayName() }}", expected = 1, actual = countries.size)
    }
  }

  @Test fun displayName() {
    assertEquals(expected = "European Union", actual = Region.EUROPEAN_UNION.displayName())
    assertEquals(expected = "Latin America", actual = Region.LATIN_AMERICA.displayName())
    assertEquals(expected = "Canary Islands", actual = Region.CANARY_ISLANDS.displayName())
    assertEquals(expected = "International Waters", actual = Region.INTERNATIONAL_WATERS.displayName())
  }

  @Test fun fromOrNull() {
    assertEquals(expected = null, actual = Region.fromOrNull(null))
    assertEquals(expected = null, actual = Region.fromOrNull(""))
    assertEquals(expected = null, actual = Region.fromOrNull("xxx"))
    assertEquals(expected = Region.EUROPEAN_UNION, actual = Region.fromOrNull("EU"))
    assertEquals(expected = Region.EUROPEAN_UNION, actual = Region.fromOrNull("eu"))
    assertEquals(expected = Region.INTERNATIONAL_WATERS, actual = Region.fromOrNull("XZZ"))
    assertEquals(expected = Region.INTERNATIONAL_WATERS, actual = Region.fromOrNull("xzz"))
  }

  @Test fun fromLocaleOrNull() {
    assertEquals(expected = Region.EUROPEAN_UNION, actual = Region.fromLocaleOrNull("de-EU"))
    assertEquals(expected = Region.LATIN_AMERICA, actual = Region.fromLocaleOrNull("es-419"))
    assertEquals(expected = Region.INTERNATIONAL_WATERS, actual = Region.fromLocaleOrNull("es-XZZ"))
    assertEquals(expected = null, actual = Region.fromLocaleOrNull("en"))
    assertEquals(expected = null, actual = Region.fromLocaleOrNull("de"))
    assertEquals(expected = null, actual = Region.fromLocaleOrNull(""))
    assertEquals(expected = null, actual = Region.fromLocaleOrNull(null))
  }

  @Test fun fromLenientOrNull() {
    assertEquals(expected = null, actual = Region.fromLenientOrNull("xxx"))
    assertEquals(expected = null, actual = Region.fromLenientOrNull(null))
    assertEquals(expected = Region.EUROPEAN_UNION, actual = Region.fromLenientOrNull("EU"))
    assertEquals(expected = Region.EUROPEAN_UNION, actual = Region.fromLenientOrNull("eu"))
    assertEquals(expected = Region.EUROPEAN_UNION, actual = Region.fromLenientOrNull("de-EU"))
    assertEquals(expected = Region.LATIN_AMERICA, actual = Region.fromLenientOrNull("es-419"))
    assertEquals(expected = Region.INTERNATIONAL_WATERS, actual = Region.fromLenientOrNull("es-XZZ"))
  }

  @Test fun region() {
    assertEquals(
      expected = """
419-LATIN_AMERICA-null
EU-EUROPEAN_UNION-🇪🇺
IC-CANARY_ISLANDS-🇮🇨
XZ-INTERNATIONAL_WATERS-🌊
      """.trimIndent(),
      actual = Region.entries.sortedBy { it.code }.joinToString(separator = "\n") { "${it.code}-${it.name}-${it.emoji}" },
    )
  }

  @Test fun noDuplicates() {
    val unique = Region.entries.map { it.code }.toSet()
    assertEquals(expected = Region.entries.size, actual = unique.size)
  }
}
