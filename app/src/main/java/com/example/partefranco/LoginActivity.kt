package com.partefranco.tuapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.iniciosesion) // Tu layout XML

        // Vinculamos el botón
        val btnIrARegistro = findViewById<Button>(R.id.btnIrARegistro)

        // Acción al hacer clic
        btnIrARegistro.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }
    }
}