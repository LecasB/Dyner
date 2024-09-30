package com.example.mytests.Utils.Components

import androidx.compose.foundation.border
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.material3.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp


@Composable
fun MyFormButton() {
    Button(
        onClick = { /* Handle click here */ },
        modifier = Modifier.border(width = 0.dp, color = Color(0xFF000000), shape = RoundedCornerShape(size = 5.dp))
            .width(297.dp)
            .height(44.dp),
        shape = RoundedCornerShape(size = 5.dp),
        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFDA492F))
    ) {
        Text("Log In", style = TextStyle(fontSize = 20.sp, fontWeight = FontWeight(400)))
    }
}

