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
    namespace = "com.vanniktech.locale.geo"

    minSdk = libs.versions.minSdk.get().toInt()
    compileSdk = libs.versions.compileSdk.get().toInt()
    // https://issuetracker.google.com/issues/470478219
    // resourcePrefix = "locale_geo"
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
    summary = "Multiplatform Locale Geo for iOS, Android and JVM via Kotlin Multiplatform"
    homepage = "https://github.com/vanniktech/multiplatform-locale"
    license = "MIT"
    name = "MultiplatformLocaleGeo"
    authors = "Niklas Baudy"
    version = project.property("VERSION_NAME").toString()

    framework {
      isStatic = true
      export(project(":multiplatform-locale"))
    }
  }
}
