package com.example.app.ui.theme

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.nuevo_proyecto.R
import com.example.app.ui.theme.RegisterActivity

class LoginActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Asegúrate de que 'activity_login' sea el nombre de tu archivo XML de layout (ej. activity_login.xml)
        setContentView(R.layout.activity_login)

        val btnIrARegistro = findViewById<Button>(R.id.btnIngresar)

        // Acción al hacer clic para ir a RegisterActivity
        btnIrARegistro.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }


    }
}