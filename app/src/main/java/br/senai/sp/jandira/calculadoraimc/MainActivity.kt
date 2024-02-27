package br.senai.sp.jandira.calculadoraimc

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
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
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
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
            color = Color.White,
            modifier = Modifier
                .padding(top = 18.dp))

    }
    Column {


        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .padding(start = 51.dp, top = 190.dp)
                .height(height = 350.dp)
                .width(width = 285.dp)
                .shadow(12.dp)
                .background(
                    color = Color(0xFFE9E8E8),
                    shape = RoundedCornerShape(16.dp)
                )
        ) {



                Text(
                    modifier = Modifier
                        .padding(top = 40.dp),
                    text = "Seus dados",
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFFCA1248)
                )

                Spacer(modifier = Modifier.height(16.dp))
            Column {
                Text(
                    text = "Seu peso",
                    fontSize = 10.sp,
                    color = Color(0xFFCA1248))
                Spacer(modifier = Modifier.height(6.dp))
                OutlinedTextField(
                    colors = OutlinedTextFieldDefaults
                        .colors(unfocusedBorderColor = Color(0xFFCA1248)),
                    value = "",
                    onValueChange = {},
                    modifier = Modifier
                        .background(color = Color.White)
                        .width(width = 250.dp)
                        .height(height = 53.dp),
                    placeholder = {

                        Text(text = "Seu peso em kg",
                            color = Color(0xFFAFAFAF)
                        )

                    },


                    )
            }


                Spacer(modifier = Modifier.height(16.dp))

        Column {

            Text(
                text = "Sua altura",
                fontSize = 10.sp,
                color = Color(0xFFCA1248)
            )


            Spacer(modifier = Modifier.height(6.dp))

            OutlinedTextField(
                colors = OutlinedTextFieldDefaults
                    .colors(unfocusedBorderColor = Color(0xFFE61753),
                    ),
                value = "",
                onValueChange = {},
                modifier = Modifier
                    .background(color = Color.White)
                    .width(width = 250.dp)
                    .height(height = 53.dp),
                placeholder = {
                    Text(text = "Sua altura em cm"
                        ,
                        color = Color(0xFFAFAFAF))
                },

                )
        }

            Button(onClick = { /*TODO*/ },
                shape = RoundedCornerShape(6.dp),
                colors = ButtonDefaults.buttonColors(Color(0xFFCA1248)), modifier = Modifier
                    .padding(top = 30.dp)
                    .width(250.dp)
                    .height(43.dp)){
                Text(text = "Calcular")

            }







        }

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .width(335.dp)
                .height(150.dp)
                .padding(
                    start = 50.dp,
                    top = 50.dp
                )
                .shadow(12.dp)
                .background(
                    color = Color(0xFF439C4C),
                    shape = RoundedCornerShape(10.dp)
                )) {



            Row {
                Column {
                    Text(text = "Resultado",
                        color = Color.White,
                        fontWeight = FontWeight.Light,
                        modifier = Modifier
                            .padding(top = 15.dp, start = 7.dp)
                        )

                    Spacer(modifier = Modifier
                        .height(15.dp))

                    Text(text = "Peso Ideal",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Light,
                        color = Color.White)
                }


                Spacer(modifier = Modifier
                    .width(35.dp))

                Text(text = "21.3",
                    color = Color.White,
                    fontSize = 45.sp,
                    fontWeight = FontWeight.SemiBold,
                    modifier = Modifier
                        .padding(18.dp)

                )
            }
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