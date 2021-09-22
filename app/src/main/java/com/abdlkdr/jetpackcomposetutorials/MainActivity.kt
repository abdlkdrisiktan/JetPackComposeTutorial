package com.abdlkdr.jetpackcomposetutorials

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MessageCard(name = "Kadir")
        }
    }
}

@Composable
fun MessageCard(name : String) {
    Text(text = "Hello $name This is composable sample")
}

@Preview
@Composable
fun PreviewMessageCard() {
    MessageCard("Android")
}

