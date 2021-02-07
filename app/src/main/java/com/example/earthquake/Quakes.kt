package com.example.earthquake

data class Quakes(
	val features: List<FeaturesItem>,
)
data class FeaturesItem(
	val properties: Properties? = null
)
data class Properties(
	val mag: Double? = null,
	val place: String? = null,
	val time: Long? = null,
)
