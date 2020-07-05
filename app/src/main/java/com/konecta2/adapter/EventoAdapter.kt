package com.konecta2.ui.view.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.konecta2.R
import com.konecta2.model.Eventos
import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.ArrayList
//import com.konecta2.ui.view.adapter.EventosListener

class EventoAdapter(val eventosListener: EventosListener) : RecyclerView.Adapter<EventoAdapter.ViewHolder>() {

    private var listEventos = ArrayList<Eventos>()

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ) = EventoAdapter.ViewHolder(LayoutInflater.from(parent.context).inflate(
        R.layout.list_item_evento, parent, false))

    override fun getItemCount() = listEventos.size

    override fun onBindViewHolder(holder: EventoAdapter.ViewHolder, position: Int) {
        val evento = listEventos[position] as Eventos

//        holder.ivEventoImg. = even6.image
        holder.eventoName.text = evento.name

        val simpleDateformat = SimpleDateFormat("HH:mm")
//        val simpleDateformatAMPM = SimpleDateFormat("a")

        val cal = Calendar.getInstance()
//        cal.time = even6.fecha
        val hourFormat = simpleDateformat.format(evento.fecha)

        holder.eventoHour.text = hourFormat
        holder.eventoDescripcion.text = evento.descripcion
        holder.eventoComunidad.text = evento.community


        Glide.with(holder.itemView.context)
            .load(evento.image)
            .apply(RequestOptions.circleCropTransform())
            .into(holder.ivEventoImg)

        holder.itemView.setOnClickListener {
            eventosListener.onEventoClicked(evento, position)
            Toast.makeText(holder.itemView.context, "even6 seleccionado", Toast.LENGTH_LONG).show()
    }
}

    fun updateData(data: List<Eventos>){
        listEventos.clear()
        listEventos.addAll(data)
        notifyDataSetChanged()
    }

    class ViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView) {
        val ivEventoImg = itemView.findViewById<ImageView>(R.id.detail_image)
        val eventoName = itemView.findViewById<TextView>(R.id.evento_detail_name)
        val eventoDescripcion = itemView.findViewById<TextView>(R.id.evento_detail_description)
        val eventoHour = itemView.findViewById<TextView>(R.id.evento_hora)
        val eventoComunidad = itemView.findViewById<TextView>(R.id.evento_comunidad)
    }

    // add maybe it will be needly
    companion object {
        private val TAG = "EventoAdapter"
    }

    override fun getItemViewType(position: Int): Int {
        return super.getItemViewType(position)
//        val layout = LayoutInflater.from(coroutineContext).inflate(R.layout.fragment_eventos_list, parent, false)
    }
}