package com.vanniktech.locale.sample.android

import android.app.Application
import timber.log.Timber

class LocaleApplication : Application() {
  override fun onCreate() {
    super.onCreate()
    Timber.plant(Timber.DebugTree())
  }
}
