package com.vanniktech.locale.sample.android

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.vanniktech.locale.Country
import com.vanniktech.locale.Language
import com.vanniktech.locale.Locale
import com.vanniktech.locale.Locales
import com.vanniktech.locale.sample.android.databinding.ActivityMainBinding

class LocaleMainActivity : AppCompatActivity() {
  @SuppressLint("SetTextI18n")
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    val binding = ActivityMainBinding.inflate(layoutInflater)
    setContentView(binding.root)

    val currentLocaleString = Locales.currentLocaleString()
    binding.currentLocaleString.text = "Current Locale: $currentLocaleString"
    binding.googlePlayStoreLocale.text = "Google Play Store Locale: ${Locale.fromOrNull(currentLocaleString)?.googlePlayStoreLocale()?.toString() ?: "/"}"
    binding.appleAppStoreLocale.text = "Apple App Store Locale: ${Locale.fromOrNull(currentLocaleString)?.googlePlayStoreLocale()?.toString() ?: "/"}"
    binding.currentLocaleStrings.text = "Current Locale Strings: ${Locales.currentLocaleStrings().joinToString(separator = ", ")}"
    binding.allCountries.text = "All countries: ${Country.entries.joinToString { it.displayName() }}"
    binding.allLanguages.text = "All languages: ${Language.entries.joinToString { it.displayName() }}"
  }
}
