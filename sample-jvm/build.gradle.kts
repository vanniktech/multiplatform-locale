plugins {
  application
  id("org.jetbrains.kotlin.jvm")
}

kotlin {
  jvmToolchain(8)
}

dependencies {
  implementation(project(":multiplatform-locale"))
}

application {
  mainClass.set("com.vanniktech.locale.sample.jvm.LocaleJvmKt")
}
