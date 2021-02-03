package com.example.earthquake

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class QuakeAdapter:RecyclerView.Adapter<QuakeAdapter.UserViewHolder>(){
    private var data:List<Properties> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): QuakeAdapter.UserViewHolder {
        return UserViewHolder (
           LayoutInflater.from(parent.context).inflate(R.layout.item_user, parent, false)
        )
    }
    override fun onBindViewHolder(holder: UserViewHolder, position: Int) =holder.bind(data[position])
    fun swapData(data:List<Properties>){
        this.data=data
        notifyDataSetChanged()
    }
    override fun getItemCount(): Int =data.size
    inner class UserViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
        fun bind(item:Properties)=with(itemView){
            findViewById<TextView>(R.id.magnitudetv).text= item.mag.toString()
            findViewById<TextView>(R.id.Place).text=item.place
            findViewById<TextView>(R.id.Time).text=item.time.toString()
        }
}
}