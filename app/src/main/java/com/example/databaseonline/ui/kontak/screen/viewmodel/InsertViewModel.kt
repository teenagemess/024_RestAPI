package com.example.databaseonline.ui.kontak.screen.viewmodel

import com.example.databaseonline.modeldata.Kontak


data class InsertUiEvent(
    val id: Int = 0,
    val nama: String = "",
    val email: String = "",
    val nohp: String = "",
)

data class InsertUiState(
    val insertUiEvent: InsertUiEvent = InsertUiEvent(),
)

fun InsertUiEvent.toKontak(): Kontak = Kontak(
    id = id,
    nama = nama,
    email = email,
    nohp = nohp
)

fun Kontak.toInsertUiEvent(): InsertUiEvent = InsertUiEvent(
    id = id,
    nama = nama,
    email = email,
    nohp = nohp
)

fun Kontak.toUiStateKontak(): InsertUiState = InsertUiState(
    insertUiEvent = toInsertUiEvent(),
)
