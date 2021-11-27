package com.crystal.keppthetime_20211122

import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.crystal.keppthetime_20211122.api.ServerAPI
import com.crystal.keppthetime_20211122.api.ServerAPIService
import retrofit2.Retrofit

abstract class BaseActivity : AppCompatActivity() {

    lateinit var mContext : Context

//    모든 화면에서 서버통신이 필요할것 같다.
//    모든 화면에 레트로핏 / API 기능 목록을 결합한 변수를 미리 만들어서 물려주자.
    private lateinit var retrofit: Retrofit
    lateinit var apiService : ServerAPIService


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mContext = this

//        서버통신 관련 세팅
        retrofit = ServerAPI.getRetrofit(mContext)
        apiService = retrofit.create(ServerAPIService::class.java)

    }

    abstract fun setupEvents()
    abstract fun setValues()

}