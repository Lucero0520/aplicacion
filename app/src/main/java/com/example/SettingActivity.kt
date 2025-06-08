package com.example

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.ComponentActivity
import androidx.appcompat.app.AppCompatActivity
import com.example.nuevo_proyecto.OptionActivity
import com.example.nuevo_proyecto.R



class SettingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.opciones)
        val buttonMetodoPago = findViewById<Button>(R.id.button_metodo)


        buttonMetodoPago.setOnClickListener {
            val intent = Intent(this, OptionActivity::class.java)
            startActivity(intent)
        }

    }
}
