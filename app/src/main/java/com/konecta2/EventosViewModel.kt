package com.konecta2

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.konecta2.model.Eventos
import com.konecta2.network.Callback
import com.konecta2.network.FirestoreService
import java.lang.Exception

class EventosViewModel : ViewModel() {
    val firestoreService = FirestoreService()
    var listEventos : MutableLiveData<List<Eventos>> =
        MutableLiveData()
    var isLoading = MutableLiveData<Boolean>()

    fun refresh() {
        getEventosFromFirebase()
    }

    fun getEventosFromFirebase() {
        firestoreService.getEventos(object:
            Callback<List<Eventos>> {
            override fun onSuccess(result: List<Eventos>?) {
                listEventos.postValue(result)
                processFinished()
            }

            override fun onFailed(exception: Exception) {
                processFinished()
            }
        })
    }

    private fun processFinished() {
        isLoading.value = true
    }
}