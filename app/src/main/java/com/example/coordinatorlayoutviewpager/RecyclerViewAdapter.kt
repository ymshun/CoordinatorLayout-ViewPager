package com.example.coordinatorlayoutviewpager

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.recycler_item.view.*

class RecyclerViewAdapter(private val itemList:List<String>): RecyclerView.Adapter<RecyclerView.ViewHolder>(){

    class RecyclerHolder(val view: View):RecyclerView.ViewHolder(view){
        val recyclerText = view.recyclerText
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val item = layoutInflater.inflate(R.layout.recycler_item, parent, false)
        return RecyclerHolder(item)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        holder.itemView.recyclerText.text = itemList[position]
    }

}