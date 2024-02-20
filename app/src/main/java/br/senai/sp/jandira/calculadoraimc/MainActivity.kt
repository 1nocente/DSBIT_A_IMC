package br.senai.sp.jandira.calculadoraimc

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.calculadoraimc.ui.theme.CalculadoraIMCTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CalculadoraIMCTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting(){
    Column {
        Column (modifier = Modifier
            .background(color = Color(0xFFE61753))
            .height(height = 230.dp)
            .fillMaxWidth()
        ){
            Image(
                painter = painterResource(id = R.drawable.imc),
                contentDescription = "logo IMC",
                modifier = Modifier
                    .size(height = 100.dp, width = 100.dp)
                    .padding(top = 30.dp,)
            )

            Text(text = "Calculadora IMC",
                fontSize = 30.sp,
                fontWeight = FontWeight.SemiBold,
                color = Color.White
            )

        }

        Column(modifier = Modifier
            .height(height = 350.dp)
            .width(width = 260.dp)
            .background(color = Color(0xFFC9C7C7))
        ) {
            Text(text = "Seus dados",
                fontSize = 30.sp,
                fontWeight = FontWeight.SemiBold,
                color = Color(0xFFCA1248)
            )

            Spacer(modifier = Modifier.height(16.dp))


            TextField(
                value = "",
                onValueChange ={},
                modifier = Modifier
                    .background(color = Color.White)
                    .width(width = 200.dp)
                    .height(height = 55.dp),
                placeholder = {
                    Text(text = "Seu peso em kg")
                },

            )

            Spacer(modifier = Modifier.height(16.dp))

            TextField(
                value = "",
                onValueChange ={},
                modifier = Modifier
                    .background(color = Color.White)
                    .width(width = 200.dp)
                    .height(height = 55.dp),
                placeholder = {
                    Text(text = "Sua altura em cm")
                },

                )


        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    CalculadoraIMCTheme {
        Greeting()
    }
}