package com.vanniktech.locale

@Suppress("EXPECT_ACTUAL_CLASSIFIERS_ARE_IN_BETA_WARNING")
actual object Locales {
  /** Returns the current locale. */
  actual fun currentLocaleString(): String = currentNativeLocaleString().toString()

  /**
   * On Android / JVM, it returns the supported locales.
   * On iOS, it returns the preferred languages.
   */
  actual fun currentLocaleStrings(): List<String> {
    val locales = currentNativeLocaleStrings()

    return (0 until locales.length).map {
      locales[it].toString()
    }
  }
}
