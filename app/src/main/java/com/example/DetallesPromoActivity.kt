package com.example

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import com.example.nuevo_proyecto.R

class DetallesPromoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_promo)

        val houseButton = findViewById<ImageButton>(R.id.houseinicio)
        val promoButton = findViewById<ImageButton>(R.id.promo)
        val carButton = findViewById<ImageButton>(R.id.car)
        val detailButton = findViewById<Button>(R.id.detalles)

        detailButton.setOnClickListener {
            val intent = Intent(this, PedidosActivity::class.java)
            startActivity(intent)
        }

        promoButton.setOnClickListener {
            val intent = Intent(this, ProductActivity::class.java)
            startActivity(intent)
        }

        houseButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        carButton.setOnClickListener {
            val intent = Intent(this, PromoActivity::class.java)
            startActivity(intent)
        }
    }
}
