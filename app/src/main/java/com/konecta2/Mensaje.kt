package com.konecta2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.floatingactionbutton.FloatingActionButton

class Mensaje : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mensaje)

        val enviar: FloatingActionButton = findViewById(R.id.enviar_AButton)

        enviar.setOnClickListener { view ->
            Toast.makeText(this, "Mensaje enviado", Toast.LENGTH_LONG).show()
            finish()
        }
    }
}
