package com.ayushsuman.edvoramobiletest

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.ayushsuman.edvoramobiletest.ui.RideCard
import com.ayushsuman.edvoramobiletest.ui.theme.CardBlack
import com.ayushsuman.edvoramobiletest.ui.theme.EdvoraMobileTestTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EdvoraMobileTestTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Scaffold{
                        RideCard()
                    }
                }
            }
        }
    }
}
