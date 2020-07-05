package com.konecta2.model

import java.io.Serializable

class Eventos(
    s: String,
    s1: String,
    s2: String,
    evento: Int,
    s3: String
) : Serializable {
    var name = ""
    var descripcion = ""
    var fecha = ""
    var image = ""
    var community = ""
//    var category = 0
}