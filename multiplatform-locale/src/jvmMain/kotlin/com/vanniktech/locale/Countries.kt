package com.vanniktech.locale

import java.util.Locale

actual object Countries {
  actual fun currentCountryCode(): String? = Locale.getDefault().country
}
