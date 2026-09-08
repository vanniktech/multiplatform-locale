@file:OptIn(ExperimentalWasmJsInterop::class)
package com.vanniktech.locale

import kotlin.js.ExperimentalWasmJsInterop

internal actual fun Territory.commonDisplayName(): String = countryPropertyFor("countryCode", this.code.uppercase())
  .officialLanguageNameLocal
  .toString()
