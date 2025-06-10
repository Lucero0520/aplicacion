package com.example
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.nuevo_proyecto.R


class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.register) // Vincula con register.xml

        val btnIrARegistro = findViewById<Button>(R.id.btnRegistro)
        btnIrARegistro.setOnClickListener {

        }

        val tvIrALogin = findViewById<TextView>(R.id.tvIniciarSesion)

        tvIrALogin.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}