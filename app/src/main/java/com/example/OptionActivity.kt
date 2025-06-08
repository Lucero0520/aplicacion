package com.example.nuevo_proyecto

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity

import com.example.MainActivity

import android.widget.ImageButton



class OptionActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.opciones) // Asegúrate de que 'opciones.xml' existe en res/layout

        val btnMetodoPago = findViewById<Button>(R.id.button_metodo)
        val backButton = findViewById<ImageButton>(R.id.back_button)


        btnMetodoPago.setOnClickListener {
            val intent = Intent(this, CardsActivity::class.java)
            startActivity(intent)
        }
        backButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
