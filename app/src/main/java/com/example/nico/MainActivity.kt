package com.example.nico

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import kotlinx.android.synthetic.main.activity_main.*

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

        //if (usuario == "947332996" && clave == "947332996"){
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        //}
    }
}
