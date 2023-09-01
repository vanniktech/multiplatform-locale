
import org.jetbrains.kotlin.gradle.targets.js.nodejs.NodeJsRootExtension
import org.jetbrains.kotlin.gradle.targets.js.nodejs.NodeJsRootPlugin
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
  id("org.jetbrains.dokka")
  id("org.jetbrains.kotlin.multiplatform")
  id("org.jetbrains.kotlin.native.cocoapods")
  id("com.android.library")
  id("org.jetbrains.kotlin.plugin.parcelize")
  id("me.tylerbwong.gradle.metalava")
  id("com.vanniktech.maven.publish")
  id("app.cash.licensee")
}

licensee {
  allow("Apache-2.0")
}

metalava {
  filename.set("api/current.txt")
  sourcePaths.setFrom("src/commonMain", "src/androidMain", "src/iosMain", "src/jvmMain")
}

kotlin {
  android {
    publishLibraryVariants("release")
  }
  jvm()
  iosArm32()
  iosArm64()
  iosX64()
  iosSimulatorArm64()
  js().nodejs()
  linuxArm64()
  linuxX64()
  macosX64()
  macosArm64()
  mingwX64()
  tvosArm64()
  tvosX64()
  tvosSimulatorArm64()
  wasm().nodejs()
  watchosArm32()
  watchosArm64()
  watchosDeviceArm64()
  watchosX86()
  watchosX64()
  watchosSimulatorArm64()

  targets.withType<org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeTarget> {
    compilations["main"].kotlinOptions.freeCompilerArgs += "-Xexport-kdoc"
  }

  sourceSets {
    val commonMain by getting {
      dependencies {
      }
    }

    val commonTest by getting {
      dependencies {
        implementation(libs.kotlin.test)
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
  }
}

tasks.withType(KotlinCompile::class.java).configureEach {
  kotlinOptions.jvmTarget = JavaVersion.VERSION_1_8.toString()
  kotlinOptions.freeCompilerArgs += listOf("-progressive", "-Xjvm-default=all")
}

tasks.withType(JavaCompile::class.java).configureEach {
  sourceCompatibility = JavaVersion.VERSION_1_8.toString()
  targetCompatibility = JavaVersion.VERSION_1_8.toString()
}

plugins.withType(NodeJsRootPlugin::class.java).configureEach {
  extensions.getByType(NodeJsRootExtension::class.java).nodeVersion = "20.0.0"
}

android {
  namespace = "com.vanniktech.locale"

  compileSdk = libs.versions.compileSdk.get().toInt()

  defaultConfig {
    minSdk = libs.versions.minSdk.get().toInt()
  }

  compileOptions {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
  }

  resourcePrefix = "locale_"
}
