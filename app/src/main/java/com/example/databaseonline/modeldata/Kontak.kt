package com.example.databaseonline.modeldata

import kotlinx.serialization.Serializable

@Serializable
data class Kontak(
    val id : Int,
    val nama : String,
    val email : String,
    val nohp : String
)
