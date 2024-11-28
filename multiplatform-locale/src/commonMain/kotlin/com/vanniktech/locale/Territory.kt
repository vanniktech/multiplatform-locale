package com.vanniktech.locale

sealed interface Territory {
  /** ISO 3166-1 alpha-2 code - https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2 */
  val code: String

  /** ISO 3166-1 alpha-3 code - https://en.wikipedia.org/wiki/ISO_3166-1_alpha-3 */
  val code3: String

  /** The [Continent]s it belongs to. Sometimes there can be more than one. */
  val continents: List<Continent>

  /** Optional emoji. */
  val emoji: String?

  fun displayName() = commonDisplayName()
}

/** Returns the display name of [Territory] in the current language. */
internal expect fun Territory.commonDisplayName(): String
