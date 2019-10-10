package com.example.nico

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.nico.Modelo.LoginRequest
import com.example.nico.Modelo.LoginResponse

import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Response
import javax.security.auth.callback.Callback

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       btnLogin.setOnClickListener {
           login()
       }

    }

    private fun login(){
        val usuario:String= etUsuario.text.toString()
        val clave:String= etClave.text.toString()


        val service=NicoApplication().getApiService()

        val call = service?.login(LoginRequest(usuario, clave))


        service?.login(LoginRequest(usuario, clave))?.enqueue(object : Callback<LoginResponse> {

            override fun onResponse(call: Call<LoginResponse>, response: Response<LoginResponse>) {

                Log.i("", "post submitted to API." + response.body()!!)
            }

            override fun onFailure(call: Call<LoginResponse>, t: Throwable) {

            }
        })

        //if (usuario == "947332996" && clave == "947332996"){
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        //}
    }
}
