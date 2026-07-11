plugins {
  id("org.jetbrains.dokka")
  id("org.jetbrains.kotlin.multiplatform")
  id("org.jetbrains.kotlin.native.cocoapods")
  id("com.android.kotlin.multiplatform.library")
  id("com.android.lint")
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

  android {
    namespace = "com.vanniktech.locale.apple.app.store"

    minSdk = libs.versions.minSdk.get().toInt()
    compileSdk = libs.versions.compileSdk.get().toInt()
    androidResources.resourcePrefix = "locale_apple_app_store_"
    withHostTest { }
  }
  jvm()
  jvmToolchain(21)
  iosX64()
  iosArm64()
  iosSimulatorArm64()

  sourceSets {
    val commonMain by getting {
      dependencies {
        api(project(":multiplatform-locale"))
      }
    }

    val commonTest by getting {
      dependencies {
        implementation(libs.kotlin.test.common)
        implementation(libs.kotlin.test.annotations.common)
      }
    }

    val jvmTest by getting {
      dependencies {
        implementation(libs.kotlin.test.junit)
      }
    }
  }

  cocoapods {
    summary = "Multiplatform Locale Apple App Store for iOS, Android and JVM via Kotlin Multiplatform"
    homepage = "https://github.com/vanniktech/multiplatform-locale"
    license = "MIT"
    name = "MultiplatformLocaleAppleAppStore"
    authors = "Niklas Baudy"
    version = project.property("VERSION_NAME").toString()

    framework {
      isStatic = true
      export(project(":multiplatform-locale"))
    }
  }
}
