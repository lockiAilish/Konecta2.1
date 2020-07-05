package com.konecta2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.floatingactionbutton.FloatingActionButton

class Feedback : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feedback)


        val enviarFB: FloatingActionButton = findViewById(R.id.feedBack_button)

        enviarFB.setOnClickListener { view ->
            Toast.makeText(this, "¡Gracias por tu participación!", Toast.LENGTH_LONG).show()
            finish()
        }
    }
}

//override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
//    val root = inflater.inflate(R.layout.fragment_main, container, false)
//
//    this contains a ratingbar, maybe it will be used in future
//    btn = root.findViewById<View>(R.id.button) as Button
//    rb = root.findViewById<View>(R.id.rb) as RatingBar
//    btn.setOnClickListener {
//        val ratingvalue = rb.rating
//        Toast.makeText(context!!, "Rating is: " + ratingvalue, Toast.LENGTH_LONG).show()
//    }
//
//    return root
//}