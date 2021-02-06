package com.example.earthquake

import com.google.gson.FieldNamingPolicy
import com.google.gson.GsonBuilder
import okhttp3.OkHttpClient
import okhttp3.Request
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

object Client {
    private val gson= GsonBuilder()
            .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
            .create()
    val retrofit=Retrofit.Builder()
             .baseUrl("https://earthquake.usgs.gov/earthquakes/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
val api = retrofit.create(GithubService::class.java)
}
