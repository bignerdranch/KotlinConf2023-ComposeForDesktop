
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.bignerdranch.codapizza.core.StringResource
import com.bignerdranch.codapizza.core.getStringResource
import com.bignerdranch.codapizza.core.ui.AppTheme
import com.bignerdranch.codapizza.core.ui.PizzaBuilderScreen

fun main() = application {
    Window(
        title = getStringResource(StringResource.AppName),
        onCloseRequest = ::exitApplication
    ) {
        AppTheme {
            PizzaBuilderScreen()
        }
    }
}