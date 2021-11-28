package com.crystal.keppthetime_20211122.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.crystal.keppthetime_20211122.R
import com.crystal.keppthetime_20211122.datas.UserData

class SearchedFriendRecyclerAdapter(val mContext: Context, val mList: List<UserData>) : RecyclerView.Adapter<SearchedFriendRecyclerAdapter.SearchedUserViewHolder>() {

    inner class SearchedUserViewHolder(row: View) : RecyclerView.ViewHolder(row){



    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SearchedUserViewHolder {

        val row = LayoutInflater.from(mContext).inflate(R.layout.searched_friend_list_item, parent, false)
        return SearchedUserViewHolder(row)

    }

    override fun onBindViewHolder(holder: SearchedUserViewHolder, position: Int) {
    }

    override fun getItemCount() = mList.size


}