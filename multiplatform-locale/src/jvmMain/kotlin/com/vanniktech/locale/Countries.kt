package com.vanniktech.locale

import java.util.Locale

@Suppress("EXPECT_ACTUAL_CLASSIFIERS_ARE_IN_BETA_WARNING")
actual object Countries {
  actual fun currentCountryCode(): String? = Locale.getDefault().country
}
