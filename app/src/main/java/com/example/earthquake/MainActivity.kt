package com.example.earthquake

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.earthquake.databinding.ActivityMainBinding
import com.google.gson.FieldNamingPolicy
import com.google.gson.GsonBuilder
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import okhttp3.OkHttpClient
import okhttp3.Request

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val okHttpClient= OkHttpClient()
        val request=Request.Builder()
                .url("https://earthquake.usgs.gov/earthquakes/feed/v1.0/detail/ci39540463.geojson")
                .build()
        val gson=GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
                .create()
        GlobalScope.launch(Dispatchers.Main) {
            val response= withContext(Dispatchers.IO){ okHttpClient.newCall(request).execute().body?.string()}
            val quake=gson.fromJson(response, Properties::class.java)
            binding.magtv.text=quake.mag.toString()
            binding.timetv.text=quake.time.toString()
            binding.placetv.text=quake.place.toString()
        }
        }
    }
