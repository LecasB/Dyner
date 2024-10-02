package com.example.mytests.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mytests.R
import com.example.mytests.Utils.Components.ButtonComp
import com.example.mytests.Utils.Components.CheckBoxFunc
import com.example.mytests.Utils.Components.Input


@Composable
fun LoginPage(innerPadding: PaddingValues) {
    Column(
        Modifier.padding(innerPadding).fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        Spacer(modifier = Modifier.weight(0.5f))
        Image(
            painter = painterResource(id = R.drawable.dyner), // Replace with your drawable resource
            contentDescription = "Sample Image",
            Modifier.scale(1.8f)

        )
        Spacer(modifier = Modifier.weight(0.5f))

        Row {
            FormLogin()
        }
        Spacer(modifier = Modifier.weight(1f))

        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.Bottom) {
            Text("New here? ", style = TextStyle(fontSize = 17.sp, fontWeight = FontWeight(400)))
            Text("Sign Up Now!", color = Color.Red, style = TextStyle(fontSize = 17.sp, fontWeight = FontWeight(400)))
        }
    }
}


@Preview(showBackground = true)
@Composable
fun FormLogin(modifier: Modifier = Modifier) {

    Column (
        Modifier
            .padding(0.dp)
            .width(297.dp)
            .height(270.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row {
            Input(0, "User/email", Modifier.fillMaxWidth() )
        }
        Spacer(modifier = Modifier.height(12.dp))
        Row {
            Input(1, "Password", Modifier.fillMaxWidth() )
        }
        Row(Modifier.fillMaxWidth().padding(0.dp), horizontalArrangement = Arrangement.Start){
            CheckBoxFunc("Remember me")
        }
        Row{
            ButtonComp("Log In")
        }
        Spacer(modifier = Modifier.height(12.dp))
        Row {
            Row(Modifier.fillMaxWidth().padding(0.dp),
                horizontalArrangement = Arrangement.Start,
                verticalAlignment = Alignment.CenterVertically){
                Text("Forgot Password", color = Color.Red)
            }
        }
    }
}
