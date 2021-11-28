package com.crystal.keppthetime_20211122

import android.app.Application
import com.kakao.sdk.common.KakaoSdk

class GlobalApplication : Application() {

    override fun onCreate() {
        super.onCreate()


        KakaoSdk.init(this, "30a957545341f5f8967be73dad325451")

    }

}