import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.vector.ImageVector

@Composable
fun BottomNavigationBar(
    selectedItem: Int,
   // screens: List<String>,
    icons: List<ImageVector>,
    param: (Any) -> Unit
) {
    var selectedItem by remember { mutableIntStateOf(0) }
    val items = listOf("Today", "Community", "Log")

    NavigationBar {
        NavigationBarItem(
            icon = { Icon(Icons.Filled.Check, contentDescription = "Today") },
            label = { Text("Today") },
            selected = selectedItem == 0,
            onClick = { selectedItem = 0 }
        )

        NavigationBarItem(
            icon = { Icon(Icons.Filled.Person, contentDescription = "Community") },
            label = { Text("Community") },
            selected = selectedItem == 1,
            onClick = { selectedItem = 1 }
        )

        NavigationBarItem(
            icon = { Icon(Icons.Filled.DateRange, contentDescription = "Log") },
            label = { Text("Log") },
            selected = selectedItem == 2,
            onClick = { selectedItem = 2 }
        )
    }
}