package com.example.earthquake

import retrofit2.Response
import retrofit2.http.GET

interface GithubService {
    @GET("feed/v1.0/summary/all_month.geojson")
    suspend fun getQuakes(): Response<Quakes>
}