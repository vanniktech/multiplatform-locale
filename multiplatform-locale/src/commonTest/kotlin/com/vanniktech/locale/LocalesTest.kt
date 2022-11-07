package com.vanniktech.locale

import kotlin.test.Test
import kotlin.test.assertEquals

class LocalesTest {
  @Test fun currentLocaleString() {
    assertEquals(expected = "en_US", actual = Locales.currentLocaleString())
  }

  @Test fun currentLocaleStrings() {
    val currentLocaleStrings = Locales.currentLocaleStrings()

    try {
      assertEquals(expected = listOf("en_US"), actual = currentLocaleStrings)
    } catch (throwable: Throwable) {
      // iOS.
      assertEquals(expected = listOf("en"), actual = currentLocaleStrings)
    }
  }
}
