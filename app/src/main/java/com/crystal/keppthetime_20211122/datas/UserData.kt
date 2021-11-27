package com.crystal.keppthetime_20211122.datas

import com.google.gson.annotations.SerializedName

class UserData(

    var id: Int,
    var provider: String,
    var uid: String?,
    var email: String,
//    서버에 있는 변수값이랑 다를 경우 @SerializedName("서버에 있는 변수이름") 하면 밑에 변수에 그 값을 담아줌
    @SerializedName("ready_minute")
    var readyMinute: Int,
    @SerializedName("nick_name")
    var nickname: String,
    @SerializedName("profile_img")
    var profileImageUrl: String
    ) {
}