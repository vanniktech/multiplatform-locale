package com.vanniktech.locale.geo

@ConsistentCopyVisibility data class Geo internal constructor(
  val latitude: Double,
  val longitude: Double,
  val maxLatitude: Double,
  val maxLongitude: Double,
  val minLatitude: Double,
  val minLongitude: Double,
)
