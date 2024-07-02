import androidx.compose.runtime.remember
import androidx.compose.ui.window.ComposeUIViewController
import database.getAppDatabase

fun MainViewController() = ComposeUIViewController {
    val dao = remember { getAppDatabase().FavoriteDao() }
    App(dao)
}