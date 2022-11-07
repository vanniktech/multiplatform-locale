package com.vanniktech.locale

internal fun String.capitalize() = replaceFirstChar {
  when {
    it.isLowerCase() -> it.titlecase()
    else -> it.toString()
  }
}
