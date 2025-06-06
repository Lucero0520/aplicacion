<<<<<<<< HEAD:app/src/main/java/com/example/RegisterActivity.kt
package com.example
========
package com.example.app.ui.theme
>>>>>>>> 3a6784df1bc8571ba5502db96085dc9049c8e43d:app/src/main/java/com/example/app/ui/theme/RegisterActivity.kt

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.nuevo_proyecto.R

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.register) // usa el nombre de tu archivo XML (sin .xml)
        val btnIrARegistro = findViewById<Button>(R.id.btnRegistro)
        // Referencia al botón (asegúrate de que tenga el ID en el XML)


    }
}