package com.example.resolutionmanager

import BottomNavBar
import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun CommunityScreen() {
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
            NavigationBar {
                BottomNavBar()
            }
        },
    ) {
        Column(
            modifier = Modifier.fillMaxSize()
        ) {
            Header(text = "Community")
            Spacer(modifier = Modifier.size(16.dp))
            CommunityGrid()
        }
    }
}

@Composable
fun CommunityGrid() {
    LazyHorizontalGrid(
        modifier = Modifier.fillMaxSize(),
        rows = GridCells.Fixed(2),
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        ) {
        items(10) {
            GroupCard()
        }
    }
}

@Composable
fun GroupCard() {
    ElevatedCard(
        modifier = Modifier
            .height(40.dp)
            .width(170.dp)
            .padding(6.dp),
    ) {
        Column(
            modifier = Modifier
                .padding(16.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.taki),
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(MaterialTheme.shapes.medium),
                contentDescription = null
            )
            Spacer(modifier = Modifier.size(16.dp))
            Text(
                text = stringResource(id = R.string.group_name),
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.size(16.dp))
            Text(
                text = stringResource(id = R.string.group_description),
                fontSize = 14.sp
            )
        }
    }
}