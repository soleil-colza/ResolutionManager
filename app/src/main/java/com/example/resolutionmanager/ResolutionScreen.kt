package com.example.resolutionmanager


import BottomNavigationBar
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Card
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Divider
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.ListItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun ResolutionScreen(){
    Scaffold(
        floatingActionButton = {
            FloatingActionButton(
                onClick = { },
                content = {
                    Icon(
                        imageVector = Icons.Default.Add,
                        contentDescription = null
                    )
                },
                modifier = Modifier
                    .padding(16.dp)
                    .size(56.dp),
                elevation = FloatingActionButtonDefaults.elevation(),
            )
        },
        bottomBar = {
            BottomNavigationBar()
        }
    ) {
        Column(
            modifier = Modifier.fillMaxSize()
        ) {
            Header(text = stringResource(com.example.resolutionmanager.R.string.resolutions))
            Spacer(modifier = Modifier.width(16.dp))
            ResolutionList()
        }
    }
}

@Composable
fun ResolutionList() {
    Card(
        modifier = Modifier.padding(16.dp)
    ) {
        Column(
            modifier = Modifier.padding(10.dp)
        ) {

            Text(
                text = "Today",
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier.padding(12.dp)
            )

            Divider(thickness = 2.dp)

            val tasks = listOf("Task 1", "Task 2", "Task 3")

            LazyColumn {
                items(tasks.size) { index ->
                    ListItem(
                        headlineContent = {
                            Text(text = tasks[index])
                        },
                        leadingContent = {
                            Checkbox(checked = false, onCheckedChange = { })
                        }
                    )
                }
            }

        }
    }
}
