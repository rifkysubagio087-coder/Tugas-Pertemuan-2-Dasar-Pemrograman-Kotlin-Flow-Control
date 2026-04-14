package com.example.projectrifky

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.projectrifky.ui.theme.ProjectRifkyTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ProjectRifkyTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Rifky",
                        age = 21,
                        address = "Malang, Jawa Timur",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, address: String, age: Int, modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        Text(text = "Hello, $name!")
        Text(text = "Umur: $age tahun")
        Text(text = "Alamat: $address")
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ProjectRifkyTheme {
        Greeting(
            name = "Rifky",
            age = 20,
            address = "Malang, Jawa Timur",
        )
    }
}