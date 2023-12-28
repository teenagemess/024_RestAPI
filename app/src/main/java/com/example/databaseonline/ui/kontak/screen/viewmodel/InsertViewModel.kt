package com.example.databaseonline.ui.kontak.screen.viewmodel

import com.example.databaseonline.modeldata.Kontak


data class InsertUiEvent(
    val id: Int = 0,
    val nama: String = "",
    val email: String = "",
    val nohp: String = "",
)

fun InsertUiEvent.toKontak(): Kontak = Kontak(
    id = id,
    nama = nama,
    email = email,
    nohp = nohp
)