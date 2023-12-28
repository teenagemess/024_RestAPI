package com.example.databaseonline.ui.home.screen

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.databaseonline.navigation.DestinasiNavigasi
import com.example.databaseonline.ui.home.viewmodel.HomeViewModel


object DestinasiHome : DestinasiNavigasi {
    override val route = "home"
    override val titleRes = "Kontak"
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(
    navigateToItemEntry: () -> Unit,
    modifier: Modifier = Modifier,
    onDetailClick: (Int) -> Unit = {},

){
    val scrollBehavior = TopAppBarDefaults.enterAlwaysScrollBehavior()



}