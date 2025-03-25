package com.example.curriculum_ecs_jet

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.curriculum_ecs_jet.ui.theme.Curriculum_ECS_JETTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            app()
        }
    }
}
@Preview
@Composable
fun app(){
    LazyColumn(modifier = Modifier
        .fillMaxSize()
        .background(Color.DarkGray)) {
        item { Image(
            modifier = Modifier
                .fillMaxWidth()
                .height(300.dp),
            painter = painterResource(id = R.drawable.imatgecurriculum),
            contentDescription = "imatge Eloi Calderon")
            Text(text = "Eloi Calderon Salvans", fontSize = 32.sp, color = Color.White, textAlign = TextAlign.Center,modifier = Modifier.fillMaxWidth())
            Text(text = "Enllaç GitHub: https://github.com/eloicalderonsalvans",fontSize = 20.sp, textAlign = TextAlign.Center,color = Color.White, modifier = Modifier.fillMaxWidth())
            Text(text = "Correu Electronic: ecalderon.dam@institutcampalans.net", fontSize = 20.sp, textAlign = TextAlign.Center,color = Color.White)

            LazyRow (horizontalArrangement = Arrangement.SpaceBetween, modifier = Modifier.fillMaxWidth().padding(16.dp)){
               item { Text(text = "Numero de telefon: 622260032",
                   fontSize =25.sp, color = Color.White)
                   Text(text = "CVC Electronic: http://elservidor.cat/~elcampalab/campalab/m0tutoria/eloi/",
                       fontSize =25.sp, color = Color.White)}
            }
        }
    }
}