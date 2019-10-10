package com.example.nico.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.nico.CalendarioPageAdapter
import com.example.nico.R
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.activity_home.view.*
import kotlinx.android.synthetic.main.fragment_first.*

class FirstFragment : Fragment(){

    var listener:Listener?=null

    // Overrides Fragment
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        clvCita.setOnDateChangeListener { view, year, month, dayOfMonth ->
            val msg = "Selected date is " + dayOfMonth + "/" + (month + 1) + "/" + year
            Toast.makeText(context, msg, Toast.LENGTH_SHORT).show()
            listener?.goToPage(CalendarioPageAdapter.SECOND_FRAGMENT)
        }
    }

    companion object {
        @JvmStatic
        fun newInstance() = FirstFragment()
    }

    interface Listener{
        fun goToPage(pagina:Int)
    }

}