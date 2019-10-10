package com.example.nico

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CalendarView
import android.widget.TableLayout
import android.widget.Toast
import androidx.viewpager.widget.ViewPager
import com.example.nico.fragments.FirstFragment

import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity(), FirstFragment.Listener {

    lateinit var viewPagerAdapter : CalendarioPageAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        viewPagerAdapter = CalendarioPageAdapter(supportFragmentManager, this)
        viewPager.setPagingEnabled(false)
        viewPager.offscreenPageLimit = 2
        viewPager.adapter = viewPagerAdapter

        btnFirst.setOnClickListener {
            showFragment(CalendarioPageAdapter.FIRST_FRAGMENT)
        }

        btnSecond.setOnClickListener {
            showFragment(CalendarioPageAdapter.SECOND_FRAGMENT)
        }

        btnThird.setOnClickListener {
            showFragment(CalendarioPageAdapter.THIRD_FRAGMENT)
        }
    }

    private fun showFragment(fragment: Int) {

        when (fragment) {
            CalendarioPageAdapter.FIRST_FRAGMENT -> {
                viewPager.setCurrentItem(0, false)
            }
            CalendarioPageAdapter.SECOND_FRAGMENT -> {
                viewPager.setCurrentItem(1, false)
            }
            CalendarioPageAdapter.THIRD_FRAGMENT -> {
                viewPager.setCurrentItem(2, false)
            }
        }

    }

    override fun goToPage(pagina: Int) {

        showFragment(pagina)

    }
}
