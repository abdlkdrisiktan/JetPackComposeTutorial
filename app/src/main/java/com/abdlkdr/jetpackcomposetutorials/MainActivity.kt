package com.abdlkdr.jetpackcomposetutorials

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MessageCard(name = "Kadir")
        }
    }
}

// Lesson 1
@Composable
fun MessageCard(name: String) {
    Text(text = "Hello $name This is composable sample")
}

@Preview
@Composable
fun PreviewMessageCard() {
    MessageCard(Message("Kadir", "Sample Body"))
}

// Lesson 2
data class Message(val author: String, val body: String)

@Composable
fun MessageCard(msg: Message) {
    Row {
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_foreground),
            contentDescription = "This image for avatar"
        )
        Column {
            Text(text = msg.author)
            Text(text = msg.body)
        }
    }

}