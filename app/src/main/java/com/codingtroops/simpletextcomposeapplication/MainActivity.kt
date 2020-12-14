package com.codingtroops.simpletextcomposeapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.setContent
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
           GreetingText(name = "world")
        }
    }

}

@Composable
fun GreetingText(name: String) {
    Text(text = " Hello $name!",
            modifier = Modifier
                    .width(200.dp)
                    .height(240.dp)
                    .clickable(onClick = {  })
                    .padding(all = 24.dp) // TODO git commit
    )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreviewMainActivity() {
    GreetingText(name = "world")
}