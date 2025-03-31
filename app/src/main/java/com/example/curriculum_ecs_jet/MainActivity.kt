package com.example.curriculum_ecs_jet

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CurriculumApp()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CurriculumApp() {
    val context = LocalContext.current

    Scaffold(
        topBar = {
            TopAppBar(title = { Text(text = "Eloi Calderon Salvans") })
        },
        floatingActionButton = {
            FloatingActionButton(onClick = {
                Toast.makeText(context, "Funcionalitat en construcció", Toast.LENGTH_SHORT).show()
            }) {
                Icon(imageVector = Icons.Default.Add, contentDescription = "Afegir")
            }
        }
    ) { paddingValues ->
        LazyColumn(modifier = Modifier
            .fillMaxSize()
            .background(Color.DarkGray)
            .padding(paddingValues)) {
            item {
                Image(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(300.dp),
                    painter = painterResource(id = R.drawable.imatgecurriculum),
                    contentDescription = "Imatge Eloi Calderon"
                )
                Text(
                    text = "Eloi Calderon Salvans",
                    fontSize = 32.sp,
                    color = Color.White,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.fillMaxWidth()
                )
                Text(
                    text = "Enllaç GitHub: https://github.com/eloicalderonsalvans",
                    fontSize = 20.sp,
                    textAlign = TextAlign.Center,
                    color = Color.White,
                    modifier = Modifier.fillMaxWidth()
                )
                Text(
                    text = "Correu Electrònic: ecalderon.dam@institutcampalans.net",
                    fontSize = 20.sp,
                    textAlign = TextAlign.Center,
                    color = Color.White
                )
                LazyRow(
                    modifier = Modifier.fillMaxWidth().padding(16.dp),
                    horizontalArrangement = Arrangement.spacedBy(16.dp)
                ) {
                    item {
                        Text(text = "Número de telèfon: 622260032", fontSize = 18.sp, color = Color.White)
                    }
                    item {
                        Text(text = "CVC Electrònic: http://elservidor.cat/~elcampalab/campalab/m0tutoria/eloi/",
                            fontSize = 18.sp, color = Color.White)
                    }
                }
            }
            items(listOf("Kotlin", "Java", "C#", "Python", "JavaScript")) { language ->
                LanguageItem(language)
            }
        }
    }
}

@Composable
fun LanguageItem(language: String) {
    var likes by remember { mutableStateOf(0) }

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {
        Row(
            modifier = Modifier.padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(modifier = Modifier.weight(1f)) {
                Text(text = language, fontSize = 20.sp, color = Color.Black)
                Text(text = "Likes: $likes", fontSize = 16.sp, color = Color.Black)
            }
            Button(onClick = { likes++ }) {
                Text(text = "Like")
            }
        }
    }
}
