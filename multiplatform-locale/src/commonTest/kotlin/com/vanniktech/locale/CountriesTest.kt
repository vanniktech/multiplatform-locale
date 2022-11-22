package com.vanniktech.locale

import kotlin.test.Test
import kotlin.test.assertEquals

class CountriesTest {
  @Test fun currentCountryCode() {
    assertEquals(expected = "US", actual = Countries.currentCountryCode())
  }
}
