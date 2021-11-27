package com.crystal.keppthetime_20211122.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.crystal.keppthetime_20211122.fragments.MyProfileFragment
import com.crystal.keppthetime_20211122.fragments.SchduleListFragment

class MainViewPagerAdapter(fm : FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getCount() = 2

    override fun getItem(position: Int): Fragment {

        return  when(position) {
            0 -> SchduleListFragment()
            else -> MyProfileFragment()
        }

    }


}