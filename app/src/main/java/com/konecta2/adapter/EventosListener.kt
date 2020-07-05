package com.konecta2.ui.view.adapter

import com.konecta2.model.Eventos

interface EventosListener {
    fun onEventoClicked(evento: Eventos, position: Int)
}
