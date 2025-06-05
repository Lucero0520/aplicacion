package com.example.app.ui.theme

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import com.example.nuevo_proyecto.R

class PedidosActivity : AppCompatActivity() {
    // Duración del splash screen en milisegundos (3 segundos)
    private val SPLASH_DURATION = 3000L

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pedidos) // Asegúrate de que el layout se llame 'pedidos.xml'

        // Usando Handler correctamente con Looper para postDelayed
        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish() // Cierra la actividad actual para que no quede en el back stack
        }, SPLASH_DURATION)
    }
}
