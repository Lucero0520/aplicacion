package com.example

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.nuevo_proyecto.R

class LoginActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Asegúrate de que 'activity_login' sea el nombre de tu archivo XML de layout (ej. activity_login.xml)
        setContentView(R.layout.login)

        val btnIrARegistro = findViewById<Button>(R.id.btnlogin)

        // Acción al hacer clic para ir a RegisterActivity
        btnIrARegistro.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }


    }
}