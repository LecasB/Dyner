package com.example.mytests.Utils.Components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation


// 1 - Password || 0 - Normal
@Composable
fun Input(myTextFieldType: Int, myTextFieldLabel: String, modifier: Modifier) {
    var textField by remember { mutableStateOf("") };

    TextField(
        value = textField,
        onValueChange = { newText ->
            textField = newText
        },

        modifier = modifier,
        label = { Text(myTextFieldLabel) },
        visualTransformation = if (myTextFieldType == 1) PasswordVisualTransformation() else VisualTransformation.None


    )
}
