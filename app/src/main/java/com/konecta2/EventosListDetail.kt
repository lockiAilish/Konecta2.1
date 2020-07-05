package com.konecta2

import android.os.Bundle
import android.view.*

import android.view.LayoutInflater
import android.view.View

import androidx.fragment.app.Fragment
import com.konecta2.R

class EventosListDetail : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_eventos_list, container, false)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
//            R.id.evento_comunidad -> {
//                true
//            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}