package com.example.andoid_base.weather.adapter

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class CtyListAdapter(var data :MutableList<String>) : RecyclerView.Adapter<CtyListAdapter.MyViewHolder>() {

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        return data.size
    }
}