package com.example.parteezio1

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.activity.ComponentActivity
import com.example.parteezio1.R

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Este es el layout que quieres mostrar primero
        setContentView(R.layout.activity_detalles_promo)

        // Buscar el botón por su ID
        val botonAgregar = findViewById<Button>(R.id.btnAgregar)

        //// Asignar la acción al botón "activity_detalles_promo"
        botonAgregar.setOnClickListener {
            Toast.makeText(this, "Pedido agregado", Toast.LENGTH_SHORT).show()
        }
        //// Asignar la acción al boton "activity_metodopago_plin"
        /*val btnPagar = findViewById<Button>(R.id.btnPagar)

        btnPagar.setOnClickListener {
            Toast.makeText(this, "Pago realizado correctamente", Toast.LENGTH_SHORT).show()
        }*/

    }
}
