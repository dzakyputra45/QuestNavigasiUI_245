package com.example.appnavigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

enum class Navigasi {
    Formulir,
    Ddetail
}


@Composable
fun DataApp(
    navController : NavHostController = rememberNavController(),
    modifier: Modifier
){

}