@file:OptIn(ExperimentalWasmDsl::class)

import org.jetbrains.kotlin.gradle.ExperimentalWasmDsl

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
    namespace = "com.vanniktech.locale"

    minSdk = libs.versions.minSdk.get().toInt()
    compileSdk = libs.versions.compileSdk.get().toInt()
    // https://issuetracker.google.com/issues/470478219
    // resourcePrefix = "locale_"
  }
  jvm()
  jvmToolchain(11)
  iosX64()
  iosArm64()
  iosSimulatorArm64()
  wasmJs {
    browser {
      commonWebpackConfig {
        outputFileName = "multiplatform_locale_wasmJs.js"
      }
    }
    binaries.executable()
  }
  js {
    browser {
      commonWebpackConfig {
        outputFileName = "multiplatform_locale_js.js"
      }
    }
    generateTypeScriptDefinitions()
    useCommonJs()
    binaries.executable()
  }

  sourceSets {
    val commonTest by getting {
      dependencies {
        implementation(kotlin("test"))
      }
    }

    val jvmTest by getting {
      dependencies {
        implementation(libs.kotlin.test.junit)
      }
    }
    val webMain by getting {
      dependencies {
        implementation(npm("get-user-locale", "3.0.0"))
        implementation(npm("country-codes-list", "2.0.0"))
      }
    }
  }

  cocoapods {
    summary = "Multiplatform Locale for iOS, Android and JVM via Kotlin Multiplatform"
    homepage = "https://github.com/vanniktech/multiplatform-locale"
    license = "MIT"
    name = "MultiplatformLocale"
    authors = "Niklas Baudy"
    version = project.property("VERSION_NAME").toString()

    framework {
      isStatic = true
    }
  }
}
