package com.example.nico

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.fragment.app.FragmentStatePagerAdapter
import com.example.nico.fragments.FirstFragment
import com.example.nico.fragments.SecondFragment

class CalendarioPageAdapter(fm: FragmentManager?, listener: FirstFragment.Listener) : FragmentPagerAdapter(fm) {

    val firsFragmentListener=listener

    var firstFragment: FirstFragment = FirstFragment.newInstance()
    var secondFragment: SecondFragment = SecondFragment.newInstance()
    var thirdFragment: FirstFragment = FirstFragment.newInstance()

    override fun getCount(): Int {
        return 3
    }

    override fun getItem(position: Int): Fragment? {
        return when(position){
            FIRST_FRAGMENT -> {
                firstFragment.listener = firsFragmentListener
                firstFragment
            }
            SECOND_FRAGMENT -> { secondFragment }
            THIRD_FRAGMENT -> { thirdFragment }
            else -> null
        }
    }

    companion object {
        const val FIRST_FRAGMENT = 0
        const val SECOND_FRAGMENT = 1
        const val THIRD_FRAGMENT = 2
    }

}
