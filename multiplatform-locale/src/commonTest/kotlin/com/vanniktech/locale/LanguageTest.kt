package com.vanniktech.locale

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class LanguageTest {
  @Test fun from() {
    assertEquals(
      expected = Language.UKRAINIAN,
      actual = Language.from("uk"),
    )

    assertFailsWith<IllegalArgumentException> {
      Language.from("asdfa")
    }
  }

  @Test fun fromOrNull() {
    assertEquals(
      expected = Language.UKRAINIAN,
      actual = Language.fromOrNull("uk"),
    )

    assertEquals(
      expected = null,
      actual = Language.fromOrNull("asdfa"),
    )
  }

  @Test fun fromLocale() {
    assertEquals(
      expected = Language.UKRAINIAN,
      actual = Language.fromLocale("uk"),
    )

    assertFailsWith<IllegalArgumentException> {
      Language.fromLocale("asdfa")
    }
  }

  @Test fun fromLocaleOrNull() {
    assertEquals(
      expected = Language.UKRAINIAN,
      actual = Language.fromLocaleOrNull("uk-UA"),
    )

    assertEquals(
      expected = null,
      actual = Language.fromLocaleOrNull("asdfa"),
    )
  }
}
