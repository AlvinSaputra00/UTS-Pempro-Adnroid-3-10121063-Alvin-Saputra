package com.alvinsaputra.self

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class ItemAdapter(private val itemList:List<Int>) :
    RecyclerView.Adapter<ItemAdapter.ItemViewHolder>(){
    class ItemViewHolder(ItemView:View) : RecyclerView.ViewHolder(ItemView){
        val imageView : ImageView = ItemView.findViewById(R.id.imageview)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.each_item , parent , false)
        return ItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.imageView.setImageResource(itemList[position])
    }

    override fun getItemCount(): Int {
        return itemList.size
    }
}