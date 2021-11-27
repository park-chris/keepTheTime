package com.crystal.keppthetime_20211122

import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.crystal.keppthetime_20211122.databinding.ActivityMainBinding

class MainActivity : BaseActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
    }

    override fun setupEvents() {
    }

    override fun setValues() {
    }
}