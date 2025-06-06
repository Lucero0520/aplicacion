package com.example.app.ui.theme

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.nuevo_proyecto.R

class MainActivity : AppCompatActivity() {
    // La anotación @SuppressLint("MissingInflatedId") ya no es necesaria si no buscas IDs de vistas
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Asegúrate de que 'activity_main' sea el nombre de tu archivo XML de layout (ej. activity_main.xml)
        setContentView(R.layout.activity_main)

        // Toda la lógica de botones y navegación ha sido eliminada para simplificar
    }
}