package app.revenge.manager.ui.theme

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import app.revenge.manager.domain.manager.PreferenceManager
import app.revenge.manager.domain.manager.Theme
import org.koin.androidx.compose.get

@Composable
fun RevengeManagerTheme(
    content: @Composable () -> Unit
) {
    val prefs = get<PreferenceManager>()
    val dynamicColor = prefs.monet
    val darkTheme = when (prefs.theme) {
        Theme.SYSTEM -> isSystemInDarkTheme()
        Theme.DARK -> true
        Theme.LIGHT -> false
    }

    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }

        darkTheme -> EnderCordDark
        else -> lightColorScheme()
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}

// EnderCord's black look: white accents on near black surfaces
val EnderCordDark = darkColorScheme(
    primary = Color.White,
    onPrimary = Color.Black,
    primaryContainer = Color(0xFF1C1C20),
    onPrimaryContainer = Color.White,
    secondary = Color(0xFFBDBDC4),
    onSecondary = Color.Black,
    secondaryContainer = Color(0xFF1C1C20),
    onSecondaryContainer = Color.White,
    tertiary = Color(0xFFBDBDC4),
    background = Color(0xFF050506),
    onBackground = Color.White,
    surface = Color(0xFF050506),
    onSurface = Color.White,
    surfaceVariant = Color(0xFF141417),
    onSurfaceVariant = Color(0xFFA0A0A8),
    surfaceTint = Color.White,
    outline = Color(0xFF34343A),
    outlineVariant = Color(0xFF222226),
    inverseSurface = Color.White,
    inverseOnSurface = Color.Black,
)
