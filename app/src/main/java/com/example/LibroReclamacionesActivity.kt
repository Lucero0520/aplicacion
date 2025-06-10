package com.example

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.nuevo_proyecto.R

class LibroReclamacionesActivity : AppCompatActivity() {
    // La anotación @SuppressLint("MissingInflatedId") ya no es necesaria si no buscas IDs de vistas
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_libro_reclamaciones)

        val btnReclamo = findViewById<Button>(R.id.btnIngresar)

        btnReclamo.setOnClickListener {
            val intent = Intent(this, IngresarReclamoActivity::class.java)
            startActivity(intent)
        }

    }
}