package com.example.myapplicationdiscusionderesultados

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

lateinit var numero1: EditText
lateinit var numero2: EditText
lateinit var sumar: Button
lateinit var resultado: TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        numero1 = findViewById(R.id.txtNumero1)
        numero2 = findViewById(R.id.txtNumero2)
        sumar = findViewById(R.id.btnSumar)
        resultado = findViewById(R.id.lblResultado)

        sumar.setOnClickListener{
            resultado.setText(
                "La suma es: "+(numero1.text.toString().toFloat()+numero2.text.toString().toFloat())
            )
        }


    }
}