# Change Log

Version 0.4.0 *(2022-05-14)*
----------------------------

- API: Add missing countries \(SH, MF, PM, GS & SJ\) [\#71](https://github.com/vanniktech/multiplatform-locale/pull/71) ([vanniktech](https://github.com/vanniktech))
- API: Country - add calling codes list. [\#72](https://github.com/vanniktech/multiplatform-locale/pull/72) ([vanniktech](https://github.com/vanniktech))
- Kotlin: Use Android Source Set Layout Version 2. [\#63](https://github.com/vanniktech/multiplatform-locale/pull/63) ([vanniktech](https://github.com/vanniktech))
- Language: Add Armenian. [\#30](https://github.com/vanniktech/multiplatform-locale/pull/30) ([vanniktech](https://github.com/vanniktech))
- Language: Add Azerbaijani. [\#39](https://github.com/vanniktech/multiplatform-locale/pull/39) ([vanniktech](https://github.com/vanniktech))
- Language: Add Bokmal. [\#68](https://github.com/vanniktech/multiplatform-locale/pull/68) ([vanniktech](https://github.com/vanniktech))
- Language: Add Burmese. [\#49](https://github.com/vanniktech/multiplatform-locale/pull/49) ([vanniktech](https://github.com/vanniktech))
- Language: Add Catalan. [\#62](https://github.com/vanniktech/multiplatform-locale/pull/62) ([vanniktech](https://github.com/vanniktech))
- Language: Add Croatian. [\#32](https://github.com/vanniktech/multiplatform-locale/pull/32) ([vanniktech](https://github.com/vanniktech))
- Language: Add Irish. [\#53](https://github.com/vanniktech/multiplatform-locale/pull/53) ([vanniktech](https://github.com/vanniktech))
- Language: Add Uzbek. [\#58](https://github.com/vanniktech/multiplatform-locale/pull/58) ([vanniktech](https://github.com/vanniktech))

Version 0.3.0 *(2022-12-20)*
----------------------------

- Language: Add Farsi. [\#29](https://github.com/vanniktech/multiplatform-locale/pull/29) ([vanniktech](https://github.com/vanniktech))
- Gradle: Fix POM License. [\#28](https://github.com/vanniktech/multiplatform-locale/pull/28) ([vanniktech](https://github.com/vanniktech))
- Fix broken Podspec symlink. [\#27](https://github.com/vanniktech/multiplatform-locale/pull/27) ([vanniktech](https://github.com/vanniktech))
- Language: Add Malay. [\#26](https://github.com/vanniktech/multiplatform-locale/pull/26) ([vanniktech](https://github.com/vanniktech))
- Language: Add Thai. [\#25](https://github.com/vanniktech/multiplatform-locale/pull/25) ([vanniktech](https://github.com/vanniktech))
- Language: Add Hindi & Gujarati. [\#22](https://github.com/vanniktech/multiplatform-locale/pull/22) ([vanniktech](https://github.com/vanniktech))
- Gradle: Set Jvm Toolchain to 11. [\#21](https://github.com/vanniktech/multiplatform-locale/pull/21) ([vanniktech](https://github.com/vanniktech))
- API: Languages\#currentLanguageCode which returns the current ISO 639-1 language code. [\#19](https://github.com/vanniktech/multiplatform-locale/pull/19) ([vanniktech](https://github.com/vanniktech))
- API: Countries\#currentCountryCode which returns the current optional ISO 3166-1 alpha-2 country code. [\#18](https://github.com/vanniktech/multiplatform-locale/pull/18) ([vanniktech](https://github.com/vanniktech))
- Locale: Fix parsing of strings like 'ar\_EG\_\#u-nu-latn' [\#14](https://github.com/vanniktech/multiplatform-locale/pull/14) ([vanniktech](https://github.com/vanniktech))
- Behavior Change: Locale\#fromAndroidValuesDirectoryNameOrNull don't require values prefix. [\#12](https://github.com/vanniktech/multiplatform-locale/pull/12) ([vanniktech](https://github.com/vanniktech))

Version 0.2.0 *(2022-11-08)*
----------------------------

- API: Rename Country\#identifier to Country\#code. [\#11](https://github.com/vanniktech/multiplatform-locale/pull/11) ([vanniktech](https://github.com/vanniktech))
- API: Rename Language\#identifier to Language\#code. [\#10](https://github.com/vanniktech/multiplatform-locale/pull/10) ([vanniktech](https://github.com/vanniktech))
- API: Remove inferDefaultCountry overload in Locale from methods. [\#9](https://github.com/vanniktech/multiplatform-locale/pull/9) ([vanniktech](https://github.com/vanniktech))
- API: Locale\#fromAndroidValuesDirectoryName function. [\#8](https://github.com/vanniktech/multiplatform-locale/pull/8) ([vanniktech](https://github.com/vanniktech))
- API: Language rename FINISH to FINNISH \(fixing a typo\) [\#7](https://github.com/vanniktech/multiplatform-locale/pull/7) ([vanniktech](https://github.com/vanniktech))
- Behavior Change: Language uses ISO 639-1 code with backwards compatible support for Hebrew & Indonesian. [\#6](https://github.com/vanniktech/multiplatform-locale/pull/6) ([vanniktech](https://github.com/vanniktech))
- API: Language\#from & Language\#fromLocale. [\#5](https://github.com/vanniktech/multiplatform-locale/pull/5) ([vanniktech](https://github.com/vanniktech))
- Behavior Change: Locale\#googlePlayStoreLocale & Locale\#appleAppStoreLocale prefer Locale from Language\#defaultCountry in case there are multiple options. [\#4](https://github.com/vanniktech/multiplatform-locale/pull/4) ([vanniktech](https://github.com/vanniktech))
- Behavior Change: Locale\#googlePlayStoreLocale & Locale\#appleAppStoreLocale will return a Locale if countries mismatch but language is the same. [\#3](https://github.com/vanniktech/multiplatform-locale/pull/3) ([vanniktech](https://github.com/vanniktech))
- API: Locale is now Comparable. [\#2](https://github.com/vanniktech/multiplatform-locale/pull/2) ([vanniktech](https://github.com/vanniktech))
- API: Locale.fromAndroidValuesDirectoryNameOrNull [\#1](https://github.com/vanniktech/multiplatform-locale/pull/1) ([vanniktech](https://github.com/vanniktech))

Version 0.1.0 *(2022-11-07)*
----------------------------

- Initial release
