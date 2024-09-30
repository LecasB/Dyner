package com.example.mytests

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.example.mytests.ui.theme.MyTestsTheme
import androidx.compose.ui.unit.dp
import androidx.compose.material3.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.*
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.material3.Checkbox
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion
import androidx.compose.ui.draw.scale
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.mytests.Utils.Components.ButtonComp
import com.example.mytests.Utils.Components.CheckBoxFunc
import com.example.mytests.Utils.Components.Input

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyTestsTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
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
                           FormSignUp()
                        }
                        Spacer(modifier = Modifier.weight(1f))

                        Row(modifier = Modifier
                            .fillMaxWidth()
                            .padding(16.dp),
                            horizontalArrangement = Arrangement.Center,
                            verticalAlignment = Alignment.Bottom) {
                            Text("Log In!", color = Color.Red, style = TextStyle(fontSize = 20.sp, fontWeight = FontWeight(400)))
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

//@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyTestsTheme {
        Greeting("Android")
    }
}


@Composable
fun FilledCardExample() {
    Card(
        colors = CardDefaults.cardColors(
            containerColor = Color.Red,
        ),
        modifier = Modifier
            .size(width = 256.dp, height = 116.dp)
    ) {
        Text(
            text = "Filled",
            modifier = Modifier
                .padding(16.dp),
            textAlign = TextAlign.Center,
        )
    }
}

/*
@Composable
fun MyTextField(myTextFieldType: Int, myTextFieldLabel: String) {
    var textField by remember { mutableStateOf("") };

    TextField(
        value = textField,
        onValueChange = { newText ->
            textField = newText
        },
        Modifier.fillMaxWidth(),
        label = { Text(myTextFieldLabel) },
        visualTransformation = if (myTextFieldType == 1) PasswordVisualTransformation() else VisualTransformation.None
    )
}

@Composable
fun MyCheckBox() {
    val checkedState = remember { mutableStateOf(true) }

    Row(Modifier.fillMaxWidth().padding(0.dp),
        horizontalArrangement = Arrangement.Start,
        //horizontalArrangement = Arrangement.spacedBy(0.dp, Alignment.CenterHorizontally),
        verticalAlignment = Alignment.CenterVertically) {
        Checkbox(checkedState.value, onCheckedChange = { checkedState.value = it })
        Text("Remember me")
    }
}

@Composable
fun MyFormButton() {
    Button(
        onClick = { /* Handle click here */ },
        modifier = Modifier
            .border(width = 0.dp, color = Color(0xFF000000), shape = RoundedCornerShape(size = 5.dp))
            .width(297.dp)
            .height(44.dp),
        shape = RoundedCornerShape(size = 5.dp),
        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFDA492F)),
    ) {
        Text("Log In", style = TextStyle(fontSize = 20.sp, fontWeight = FontWeight(400)))
    }
}
*/

@Preview(showBackground = true)
@Composable
fun FormSignUp(modifier: Modifier = Modifier) {

    Column (
        Modifier
            .padding(0.dp)
            .width(297.dp)
            .height(270.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            Input(0, "First Name", modifier = modifier.weight(1f))
            Spacer(modifier = Modifier.width(16.dp))
            Input(0, "Last Name", modifier = modifier.weight(1f))
        }
        Spacer(modifier = Modifier.height(12.dp))
        Row {
            Input(1, "Password", modifier = modifier.fillMaxWidth())
        }
        Spacer(modifier = Modifier.height(12.dp))
        Row {
            Input(1, "Confirm Password", modifier = modifier.fillMaxWidth())
        }
        Spacer(modifier = Modifier.height(12.dp))
        Row{
            ButtonComp(text = "Sign Up")
        }
        Spacer(modifier = Modifier.height(12.dp))
        }
    }





/*modifier = Modifier.fillMaxWidth(),
verticalAlignment = Alignment.CenterVertically,
horizontalArrangement = Arrangement.Center*/
