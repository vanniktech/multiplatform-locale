plugins {
  application
  id("org.jetbrains.kotlin.jvm")
}

kotlin {
  jvmToolchain(11)
}

dependencies {
  implementation(project(":multiplatform-locale-all"))
}

dependencies {
  testImplementation(libs.kotlin.test.junit)
}

application {
  mainClass.set("com.vanniktech.locale.sample.jvm.LocaleJvmKt")
}
