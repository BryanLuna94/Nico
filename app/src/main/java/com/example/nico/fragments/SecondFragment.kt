package com.example.nico.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.nico.AdapterDatos
import com.example.nico.Modelo.HorarioModel
import com.example.nico.R
import kotlinx.android.synthetic.main.fragment_second.*

class SecondFragment : Fragment(){

    private val mListaHorarios = listOf(
        HorarioModel("08:00 AM", estado = 0),
        HorarioModel("09:00 AM", estado = 0),
        HorarioModel("10:00 AM", estado = 0),
        HorarioModel("12:00 AM", estado = 0),
        HorarioModel("01:00 PM", estado = 0),
        HorarioModel("02:00 PM", estado = 0),
        HorarioModel("03:00 PM", estado = 0),
        HorarioModel("04:00 PM", estado = 0),
        HorarioModel("05:00 PM", estado = 0),
        HorarioModel("06:00 PM", estado = 0),
        HorarioModel("07:00 PM", estado = 0),
        HorarioModel("08:00 PM", estado = 0),
        HorarioModel("09:00 PM", estado = 0),
        HorarioModel("12:00 PM", estado = 0)
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        retainInstance = true
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? =
        inflater.inflate(R.layout.fragment_second, container, false)


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        list_recycler_view.apply {
            layoutManager = LinearLayoutManager(activity)
            adapter = AdapterDatos(mListaHorarios)
        }
    }

    companion object {
        @JvmStatic
        fun newInstance() = SecondFragment()
    }

}