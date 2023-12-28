package com.example.databaseonline.ui.home.screen

import androidx.compose.ui.Modifier
import com.example.databaseonline.navigation.DestinasiNavigasi
import com.example.databaseonline.ui.home.viewmodel.HomeViewModel


object DestinasiHome : DestinasiNavigasi {
    override val route = "home"
    override val titleRes = "Kontak"
}

fun HomeScreen(
    navigateToItemEntry: () -> Unit,
    modifier: Modifier = Modifier,
    onDetailClick: (Int) -> Unit = {},
){}