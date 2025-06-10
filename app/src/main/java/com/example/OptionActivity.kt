package com.example.nuevo_proyecto

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity

import com.example.MainActivity

import android.widget.ImageButton
import android.widget.TextView
import com.example.HelpActivity
import com.example.LibroReclamacionesActivity
import com.example.LoginActivity


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

        findViewById<TextView>(R.id.terminosl)?.setOnClickListener {
            startActivity(Intent(this, HelpActivity::class.java))
            finish()
        }
        findViewById<TextView>(R.id.reclamacionl)?.setOnClickListener {
            startActivity(Intent(this, LibroReclamacionesActivity::class.java))
            finish()
        }

        findViewById<TextView>(R.id.cerraruni)?.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
            finish()
        }


    }
}
