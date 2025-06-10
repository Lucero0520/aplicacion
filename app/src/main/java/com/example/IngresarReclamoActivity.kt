package com.example

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.nuevo_proyecto.OptionActivity
import com.example.nuevo_proyecto.R

class IngresarReclamoActivity : AppCompatActivity() {
    // La anotación @SuppressLint("MissingInflatedId") ya no es necesaria si no buscas IDs de vistas
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ingresar_reclamo1)

        val btnCancelar = findViewById<TextView>(R.id.btnCancelar)

        btnCancelar.setOnClickListener {
            val intent = Intent(this, OptionActivity::class.java)
            startActivity(intent)
        }

    }
}