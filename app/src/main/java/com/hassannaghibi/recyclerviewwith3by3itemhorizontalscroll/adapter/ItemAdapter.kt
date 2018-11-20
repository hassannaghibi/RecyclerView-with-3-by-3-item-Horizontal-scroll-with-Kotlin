package com.hassannaghibi.recyclerviewwith3by3itemhorizontalscroll.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.hassannaghibi.recyclerviewwith3by3itemhorizontalscroll.R
import kotlinx.android.synthetic.main.item.view.*

class ItemAdapter(val items: ArrayList<String>, val context: Context) : RecyclerView.Adapter<ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.item, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder?.title?.text = items.get(position)
    }

    override fun getItemCount(): Int {
        return items.size
    }
}

class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    val title = view.title
    val item = view.item
}