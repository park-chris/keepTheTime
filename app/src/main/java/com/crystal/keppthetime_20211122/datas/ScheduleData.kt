package com.crystal.keppthetime_20211122.datas

import java.text.SimpleDateFormat
import java.util.*


class ScheduleData(

    var id: Int,
    var title: String,
    var datetime: Date,
    var place: String,
    var latitude: Double,
    var longitude: Double,
    var created_at: Date,
) {

//    datetime (약속일시) : Date로 저장되어있다.
//    기능 추가 -> Date => 가공된 String으로 내보내주는 함수.


    fun getFormattedDatetime() : String {

        val twoLineFormat = SimpleDateFormat("M월 d일\na h:mm")
        return twoLineFormat.format( this.datetime )


    }

}