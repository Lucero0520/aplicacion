package com.example.nuevo_proyecto

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.ProfileActivity
import android.content.Intent
import android.widget.ImageButton

class PlinActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.plin) // Muestra la pantalla de Yape
        val atrasbutton = findViewById<ImageButton>(R.id.back_button)
        atrasbutton.setOnClickListener {
            val intent = Intent(this, OptionActivity::class.java)
            startActivity(intent)
        }
    }

}
