package com.example.earthquake

data class Quakes(
	val features: List<FeaturesItem?>? = null,
	val metadata: Metadata? = null,
	val bbox: List<Double?>? = null,
	val type: String? = null
)

data class Properties(
	val dmin: Double? = null,
	val code: String? = null,
	val sources: String? = null,
	val tz: Int? = null,
	val mmi: Double? = null,
	val type: String? = null,
	val title: String? = null,
	val magType: String? = null,
	val nst: Any? = null,
	val sig: Int? = null,
	val tsunami: Int? = null,
	val mag: Double? = null,
	val alert: String? = null,
	val gap: Int? = null,
	val rms: Double? = null,
	val place: String? = null,
	val net: String? = null,
	val types: String? = null,
	val felt: Int? = null,
	val cdi: Double? = null,
	val url: String? = null,
	val ids: String? = null,
	val time: Long? = null,
	val detail: String? = null,
	val updated: Long? = null,
	val status: String? = null
)

data class Metadata(
	val offset: Int? = null,
	val generated: Long? = null,
	val limit: Int? = null,
	val count: Int? = null,
	val api: String? = null,
	val title: String? = null,
	val url: String? = null,
	val status: Int? = null
)

data class FeaturesItem(
	val geometry: Geometry? = null,
	val id: String? = null,
	val type: String? = null,
	val properties: Properties? = null
)

data class Geometry(
	val coordinates: List<Double?>? = null,
	val type: String? = null
)

