package com.example.contadorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var contador = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnIncrementar.setOnClickListener {
            contador++
            TxtContador.text = "$contador"

        }

        btnDecrementar.setOnClickListener{

            contador--
            TxtContador.text = "$contador"

        }

    }
}