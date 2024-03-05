import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
sealed class BottomNavItem(val route: String, val icon: ImageVector, val label: String) {
    data object Resolution : BottomNavItem("resolution", Icons.Default.Star, "Resolution")
    data object Community : BottomNavItem("community", Icons.Default.Person, "Community")
    data object Log : BottomNavItem("log", Icons.Default.DateRange, "Log")
}
@Composable
fun BottomNavBar() {
    var selectedItem = remember { mutableStateOf(0) }
    val items = listOf(BottomNavItem.Resolution, BottomNavItem.Community, BottomNavItem.Log)
    NavigationBar {
        items.forEachIndexed { index, item ->
            BottomNavigationItem(
                icon = { Icon(item.icon, contentDescription = null) },
                label = { Text(item.toString()) },
                selected = selectedItem.value == index,
                onClick = { selectedItem.value = index }
            )
        }
    }
}