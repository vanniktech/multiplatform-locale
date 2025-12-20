import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
  id("org.jetbrains.dokka")
  id("org.jetbrains.kotlin.multiplatform")
  id("org.jetbrains.kotlin.native.cocoapods")
  id("com.android.kotlin.multiplatform.library")
  id("me.tylerbwong.gradle.metalava")
  id("com.vanniktech.maven.publish")
  id("app.cash.licensee")
}

licensee {
  allow("Apache-2.0")
}

metalava {
  filename.set("api/current.txt")
}

kotlin {
  applyDefaultHierarchyTemplate()

  androidLibrary {
    namespace = "com.vanniktech.locale.all"

    minSdk = libs.versions.minSdk.get().toInt()
    compileSdk = libs.versions.compileSdk.get().toInt()
    compilerOptions.jvmTarget.set(JvmTarget.JVM_11)
    // https://issuetracker.google.com/issues/470478219
    // resourcePrefix = "locale_all_"
  }
  jvm()
  jvmToolchain(11)
  iosX64()
  iosArm64()
  iosSimulatorArm64()

  sourceSets {
    val commonMain by getting {
      dependencies {
        api(project(":multiplatform-locale"))
        api(project(":multiplatform-locale-apple-app-store"))
        api(project(":multiplatform-locale-geo"))
        api(project(":multiplatform-locale-google-play-store"))
      }
    }
  }

  cocoapods {
    summary = "Multiplatform Locale All for iOS, Android and JVM via Kotlin Multiplatform"
    homepage = "https://github.com/vanniktech/multiplatform-locale"
    license = "MIT"
    name = "MultiplatformLocaleAll"
    authors = "Niklas Baudy"
    version = project.property("VERSION_NAME").toString()

    framework {
      isStatic = true
      export(project(":multiplatform-locale"))
      export(project(":multiplatform-locale-apple-app-store"))
      export(project(":multiplatform-locale-geo"))
      export(project(":multiplatform-locale-google-play-store"))
    }
  }
}
