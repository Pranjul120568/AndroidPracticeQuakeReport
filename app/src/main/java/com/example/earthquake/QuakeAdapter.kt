package com.example.earthquake

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class QuakeAdapter :RecyclerView.Adapter<QuakeAdapter.QuakeHolder>(){
    private var data: List<Features> = ArrayList()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): QuakeHolder {
        return QuakeHolder(
                LayoutInflater.from(parent.context).inflate(R.layout.item_user,parent,false)
        )
    }
    override fun onBindViewHolder(holder: QuakeHolder, position: Int) =holder.bind(data[position])
    override fun getItemCount(): Int =data.size
    fun swapData(data: List<Features>){
        this.data=data
        notifyDataSetChanged()
    }
    inner class QuakeHolder(itemView: View):RecyclerView.ViewHolder(itemView) {
fun bind(item: Features)= with(itemView){
    findViewById<TextView>(R.id.magnitudetv).text= item.properties!!.mag.toString()
    findViewById<TextView>(R.id.placetv).text=item.properties.place.toString()
    findViewById<TextView>(R.id.timetv).text=item.properties.time.toString()
}
    }
}