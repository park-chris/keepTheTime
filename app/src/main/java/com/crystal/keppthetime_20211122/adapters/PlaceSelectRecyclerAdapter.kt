package com.crystal.keppthetime_20211122.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.crystal.keppthetime_20211122.R
import com.crystal.keppthetime_20211122.datas.PlaceData

class PlaceSelectRecyclerAdapter(val mContext: Context, val mList: List<PlaceData>) : RecyclerView.Adapter<PlaceSelectRecyclerAdapter.PlaceViewHolder>() {

    inner class PlaceViewHolder(row: View) : RecyclerView.ViewHolder(row)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlaceViewHolder {


        val row = LayoutInflater.from(mContext).inflate(R.layout.place_list_item, parent)
        return  PlaceViewHolder(row)

    }

    override fun onBindViewHolder(holder: PlaceViewHolder, position: Int) {


    }

    override fun getItemCount() = mList.size


}