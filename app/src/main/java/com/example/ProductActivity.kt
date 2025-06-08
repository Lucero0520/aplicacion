package com.example

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import com.example.nuevo_proyecto.R

class ProductActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.product) // Vincula con product.xml

        // Encuentra el botón en el diseño
        val houseButton = findViewById<ImageButton>(R.id.houseinicio)
        val promoButton = findViewById<ImageButton>(R.id.promo)
        val carButton = findViewById<ImageButton>(R.id.car)
        val perfilButton = findViewById<ImageButton>(R.id.perfil)

        // Configurar el botón para cerrar ProductActivity y volver a MainActivity
        houseButton.setOnClickListener {
            finish() // Cierra ProductActivity y vuelve a MainActivity
        }
        promoButton.setOnClickListener {
            val intent = Intent(this, ProductActivity::class.java)
            startActivity(intent) // Inicia la nueva actividad
        }

        carButton.setOnClickListener {
            val intent = Intent(this, PromoActivity::class.java)
            startActivity(intent)
        }
        perfilButton.setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }

    }
}
