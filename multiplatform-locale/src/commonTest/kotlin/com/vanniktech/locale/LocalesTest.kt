package com.vanniktech.locale

import kotlin.test.Test
import kotlin.test.assertEquals

class LocalesTest {
  @Test fun currentLocaleString() {
    assertEquals(expected = "en_US", actual = Locales.currentLocaleString())
  }

  @Test fun currentLocaleStrings() {
    val currentLocaleStrings = Locales.currentLocaleStrings()

    assertEquals(
      message = currentLocaleStrings.joinToString(),
      expected = true,
      actual = currentLocaleStrings.contains("en_US") || currentLocaleStrings.contains("en-US"),
    )

    assertEquals(
      message = currentLocaleStrings.joinToString(),
      expected = true,
      actual = currentLocaleStrings.size >= 1,
    )
  }
}
