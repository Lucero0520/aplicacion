package com.example

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import com.example.nuevo_proyecto.CheckDialogFragment
import com.example.nuevo_proyecto.R

class PedidosActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pedidos) // Asegúrate de que el XML se llame pedidos.xml

        val atrasbutton = findViewById<ImageButton>(R.id.back_button)
        atrasbutton.setOnClickListener {
            val intent = Intent(this, DetallesPromoActivity::class.java)
            startActivity(intent)
        }

        val confirmButton = findViewById<Button>(R.id.button_check)
        confirmButton.setOnClickListener {
            val modal = CheckDialogFragment()
            modal.show(supportFragmentManager, "CheckDialog")
        }



    }
}
