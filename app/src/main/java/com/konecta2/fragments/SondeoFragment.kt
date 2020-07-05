package com.konecta2.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment

import com.konecta2.R

class SondeoFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val root = inflater.inflate(R.layout.activity_sondeo_fragment, container, false)
        val btn = root.findViewById<Button>(R.id.sendSond_button)
        btn.setOnClickListener{
            Toast.makeText(context, "¡Gracias por tu respuestas!", Toast.LENGTH_LONG).show()
        }
        return root
        EventoFragment()
    }
}