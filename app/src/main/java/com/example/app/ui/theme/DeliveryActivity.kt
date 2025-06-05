package com.example.app.ui.theme

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper // Importar Looper para Handler
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.app.ui.theme.LoginActivity
import com.example.nuevo_proyecto.R

class DeliveryActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Asegúrate de que 'activity_login' sea el nombre de tu archivo XML de layout (ej. activity_login.xml)
        setContentView(R.layout.activity_login)

        val btnIrACar = findViewById<Button>(R.id.car)

        // Acción al hacer clic para ir a RegisterActivity
        btnIrACar.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }


    }

}