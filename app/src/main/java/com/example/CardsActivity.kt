package com.example.nuevo_proyecto

import android.os.Bundle
import android.content.Intent
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity


class CardsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.cards) // Vincula con la interfaz de métodos de pago

        // Botón para volver a MainActivity

        val buttonYape = findViewById<ImageButton>(R.id.button_yap)
        val buttonPlin = findViewById<ImageButton>(R.id.plincard)
        val atrasbutton = findViewById<ImageButton>(R.id.back_button)

        buttonYape.setOnClickListener {
            val intent = Intent(this, YapeActivity::class.java)
            startActivity(intent)
        }
        buttonPlin.setOnClickListener {
            val intent = Intent(this, PlinActivity::class.java)
            startActivity(intent)
        }
        atrasbutton.setOnClickListener {
            val intent = Intent(this, OptionActivity::class.java)
            startActivity(intent)
        }
    }
}
