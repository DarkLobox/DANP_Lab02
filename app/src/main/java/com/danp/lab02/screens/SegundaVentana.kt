package com.danp.lab02.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.danp.lab02.R

private val messagesCosta: List<MyMessage> = listOf(
    MyMessage("Plato 01","Descripcion"),
    MyMessage("Plato 02", "Descripcion"),
    MyMessage("Plato 03","Descripcion"),
    MyMessage("Plato 04","Descripcion"),
    MyMessage("Plato 05","Descripcion"),
)
private val messagesSierra: List<MyMessage> = listOf(
    MyMessage("Plato 06","Descripcion"),
    MyMessage("Plato 07", "Descripcion"),
    MyMessage("Plato 08","Descripcion"),
    MyMessage("Plato 09","Descripcion"),
    MyMessage("Plato 10","Descripcion"),
)
private val messagesSelva: List<MyMessage> = listOf(
    MyMessage("Plato 11","Descripcion"),
    MyMessage("Plato 12", "Descripcion"),
    MyMessage("Plato 13","Descripcion"),
    MyMessage("Plato 14","Descripcion"),
    MyMessage("Plato 15","Descripcion"),
)

@Composable
fun SegundaVentana(navController: NavController, text: String?){
    var color_designado = Color(0xFFE01404)
    if(text == "Costa") {
        color_designado = Color(0xFFFFEB3B)
    } else if(text == "Sierra") {
        color_designado = Color(0xFFA36E20)
    } else {
        color_designado = Color(0xFF4CAF50)
    }

    Scaffold(topBar = {
        TopAppBar(backgroundColor = color_designado) {
            Icon(imageVector = Icons.Default.ArrowBack,
                contentDescription = "Arrow back",
                modifier = Modifier.clickable {
                    navController.popBackStack()
                })
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = "Platos Tipicos de la " + text)
            if(text == "Costa") {

            } else if(text == "Sierra") {

            } else {

            }
        }
    }) {
        if(text == "Costa") {
            ListaCosta(navController, text, messagesCosta)

        } else if(text == "Sierra") {
            ListaSierra(navController, text, messagesSierra)
        } else {
            ListaSelva(navController, text, messagesSelva)
        }
    }
}

@Composable
fun ListaCosta(navController: NavController, text: String?, messages: List<MyMessage>) {
    LazyColumn {
        items(messages) { message->
            ContenidoCosta(navController = navController, text = text, message = message)
        }
    }
}

@Composable
fun ListaSierra(navController: NavController, text: String?, messages: List<MyMessage>) {
    LazyColumn {
        items(messages) { message->
            ContenidoSierra(navController = navController, text = text, message = message)
        }
    }
}

@Composable
fun ListaSelva(navController: NavController, text: String?, messages: List<MyMessage>) {
    LazyColumn {
        items(messages) { message->
            ContenidoSelva(navController = navController, text = text, message = message)
        }
    }
}

@Composable
fun ContenidoCosta(navController: NavController, text: String?, message: MyMessage) {
    Row(modifier = Modifier.padding(all = 10.dp)) {
        Image(
            painter = painterResource(R.drawable.ceviche),
            contentDescription = "",
            modifier = Modifier
                .size(100.dp)
        )
        Spacer(modifier = Modifier.width(15.dp))
        Column {
            Text(
                text = message.title,
                color = MaterialTheme.colors.secondaryVariant,
                style = MaterialTheme.typography.subtitle2
            )
            Spacer(modifier = Modifier.height(4.dp))
            Surface(shape = MaterialTheme.shapes.medium, elevation = 1.dp) {
                Text(
                    text = message.body,
                    modifier = Modifier.padding(all = 4.dp),
                    style = MaterialTheme.typography.body2
                )
            }
        }
    }
}

data class MyMessage(val title: String, val body: String)

@Composable
fun ContenidoSierra(navController: NavController, text: String?, message: MyMessage) {
    Row(modifier = Modifier.padding(all = 10.dp)) {
        Image(
            painter = painterResource(R.drawable.pachamanca),
            contentDescription = "",
            modifier = Modifier
                .size(100.dp)
        )

        Spacer(modifier = Modifier.width(15.dp))
        Column {
            Text(
                text = message.title,
                color = MaterialTheme.colors.secondaryVariant,
                style = MaterialTheme.typography.subtitle2
            )
            Spacer(modifier = Modifier.height(4.dp))
            Surface(shape = MaterialTheme.shapes.medium, elevation = 1.dp) {
                Text(
                    text = message.body,
                    modifier = Modifier.padding(all = 4.dp),
                    style = MaterialTheme.typography.body2
                )
            }
        }
    }
}

@Composable
fun ContenidoSelva(navController: NavController, text: String?, message: MyMessage) {
    Row(modifier = Modifier.padding(all = 10.dp)) {
        Image(
            painter = painterResource(R.drawable.juane),
            contentDescription = "",
            modifier = Modifier
                .size(100.dp)
        )
        Spacer(modifier = Modifier.width(15.dp))
        Column {
            Text(
                text = message.title,
                color = MaterialTheme.colors.secondaryVariant,
                style = MaterialTheme.typography.subtitle2
            )
            Spacer(modifier = Modifier.height(4.dp))
            Surface(shape = MaterialTheme.shapes.medium, elevation = 1.dp) {
                Text(
                    text = message.body,
                    modifier = Modifier.padding(all = 4.dp),
                    style = MaterialTheme.typography.body2
                )
            }
        }
    }
}

@Composable
fun SegundoContenido(navController: NavController, text: String?){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("")
        text?.let {
            Text(it)
        }
        Button(onClick = {
            navController.popBackStack()
        }) {
            Text ("")
        }
    }
}
