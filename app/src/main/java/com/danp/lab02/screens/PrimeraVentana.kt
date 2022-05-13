package com.danp.lab02.screens

import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.danp.lab02.navigation.AppScreens
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.danp.lab02.R


@Composable
fun PrimeraVentana(navController: NavController){
    Scaffold(topBar = {
        TopAppBar() {
            Text(text = "Regiones")
        }
    }) {
        Contenido(navController)
    }
}

@Composable
fun Contenido(navController: NavController){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start
    ) {
        Row(
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Button(onClick = {
                navController.navigate(route = AppScreens.SegundaVentana.route + "/Costa")
            },  shape = MaterialTheme.shapes.small,
                colors = ButtonDefaults.textButtonColors(
                    backgroundColor = Color(0xFFFFEB3B)
                )) {

                Image(
                    painter = painterResource(R.drawable.costa),
                    contentDescription = "Región Costa",
                    modifier = Modifier.size(192.dp)
                )
            }

            Spacer(Modifier.size(50.dp))

            Button(onClick = {
                navController.navigate(route = AppScreens.SegundaVentana.route + "/Costa")
            }, shape = MaterialTheme.shapes.small,
                colors = ButtonDefaults.textButtonColors(backgroundColor = Color(0xFFFFEB3B),
                    contentColor = Color(0xFF000000)
                ),
                ) {
                Text ("Costa")
            }
        }
        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Button(onClick = {
                navController.navigate(route = AppScreens.SegundaVentana.route + "/Sierra")
            },  shape = MaterialTheme.shapes.small,
                colors = ButtonDefaults.textButtonColors(backgroundColor = Color(0xFFA36E20))) {
                Image(
                    painter = painterResource(R.drawable.sierra),
                    contentDescription = "Región Sierra",
                    modifier = Modifier.size(192.dp)
                )
            }

            Spacer(Modifier.size(50.dp))

            Button(onClick = {
                navController.navigate(route = AppScreens.SegundaVentana.route + "/Sierra")
            }, shape = MaterialTheme.shapes.small,
                colors = ButtonDefaults.textButtonColors(backgroundColor = Color(0xFFA36E20),
                    contentColor = Color(0xFF000000))
            ) {
                Text ("Sierra")
            }
        }
        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Button(onClick = {
                navController.navigate(route = AppScreens.SegundaVentana.route + "/Selva")
            },  shape = MaterialTheme.shapes.small,
                colors = ButtonDefaults.textButtonColors(backgroundColor = Color(0xFF4CAF50),)) {
                Image(
                    painter = painterResource(R.drawable.selva),
                    contentDescription = "Región Costa",
                    modifier = Modifier.size(192.dp)
                )
            }

            Spacer(Modifier.size(50.dp))

            Button(onClick = {
                navController.navigate(route = AppScreens.SegundaVentana.route + "/Selva")
            }, shape = MaterialTheme.shapes.small,
                colors = ButtonDefaults.textButtonColors(backgroundColor = Color(0xFF4CAF50),
                    contentColor = Color(0xFF000000))
            ) {
                Text ("Selva")
            }
        }
    }
}

