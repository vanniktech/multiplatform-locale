package com.vanniktech.locale

expect object Locales {
  /** Returns the current locale. */
  fun currentLocaleString(): String

  /**
   * On Android / JVM, it returns the supported locales.
   * On iOS, it returns the preferred languages.
   */
  fun currentLocaleStrings(): List<String>
}
