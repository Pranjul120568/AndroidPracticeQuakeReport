package com.example.earthquake

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.lang.StringBuilder
import java.text.SimpleDateFormat

class QuakeAdapter :RecyclerView.Adapter<QuakeAdapter.QuakeHolder>() {
    private var data: List<FeaturesItem> = ArrayList()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): QuakeHolder {
        return QuakeHolder(
                LayoutInflater.from(parent.context).inflate(R.layout.item_user, parent, false)
        )
    }

    override fun onBindViewHolder(holder: QuakeHolder, position: Int) = holder.bind(data[position])
    override fun getItemCount(): Int = data.size
    fun swapData(data: List<FeaturesItem>) {
        this.data = data
        notifyDataSetChanged()
    }

    inner class QuakeHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(item: FeaturesItem) = with(itemView) {
            findViewById<TextView>(R.id.placetv).text = item.properties!!.place
            findViewById<TextView>(R.id.magnitudetv).text = item.properties.mag?.let { roundoff(it) }
            findViewById<TextView>(R.id.datetv).text = timechange(item.properties.time)
            findViewById<TextView>(R.id.timetv).text = datechange(item.properties.time)
        }
    }

    fun timechange(time: Long?): String {
        val dateformatter = SimpleDateFormat.getTimeInstance()
        val time1 = dateformatter.format(time)
        return time1
    }
    fun datechange(time: Long?): String {
        val dateformatter = SimpleDateFormat.getDateInstance()
        val date = dateformatter.format(time)
        return date
    }
    fun roundoff(mag:Double):String{
        val number: String =String.format("%.2f", mag)
        return number
    }
    fun seperate(place:String):String{
        var seperator=" of"
        var parts:ArrayList<String>
        if(place.contains(seperator)){
             parts= place.split(seperator) as ArrayList<String>
            parts[0]=parts[0]+seperator+"\n"
            seperator=parts[0]+parts[1];
            Log.d("BINDING",seperator)
            return seperator
        }
        Log.d("BINDING","DONE")
        return place
    }
}