package com.example.nico

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.nico.Modelo.HorarioModel

class AdapterDatos(private val list: List<HorarioModel>)
    : RecyclerView.Adapter<MovieViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return MovieViewHolder(inflater, parent)
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        val movie: HorarioModel = list[position]
        holder.bind(movie)
    }

    override fun getItemCount(): Int = list.size

}

class MovieViewHolder(inflater: LayoutInflater, parent: ViewGroup) :
    RecyclerView.ViewHolder(inflater.inflate(R.layout.list_item, parent, false)) {
    private var mTitleView: TextView? = null
    private var mYearView: TextView? = null


    init {
        mTitleView = itemView.findViewById(R.id.list_title)
        mYearView = itemView.findViewById(R.id.list_description)
    }

    fun bind(movie: HorarioModel) {
        mTitleView?.text = movie.hora
        mYearView?.text = movie.estado.toString()
    }

}