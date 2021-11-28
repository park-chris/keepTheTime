package com.crystal.keppthetime_20211122

import android.database.DatabaseUtils
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.crystal.keppthetime_20211122.databinding.ActivityAddFriendMainBinding

class AddFriendMainActivity : BaseActivity() {

    lateinit var binding : ActivityAddFriendMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_add_friend_main)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {
    }

    override fun setValues() {
    }
}