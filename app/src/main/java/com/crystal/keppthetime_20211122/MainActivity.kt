package com.crystal.keppthetime_20211122

import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import com.crystal.keppthetime_20211122.databinding.ActivityMainBinding
import com.crystal.keppthetime_20211122.datas.BasicResponse
import com.crystal.keppthetime_20211122.utils.ContextUtil
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : BaseActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        setupEvents()
        setValues()
    }

    override fun setupEvents() {
    }

    override fun setValues() {

        getMyInfoFromServer()

    }

//    연습 - 내 정보를 서버에서   받아오기 (GET / Header 첨부 )

    fun  getMyInfoFromServer() {

        apiService.getRequestMyInfo(ContextUtil.getToken(mContext)).enqueue( object : Callback<BasicResponse> {
            override fun onResponse(call: Call<BasicResponse>, response: Response<BasicResponse>) {

                if (response.isSuccessful) {

                    val basicResponse = response.body()!!

                    Log.d("응답 내용", basicResponse.data.user.nickname)
                }

            }

            override fun onFailure(call: Call<BasicResponse>, t: Throwable) {


            }

        })

    }

}