package com.vanniktech.locale

import kotlin.test.Test
import kotlin.test.assertEquals

class LanguagesTest {
  @Test fun currentLanguageCode() {
    assertEquals(expected = "en", actual = Languages.currentLanguageCode())
  }
}
