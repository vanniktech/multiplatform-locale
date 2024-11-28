rootProject.name = "MultiplatformLocale"

pluginManagement {
  repositories {
    mavenCentral()
    google()
    gradlePluginPortal()
  }
}

include(":multiplatform-locale")
include(":multiplatform-locale-google-play-store")
include(":sample-android")
include(":sample-jvm")
