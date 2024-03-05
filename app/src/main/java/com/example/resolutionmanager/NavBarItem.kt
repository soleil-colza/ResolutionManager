package com.example.resolutionmanager
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Star
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomNavItem(val route: String, val icon: ImageVector, val label: String) {
    data object Resolution : BottomNavItem("resolution", Icons.Default.Star, "Resolution")
    data object Community : BottomNavItem("community", Icons.Default.Person, "Community")
    data object Log : BottomNavItem("log", Icons.Default.DateRange, "Log")
}