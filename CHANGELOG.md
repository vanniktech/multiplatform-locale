# Change Log

Version 0.3.0 *(In development)*
--------------------------------

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
