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
  }
  jvm()
  jvmToolchain(11)
  iosX64()
  iosArm64()
  iosSimulatorArm64()

  sourceSets {
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
