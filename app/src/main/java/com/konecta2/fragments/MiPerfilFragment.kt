package com.konecta2.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.konecta2.Feedback
import com.konecta2.R


class MiPerfilFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_profile, container, false)
        val btn = root.findViewById<Button>(R.id.feedBack_button)
        btn.setOnClickListener{
            val intent = Intent(context, Feedback::class.java)
            intent.putExtra("key", "Feedback")
            Toast.makeText(context, "Calificar la App", Toast.LENGTH_LONG).show()
            startActivity(intent)
        }
        return root
    }
}
