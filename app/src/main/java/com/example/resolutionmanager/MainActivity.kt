package com.example.resolutionmanager

import BottomNavBar
import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import com.example.resolutionmanager.ui.theme.ResolutionManagerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ResolutionManagerTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ResolutionManagerApp()
                }
            }
        }
    }
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun ResolutionManagerApp() {
    var selectedItem by remember { mutableIntStateOf(0) }
    val screens = listOf("Today", "Community", "Log")
    val icons = listOf(Icons.Default.Check, Icons.Default.Person, Icons.Default.DateRange)

    Scaffold(
        bottomBar = {
            BottomNavBar()
        }
    ) {
        Box(modifier = Modifier.fillMaxSize()) {
            when (selectedItem) {
                0 -> ResolutionScreen()
                1 -> CommunityScreen()
                2 -> LogScreen()
            }
        }
    }
}
