package com.example.nuevo_proyecto.ui.theme

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import com.example.nuevo_proyecto.R

class PromoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_promo)

        val btnDetallePromo1 = findViewById<ImageButton>(R.id.btnDetallePromo1)
        val btnDetallePromo2 = findViewById<ImageButton>(R.id.btnDetallePromo2)
        val btnDetallePromo3 = findViewById<ImageButton>(R.id.btnDetallePromo3)

        val intent = Intent(this, DetallesPromoActivity::class.java)

        btnDetallePromo1.setOnClickListener {
            startActivity(intent)
        }
        btnDetallePromo1.setOnClickListener {
            startActivity(intent)
        }
        btnDetallePromo1.setOnClickListener {
            startActivity(intent)
        }
    }
}

