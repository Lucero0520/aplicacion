package com.example

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

        // Configurar el botón para cerrar ProductActivity y volver a MainActivity
        houseButton.setOnClickListener {
            finish() // Cierra ProductActivity y vuelve a MainActivity
        }
    }
}
