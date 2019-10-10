package com.example.nico.connect

import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class ApiClient {

    var gson = GsonBuilder()
        .setLenient()
        .setDateFormat("dd-MM-yyyy")
        .create()

    fun getClient(baseUrl: String): Retrofit {

        return Retrofit.Builder()
            .baseUrl(baseUrl)
            .addConverterFactory(GsonConverterFactory.create(gson))
            .build()
    }

}