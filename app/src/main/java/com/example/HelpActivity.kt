package com.example

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import com.example.nuevo_proyecto.OptionActivity
import com.example.nuevo_proyecto.R

class HelpActivity : AppCompatActivity() {
    // La anotación @SuppressLint("MissingInflatedId") ya no es necesaria si no buscas IDs de vistas
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.help)

        val btnExit = findViewById<ImageButton>(R.id.exit)

        btnExit.setOnClickListener {
            val intent = Intent(this, OptionActivity::class.java)
            startActivity(intent)
        }
    }


}