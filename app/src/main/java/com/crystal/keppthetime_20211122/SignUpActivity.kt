package com.crystal.keppthetime_20211122

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.crystal.keppthetime_20211122.databinding.ActivitySignUpBinding
import com.crystal.keppthetime_20211122.datas.BasicResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class SignUpActivity : BaseActivity() {

    lateinit var binding : ActivitySignUpBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_sign_up)

        setupEvents()
        setValues()

    }

    override fun setupEvents() {


        binding.btnEmailCheck.setOnClickListener {

            val inputEmail = binding.edtEmail.text.toString()

            apiService.getRequestDuplCheck("EMAIL", inputEmail).enqueue(object  : Callback<BasicResponse> {
                override fun onResponse(
                    call: Call<BasicResponse>,
                    response: Response<BasicResponse>
                ) {

                    if (response.isSuccessful) {
                        Log.d("회원가입", "사용해도 좋습니다.")
                    }
                    else {
                        Log.d("회원가입", "사용하면 안됩니다.")
                    }

                }

                override fun onFailure(call: Call<BasicResponse>, t: Throwable) {


                }


            })

        }

        binding.btnOk.setOnClickListener {

//            입력값 추출

            val inputEmail = binding.edtEmail.text.toString()
            val inputPw = binding.edtPassword.text.toString()
            val inputNickname = binding.edtNickname.text.toString()


//            회원가입 기능 API 호출 -> 응답 메세지 확인 (성공시)

            apiService.putRequestSignUp(inputEmail, inputPw, inputNickname).enqueue( object : Callback<BasicResponse> {
                override fun onResponse(
                    call: Call<BasicResponse>,
                    response: Response<BasicResponse>
                ) {
                    if (response.isSuccessful) {

                        val basicResponse = response.body()!!

                        Log.d("응답내용", basicResponse.data.user.nickname)
                    }

                }

                override fun onFailure(call: Call<BasicResponse>, t: Throwable) {
                }


            })




        }

    }

    override fun setValues() {
    }
}