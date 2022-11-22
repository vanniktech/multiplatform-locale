package com.vanniktech.locale

expect object Languages {
  /** Returns the current ISO 639-1 [Language.code] - https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes. */
  fun currentLanguageCode(): String
}
