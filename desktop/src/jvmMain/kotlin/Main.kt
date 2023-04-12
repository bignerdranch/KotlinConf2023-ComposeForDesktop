import androidx.compose.material.Text
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        title = "Hello world!",
        onCloseRequest = ::exitApplication
    ) {
        Text("Hello, desktop!")
    }
}