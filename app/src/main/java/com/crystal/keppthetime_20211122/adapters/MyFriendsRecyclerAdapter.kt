package com.crystal.keppthetime_20211122.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.crystal.keppthetime_20211122.R
import com.crystal.keppthetime_20211122.datas.UserData

class MyFriendsRecyclerAdapter(val mContext: Context, val mList: ArrayList<UserData>) : RecyclerView.Adapter<MyFriendsRecyclerAdapter.MyFriendViewHolder>() {

    inner class MyFriendViewHolder(row: View) : RecyclerView.ViewHolder(row) {



    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyFriendViewHolder {

        val row = LayoutInflater.from(mContext).inflate(R.layout.my_friend_list, parent, false)
        return MyFriendViewHolder(row)

    }

    override fun onBindViewHolder(holder: MyFriendViewHolder, position: Int) {

    }

    override fun getItemCount() = mList.size


}