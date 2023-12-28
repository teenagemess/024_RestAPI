package com.example.databaseonline.ui

import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.databaseonline.KontakAplikation
import com.example.databaseonline.ui.home.viewmodel.HomeViewModel
import com.example.databaseonline.ui.kontak.screen.viewmodel.InsertViewModel

object PenyediaViewModel {
    val Factory = viewModelFactory {

        initializer {
            HomeViewModel(apkikasiMars().container.kontakRepository)
        }

        initializer {
            InsertViewModel(apkikasiMars().container.kontakRepository)
        }
    }
}

fun CreationExtras.apkikasiMars(): KontakAplikation =
    (this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY] as KontakAplikation)