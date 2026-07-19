@file:OptIn(ExperimentalWasmJsInterop::class)
package com.vanniktech.locale

import kotlin.js.ExperimentalWasmJsInterop
import kotlin.js.get
import kotlin.js.length

@Suppress(names = ["EXPECT_ACTUAL_CLASSIFIERS_ARE_IN_BETA_WARNING"])
actual object Locales {

  actual fun currentLocaleString(): String = currentNativeLocaleString().toString()

  actual fun currentLocaleStrings(): List<String> {
    val locales = currentNativeLocaleStrings()

    return (0 until locales.length).map { id ->
      locales[id].toString()
    }
  }
}
