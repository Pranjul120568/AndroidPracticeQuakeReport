package com.example.earthquake

data class Quakes(
	val features: ArrayList<Features>
)
data class Features(
	val properties: Properties,
    val type:String?=null
)
data class Properties(
	val mag: Double? = null,
	val place: String? = null,
	val time: Long? = null,
)