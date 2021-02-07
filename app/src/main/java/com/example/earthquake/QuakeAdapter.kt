package com.example.earthquake

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class QuakeAdapter :RecyclerView.Adapter<QuakeAdapter.QuakeHolder>(){
    private var data: List<Quakes> = ArrayList()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): QuakeHolder {
        return QuakeHolder(
                LayoutInflater.from(parent.context).inflate(R.layout.item_user,parent,false)
        )
    }
    override fun onBindViewHolder(holder: QuakeHolder, position: Int) =holder.bind(data[position])
    override fun getItemCount(): Int =data.size
    fun swapData(data: List<Quakes>){
        this.data=data
        notifyDataSetChanged()
    }
    inner class QuakeHolder(itemView: View):RecyclerView.ViewHolder(itemView) {
fun bind(item: Quakes)= with(itemView){
    findViewById<TextView>(R.id.magnitudetv).text= item.features.properties.mag.toString()
}
    }
}