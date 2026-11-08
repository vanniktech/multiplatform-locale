@file:OptIn(ExperimentalWasmJsInterop::class)
package com.vanniktech.locale

import kotlin.js.ExperimentalWasmJsInterop

@Suppress(names = ["EXPECT_ACTUAL_CLASSIFIERS_ARE_IN_BETA_WARNING"])
actual object Languages {
  actual fun currentLanguageCode(): String = countryDataFromLocale().officialLanguageCode.toString()
}
