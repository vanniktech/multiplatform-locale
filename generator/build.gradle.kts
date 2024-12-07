plugins {
  id("org.jetbrains.kotlin.jvm")
  application
  alias(libs.plugins.kotlinSerialization)
}

application {
  mainClass.set("com.vanniktech.locale.generator.MainKt")
}

dependencies {
  implementation(libs.okio)
  implementation(libs.kaml)
}
