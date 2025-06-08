package com.example.nuevo_proyecto

import android.content.SharedPreferences
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ContactInfoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.infocuenta) // Usa el mismo layout

        val editName = findViewById<EditText>(R.id.editname)
        val editEmail = findViewById<EditText>(R.id.editEmailAddress)
        val editPhone = findViewById<EditText>(R.id.editTextPhone)
        val editLocation = findViewById<EditText>(R.id.editTextDate)
        val btnEditEmail = findViewById<Button>(R.id.btn_edit_email)
        val btnAddPhone = findViewById<Button>(R.id.btn_add_phone)
        val btnAddLocation = findViewById<Button>(R.id.btn_add_location)
        val btnConfig = findViewById<Button>(R.id.config)

        val sharedPreferences = getSharedPreferences("PerfilData", MODE_PRIVATE)
        editName.setText(sharedPreferences.getString("name", ""))
        editEmail.setText(sharedPreferences.getString("email", ""))
        editPhone.setText(sharedPreferences.getString("phone", ""))
        editLocation.setText(sharedPreferences.getString("location", ""))

        // Guardar Email
        btnEditEmail.setOnClickListener {
            val email = editEmail.text.toString()
            if (email.isNotEmpty()) {
                sharedPreferences.edit().putString("email", email).apply()
                Toast.makeText(this, "Email guardado", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Ingrese un email válido", Toast.LENGTH_SHORT).show()
            }
        }

        // Guardar Número de Celular
        btnAddPhone.setOnClickListener {
            val phone = editPhone.text.toString()
            if (phone.isNotEmpty()) {
                sharedPreferences.edit().putString("phone", phone).apply()
                Toast.makeText(this, "Número de celular guardado", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Ingrese un número válido", Toast.LENGTH_SHORT).show()
            }
        }

        // Guardar Lugar de Residencia
        btnAddLocation.setOnClickListener {
            val location = editLocation.text.toString()
            if (location.isNotEmpty()) {
                sharedPreferences.edit().putString("location", location).apply()
                Toast.makeText(this, "Lugar de residencia guardado", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Ingrese un lugar válido", Toast.LENGTH_SHORT).show()
            }
        }

        // Botón de Configuración (puedes agregar funcionalidad aquí)
        btnConfig.setOnClickListener {
            Toast.makeText(this, "Abriendo Configuración...", Toast.LENGTH_SHORT).show()
        }
    }
}
