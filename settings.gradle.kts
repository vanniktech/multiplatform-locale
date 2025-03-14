rootProject.name = "MultiplatformLocale"

pluginManagement {
  repositories {
    mavenCentral()
    google()
    gradlePluginPortal()
  }
}

include(":generator")
include(":multiplatform-locale")
include(":multiplatform-locale-all")
include(":multiplatform-locale-apple-app-store")
include(":multiplatform-locale-geo")
include(":multiplatform-locale-google-play-store")
include(":sample-android")
include(":sample-jvm")
