package com.codingtroops.simpletextcomposeapplication

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GreetingButton()
        }
    }

}

@Composable
fun GreetingText(name: String) {
    Text(text = " Hello $name!")
}

@Composable
fun GreetingButton() {
    Button(onClick = { }) {
        GreetingText(name = "button")
        GreetingText(name = "remaining button")
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreviewMainActivity() {
    GreetingButton()
}