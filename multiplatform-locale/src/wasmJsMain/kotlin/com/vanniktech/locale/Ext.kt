package com.vanniktech.locale

@JsModule("get-user-locale")
@JsName("getUserLocales")
external fun currentNativeLocaleStrings() : JsArray<JsString>


@JsModule("get-user-locale")
@JsName("getUserLocale")
external fun currentNativeLocaleString() : JsString

@JsModule("country-codes-list")
@JsName("findOne")
external fun countryPropertyFor(property: String,value : String) : CountryData

external interface CountryData : JsAny {
  val countryNameEn: JsString
  val countryNameLocal: JsString
  val countryCode: JsString
  val currencyCode: JsString
  val currencyNameEn: JsString
  val tinType: JsString
  val tinName: JsString
  val officialLanguageCode: JsString
  val officialLanguageNameEn: JsString
  val officialLanguageNameLocal: JsString
  val countryCallingCode: JsString
  val areaCodes: JsString
  val region: JsString
  val flag: JsString
}


internal fun countryDataFromLocale(): CountryData {
  // Uppercase as code is defined in uppercase at https://www.npmjs.com/package/country-codes-list?activeTab=code
  val currentLocale = currentNativeLocaleString().toString().uppercase()
  return countryPropertyFor("countryCode",currentLocale)
}
