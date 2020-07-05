package com.konecta2.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
//import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
//import com.konecta2.EventosViewModel
import com.konecta2.R
import com.konecta2.model.Eventos
//import com.konecta2.ui.view.adapter.EventoAdapter
//import com.konecta2.ui.view.adapter.EventosListener
import kotlinx.android.synthetic.main.fragment_eventos_list.view.*

////first proof -> doesn't work
//class EventoFragment : Fragment(), EventosListener {
//
//    private lateinit var eventosAdapter: EventoAdapter
//    private lateinit var viewModel:EventosViewModel
//
//    override fun onCreateView(
//        inflater: LayoutInflater,
//        container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//        return inflater.inflate(R.layout.fragment_eventos_list, container, false)
//    }
//
//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
//
//        viewModel = ViewModelProviders.of(this).get(EventosViewModel::class.java)
//        viewModel.refresh()
//
//        eventosAdapter = EventoAdapter(this)
//
////        rvEventos.apply{
////            layoutManager = LinearLayout(view.context, LinearLayout.VERTICAL, false)
////            adapter = eventosAdapter
////        }
//        observeViewModel()
//    }
//
//    fun observeViewModel() {
//        viewModel.listEventos.observe(this, Observer<List<Eventos>> { eventos ->
//            eventosAdapter.updateData(eventos)
//        })
//
//        viewModel.isLoading.observe(this, Observer<Boolean> {
//            if (it != null) "Modelo"
////                rlBaseEvento.visibility = View.INVISIBLE
//        })
//    }
//
//    override fun onEventoClicked(even6: Eventos, position: Int) {
//        val bundle = bundleOf("even6" to even6)
////        findNavController().navigate(R.id.eventoDetailFragmentDialog, bundle)
//    }
//}
////second change
//class EventoFragment : Fragment() {
//    companion object {
//        fun newInstance() : EventoFragment = EventoFragment()
//    }
//
//    override fun onCreateView(
//        inflater: LayoutInflater,
//        container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? = inflater.inflate(R.layout.fragment_eventos_list, container, false)
//
//}

class EventoFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater!!.inflate(R.layout.fragment_eventos_list, container, false)
    }
}

// proof with tutorial
//class EventoFragment : Fragment() {
//    private lateinit var recyclerView: RecyclerView
//    private lateinit var viewAdapter: EventoAdapter
//    private lateinit var viewManager: RecyclerView.LayoutManager
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.fragment_eventos_list)
//
//        viewManager = LinearLayoutManager(this)
//        viewAdapter = EventoAdapter(Eventos)
//
//        recyclerView = findViewById<RecyclerView>(R.id.fragment_eventos_list_RV)
//        setHasFixedSize(true)
//
//        layoutManager = viewManager
//
//        adapter = viewAdapter
//    }
//}