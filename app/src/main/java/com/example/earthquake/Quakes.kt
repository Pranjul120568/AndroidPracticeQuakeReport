package com.example.earthquake

data class Quakes(
	val features: ArrayList<Features?>? = null,
)
data class Features(
	val properties: Properties? = null,
    val type:String?=null
)
data class Properties(
	val mag: Double? = null,
	val place: String? = null,
	val time: Long? = null,
)