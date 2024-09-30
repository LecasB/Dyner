package com.example.mytests.Utils.Components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun CheckBoxFunc(myTextCheckBox:String) {
    val checkedState = remember { mutableStateOf(true) }

    Row(
        Modifier.fillMaxWidth().padding(0.dp),
        horizontalArrangement = Arrangement.Start,
        //horizontalArrangement = Arrangement.spacedBy(0.dp, Alignment.CenterHorizontally),
        verticalAlignment = Alignment.CenterVertically) {
        Checkbox(checkedState.value, onCheckedChange = { checkedState.value = it })
        Text(myTextCheckBox)
    }
}