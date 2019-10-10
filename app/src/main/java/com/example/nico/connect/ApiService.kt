package com.example.nico.connect

import com.example.nico.Modelo.LoginRequest
import com.example.nico.Modelo.LoginResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST


interface ApiService {

    @POST("autentication/login")
    fun login(@Body login:LoginRequest): Call<LoginResponse>

}