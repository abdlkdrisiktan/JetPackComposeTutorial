package com.abdlkdr.jetpackcomposetutorials

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.abdlkdr.jetpackcomposetutorials.ui.theme.JetPackComposeTutorialsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetPackComposeTutorialsTheme {
                MessageCard(name = "Kadir")
            }

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
    JetPackComposeTutorialsTheme {
        MessageCard(Message("Kadir", "Sample Body"))
    }
}

// Lesson 2
data class Message(val author: String, val body: String)

@Composable
fun MessageCard(msg: Message) {
    Row(modifier = Modifier.padding(all = 8.dp)) {
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_foreground),
            contentDescription = "This image for avatar",
            modifier = Modifier
                .size(40.dp)
                .clip(CircleShape)
        )
        // Add a horizontal space between the image and the column
        Spacer(modifier = Modifier.width(8.dp))

        Column {
            Text(text = msg.author,
                color = MaterialTheme.colors.secondaryVariant,
                        style = MaterialTheme.typography.subtitle2

            )
            Spacer(modifier = Modifier.height(4.dp))
            Text(text = msg.body,
                style = MaterialTheme.typography.body2
            )
        }
    }
// Lesson 3
}