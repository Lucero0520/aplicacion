package com.example

import android.annotation.SuppressLint
import com.example.nuevo_proyecto.R
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)

        val btnIrAMainActivity = findViewById<Button>(R.id.btnlogin)

        btnIrAMainActivity.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val tvIrARegister = findViewById<TextView>(R.id.tvCrearCuenta)

        tvIrARegister.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }



    }
}