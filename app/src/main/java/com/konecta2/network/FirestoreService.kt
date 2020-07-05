package com.konecta2.network

import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.FirebaseFirestoreSettings
import com.konecta2.Communities
import com.konecta2.model.Eventos

const val EVENTOS_COLLECTION_NAME = "eventos"
const val COMMUNITIES_COLLECTION_NAME = "comunidades"

class FirestoreService {
    val firebaseFirestore = FirebaseFirestore.getInstance()
    val settings = FirebaseFirestoreSettings.Builder().setPersistenceEnabled(true).build()

    init {
        firebaseFirestore.firestoreSettings = settings
    }

    fun getCommunities(callback: Callback<List<Communities>>) {
        firebaseFirestore.collection(COMMUNITIES_COLLECTION_NAME)
            .orderBy("category")
            .get()
            .addOnSuccessListener { result ->
                for (doc in result) {
                    val list = result.toObjects(Communities::class.java)
                    callback.onSuccess(list)
                    break
                }
            }
    }

    fun getEventos(callback: Callback<List<Eventos>>) {
        firebaseFirestore.collection(EVENTOS_COLLECTION_NAME)
            .orderBy("datetime")
            .get()
            .addOnSuccessListener { result ->
                for (doc in result) {
                    val list = result.toObjects(Eventos::class.java)
                    callback.onSuccess(list)
                    break
                }
            }
    }
}