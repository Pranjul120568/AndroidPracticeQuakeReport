package com.example.earthquake

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.earthquake.databinding.ActivityMainBinding
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainActivity : AppCompatActivity() {
    private val originalList= arrayListOf<Properties>()
    private val adapter= QuakeAdapter()
    lateinit var binding:ActivityMainBinding
    override  fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.quakerecycler.apply {
            layoutManager= LinearLayoutManager(this@MainActivity)
            adapter=this@MainActivity.adapter
        }
        GlobalScope.launch(Dispatchers.Main) {
            //Her we basically make a request to fetch all data
            val response= withContext(Dispatchers.IO){ Client.api.getquakes() }
            if(response.isSuccessful){
                response.body()?.let {
                    //Here we add the data retrieved from the response request
                    originalList.addAll(it)
                    adapter.swapData(it)
                }
            }
        }
    }
}