package com.example.app.ui.theme

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper // Importar Looper para Handler
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.nuevo_proyecto.R

class DeliveryActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // Corrección: cierre del paréntesis

        // Encuentra el botón por su ID y verifica si es null
        val btnIrACar = findViewById<Button>(R.id.car)

        if (btnIrACar == null) {
            android.util.Log.e("DeliveryActivity", "Error: btnIrACar es null. Verifica el ID en activity_main.xml")
        } else {
            btnIrACar.setOnClickListener {
                val intent = Intent(this, RegisterActivity::class.java)
                startActivity(intent)
            }
        }
    }
}
