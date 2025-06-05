package com.example

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.nuevo_proyecto.R

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.register) // usa el nombre de tu archivo XML (sin .xml)
        val btnIrARegistro = findViewById<Button>(R.id.btnRegistro)
        // Referencia al botón (asegúrate de que tenga el ID en el XML)


    }
}