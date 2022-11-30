plugins {
  application
  id("org.jetbrains.kotlin.jvm")
}

dependencies {
  implementation(project(":multiplatform-locale"))
}

dependencies {
  testImplementation(libs.kotlin.test.junit)
}

application {
  mainClass.set("com.vanniktech.locale.sample.jvm.LocaleJvmKt")
}
