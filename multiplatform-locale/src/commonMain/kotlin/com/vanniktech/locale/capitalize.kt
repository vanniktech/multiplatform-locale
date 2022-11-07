package com.vanniktech.locale

internal fun String.capitalized() = replaceFirstChar {
  when {
    it.isLowerCase() -> it.titlecase()
    else -> it.toString()
  }
}
