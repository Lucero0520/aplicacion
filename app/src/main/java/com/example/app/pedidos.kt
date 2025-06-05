package com.example.app

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.nuevo_proyecto.R

class pedidos : AppCompatActivity() {  // Cambio de nombre de clase a PascalCase

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)

        // Verificar si el botón existe antes de referenciarlo
        val btnIrARegistro = findViewById<Button>(R.id.btnlogin)

        btnIrARegistro?.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}


