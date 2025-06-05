package com.example

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import com.example.LoginActivity
import com.example.nuevo_proyecto.R

class IntroActivity : AppCompatActivity() {

    // Duración del splash screen en milisegundos (ej: 3000ms = 3 segundos)
    private val SPLASH_DURATION = 3000L // 'L' para indicar que es un Long

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.intro) // Vincula esta Activity con tu layout intro.xml

        // Usamos un Handler con el Looper principal para programar una tarea
        Handler(Looper.getMainLooper()).postDelayed({
            // Esta tarea se ejecuta después de SPLASH_DURATION milisegundos

            // Decide a qué Activity navegar
            val intent = Intent(this, LoginActivity::class.java) // Navega a LoginActivity

            // Inicia la siguiente Activity
            startActivity(intent)

            // Finaliza esta Activity (IntroActivity)
            // Esto es importante para que el usuario no pueda regresar a la pantalla de intro
            // presionando el botón de retroceso.
            finish()
        }, SPLASH_DURATION) // Pasa la duración que definimos
    }
}