package com.example.earthquake

data class Response(
	val geometry: Geometry? = null,
	val id: String? = null,
	val type: String? = null,
	val properties: Properties? = null,
)
data class Properties(
		val dmin: Double? = null,
		val code: String? = null,
		val sources: String? = null,
		val tz: Any? = null,
		val mmi: Any? = null,
		val type: String? = null,
		val title: String? = null,
		val magType: String? = null,
		val nst: Int? = null,
		val products: Products? = null,
		val sig: Int? = null,
		val tsunami: Int? = null,
		val alert: Any? = null,
		val gap: Int? = null,
		val rms: Double? = null,
		val net: String? = null,
		val types: String? = null,
		val felt: Any? = null,
		val cdi: Any? = null,
		val url: String? = null,
		val place: String? = null,
		val time: Long? = null,
		val mag: Double? = null,
		val ids: String? = null,
		val updated: Long? = null,
		val status: String? = null,
		val addonType: String? = null,
		val eventsourcecode: String? = null,
		val text: String? = null,
		val addonCode: String? = null,
		val eventsource: String? = null,
		val pdlClientVersion: String? = null,
		val version: String? = null
)
data class PhaseDataItem(
	val indexTime: Long? = null,
	val code: String? = null,
	val contents: Contents? = null,
	val indexid: String? = null,
	val preferredWeight: Int? = null,
	val updateTime: Long? = null,
	val id: String? = null,
	val source: String? = null,
	val type: String? = null,
	val properties: Properties? = null,
	val status: String? = null
)

data class ContentsXml(
	val length: Int? = null,
	val lastModified: Long? = null,
	val contentType: String? = null,
	val url: String? = null
)

data class ScitechLinkItem(
	val indexTime: Long? = null,
	val code: String? = null,
	val contents: List<Any?>? = null,
	val indexid: String? = null,
	val preferredWeight: Int? = null,
	val updateTime: Long? = null,
	val id: String? = null,
	val source: String? = null,
	val type: String? = null,
	val properties: Properties? = null,
	val status: String? = null
)

data class Products(
	val nearbyCities: List<NearbyCitiesItem?>? = null,
	val phaseData: List<PhaseDataItem?>? = null,
	val origin: List<OriginItem?>? = null,
	val scitechLink: List<ScitechLinkItem?>? = null
)

data class NearbyCitiesJson(
	val length: Int? = null,
	val lastModified: Long? = null,
	val contentType: String? = null,
	val url: String? = null
)

data class OriginItem(
	val indexTime: Long? = null,
	val code: String? = null,
	val contents: Contents? = null,
	val indexid: String? = null,
	val preferredWeight: Int? = null,
	val updateTime: Long? = null,
	val id: String? = null,
	val source: String? = null,
	val type: String? = null,
	val properties: Properties? = null,
	val status: String? = null
)

data class NearbyCitiesItem(
	val indexTime: Long? = null,
	val code: String? = null,
	val contents: Contents? = null,
	val indexid: String? = null,
	val preferredWeight: Int? = null,
	val updateTime: Long? = null,
	val id: String? = null,
	val source: String? = null,
	val type: String? = null,
	val properties: Properties? = null,
	val status: String? = null
)

data class QuakemlXml(
	val length: Int? = null,
	val lastModified: Long? = null,
	val contentType: String? = null,
	val url: String? = null
)

data class Geometry(
	val coordinates: List<Double?>? = null,
	val type: String? = null
)



data class Contents(
	val quakemlXml: QuakemlXml? = null,
	val contentsXml: ContentsXml? = null
)

