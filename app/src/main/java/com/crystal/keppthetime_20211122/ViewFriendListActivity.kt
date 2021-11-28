package com.crystal.keppthetime_20211122

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.crystal.keppthetime_20211122.databinding.ActivityViewFriendListBinding
import com.crystal.keppthetime_20211122.datas.BasicResponse
import com.crystal.keppthetime_20211122.datas.UserData
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ViewFriendListActivity : BaseActivity() {

    lateinit var binding : ActivityViewFriendListBinding

    val mMyFriendList = ArrayList<UserData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_view_friend_list)

        setupEvents()
        setValues()

    }

    override fun setupEvents() {
    }

    override fun setValues() {
        getMyFriendsFromServer()
    }

    fun getMyFriendsFromServer() {

        apiService.getRequestMyFriends("my").enqueue(object : Callback<BasicResponse>{
            override fun onResponse(call: Call<BasicResponse>, response: Response<BasicResponse>) {

                if ( response.isSuccessful) {

                    val br = response.body()!!



                }

            }

            override fun onFailure(call: Call<BasicResponse>, t: Throwable) {

            }


        })

    }

}