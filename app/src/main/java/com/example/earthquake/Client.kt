package com.example.earthquake

import com.google.gson.FieldNamingPolicy
import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object Client {
    //As when we see the response it is all in lowercase with underscores
private val gson=GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
    .create()
    private val retrofit=Retrofit.Builder()
        .baseUrl("https://earthquake.usgs.gov/fdsnws/event/1/queryformat=geojson&starttime=2016-01-01&endtime=2016-01-31&minmag=6&limit=10")
        .addConverterFactory(GsonConverterFactory.create(gson))
        .build()
    val api= retrofit.create(GithubService::class.java)
}