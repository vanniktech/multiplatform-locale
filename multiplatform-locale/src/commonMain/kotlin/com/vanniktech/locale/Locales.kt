package com.vanniktech.locale

@Suppress("EXPECT_ACTUAL_CLASSIFIERS_ARE_IN_BETA_WARNING")
expect object Locales {
  /** Returns the current locale. */
  fun currentLocaleString(): String

  /**
   * On Android / JVM, it returns the supported locales.
   * On iOS, it returns the preferred languages.
   */
  fun currentLocaleStrings(): List<String>
}
