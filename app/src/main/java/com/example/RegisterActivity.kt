package com.example // Asegúrate de que el paquete sea correcto

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.nuevo_proyecto.R

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.register) // Vincula con register.xml
        val btnIrARegistro = findViewById<Button>(R.id.btnRegistro)
        btnIrARegistro.setOnClickListener {

        }
    }
}
