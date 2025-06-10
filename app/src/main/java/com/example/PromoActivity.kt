package com.example

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import com.example.nuevo_proyecto.R
import android.widget.Button


class PromoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_promo)

        val houseButton = findViewById<ImageButton>(R.id.houseinicio)
        val promoButton = findViewById<ImageButton>(R.id.promo)
        val carButton   = findViewById<ImageButton>(R.id.car)
        val perfilButton = findViewById<ImageButton>(R.id.perfil)
        val detallesButton = findViewById<Button>(R.id.detalles)


        promoButton.setOnClickListener {
            val intent = Intent(this, ProductActivity::class.java)
            startActivity(intent) // Inicia la nueva actividad
        }

        houseButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        carButton.setOnClickListener {
            val intent = Intent(this, PromoActivity::class.java)
            startActivity(intent)
        }
        perfilButton.setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }
        detallesButton.setOnClickListener {
            val intent = Intent(this, DetallesPromoActivity::class.java)
            startActivity(intent)
        }

    }
}



