package com.vanniktech.locale

import java.util.Locale

actual object Languages {
  actual fun currentLanguageCode(): String = Locale.getDefault().language
}
