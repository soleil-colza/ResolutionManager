package com.example.resolutionmanager

import android.os.Bundle
import android.R
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.res.stringResource
import com.example.resolutionmanager.ui.theme.ResolutionManagerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ResolutionManagerTheme {
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                }
            }
        }
    }
}

@Composable
fun ResolutionManagerApp(){

}

@Composable
fun ResolutionScreen() {
    Text(text = "Resolution Screen")
}

@Composable
fun ResolutionsScreenTitle() {
    Row(){
        Icon(imageVector = Icons.Default.Person, contentDescription = null)
        Text(text = stringResource(com.example.resolutionmanager.R.string.resolutions))
    }
}
