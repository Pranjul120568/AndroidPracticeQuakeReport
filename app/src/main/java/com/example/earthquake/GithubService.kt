package com.example.earthquake

import retrofit2.Response
import retrofit2.http.GET

interface GithubService {
    @GET("quakes")
    suspend fun getquakes():Response<List<Properties>>
}
