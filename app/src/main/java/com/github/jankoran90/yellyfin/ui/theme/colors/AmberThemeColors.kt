package com.github.jankoran90.yellyfin.ui.theme.colors

import androidx.compose.material3.ColorScheme
import androidx.compose.ui.graphics.Color
import androidx.tv.material3.darkColorScheme
import androidx.tv.material3.lightColorScheme
import com.github.jankoran90.yellyfin.ui.theme.ThemeColors

val AmberThemeColors =
    object : ThemeColors {
        val primaryLight = Color(0xFF7A4F00)
        val onPrimaryLight = Color(0xFFFFFFFF)
        val primaryContainerLight = Color(0xFFFFDDB3)
        val onPrimaryContainerLight = Color(0xFF5C3800)
        val secondaryLight = Color(0xFF6D5B3E)
        val onSecondaryLight = Color(0xFFFFFFFF)
        val secondaryContainerLight = Color(0xFFF6DEBB)
        val onSecondaryContainerLight = Color(0xFF544429)
        val tertiaryLight = Color(0xFF4E6B35)
        val onTertiaryLight = Color(0xFFFFFFFF)
        val tertiaryContainerLight = Color(0xFFCFF2AE)
        val onTertiaryContainerLight = Color(0xFF3A5220)
        val errorLight = Color(0xFFBA1A1A)
        val onErrorLight = Color(0xFFFFFFFF)
        val errorContainerLight = Color(0xFFFFDAD6)
        val onErrorContainerLight = Color(0xFF93000A)
        val backgroundLight = Color(0xFFFFF8F3)
        val onBackgroundLight = Color(0xFF201B13)
        val surfaceLight = Color(0xFFFFF8F3)
        val onSurfaceLight = Color(0xFF201B13)
        val surfaceVariantLight = Color(0xFFEEE0CF)
        val onSurfaceVariantLight = Color(0xFF4E4538)
        val scrimLight = Color(0xFF000000)
        val inverseSurfaceLight = Color(0xFF363027)
        val inverseOnSurfaceLight = Color(0xFFFAEFE3)
        val inversePrimaryLight = Color(0xFFFFB951)

        val primaryDark = Color(0xFFFFB951)
        val onPrimaryDark = Color(0xFF412A00)
        val primaryContainerDark = Color(0xFF5C3800)
        val onPrimaryContainerDark = Color(0xFFFFDDB3)
        val secondaryDark = Color(0xFFD9C3A0)
        val onSecondaryDark = Color(0xFF3B2E15)
        val secondaryContainerDark = Color(0xFF544429)
        val onSecondaryContainerDark = Color(0xFFF6DEBB)
        val tertiaryDark = Color(0xFFB3D694)
        val onTertiaryDark = Color(0xFF213A09)
        val tertiaryContainerDark = Color(0xFF3A5220)
        val onTertiaryContainerDark = Color(0xFFCFF2AE)
        val errorDark = Color(0xFFFFB4AB)
        val onErrorDark = Color(0xFF690005)
        val errorContainerDark = Color(0xFF93000A)
        val onErrorContainerDark = Color(0xFFFFDAD6)
        val backgroundDark = Color(0xFF181200)
        val onBackgroundDark = Color(0xFFEDE1CF)
        val surfaceDark = backgroundDark
        val onSurfaceDark = Color(0xFFEDE1CF)
        val surfaceVariantDark = Color(0xFF4E4538)
        val onSurfaceVariantDark = Color(0xFFD1C4B3)
        val scrimDark = Color(0xFF000000)
        val inverseSurfaceDark = Color(0xFFEDE1CF)
        val inverseOnSurfaceDark = Color(0xFF363027)
        val inversePrimaryDark = Color(0xFF7A4F00)

        override val lightSchemeMaterial: ColorScheme =
            androidx.compose.material3.lightColorScheme(
                primary = primaryLight,
                onPrimary = onPrimaryLight,
                primaryContainer = primaryContainerLight,
                onPrimaryContainer = onPrimaryContainerLight,
                secondary = secondaryLight,
                onSecondary = onSecondaryLight,
                secondaryContainer = secondaryContainerLight,
                onSecondaryContainer = onSecondaryContainerLight,
                tertiary = tertiaryLight,
                onTertiary = onTertiaryLight,
                tertiaryContainer = tertiaryContainerLight,
                onTertiaryContainer = onTertiaryContainerLight,
                error = errorLight,
                onError = onErrorLight,
                errorContainer = errorContainerLight,
                onErrorContainer = onErrorContainerLight,
                background = backgroundLight,
                onBackground = onBackgroundLight,
                surface = surfaceLight,
                onSurface = onSurfaceLight,
                surfaceVariant = surfaceVariantLight,
                onSurfaceVariant = onSurfaceVariantLight,
                scrim = scrimLight,
                inverseSurface = inverseSurfaceLight,
                inverseOnSurface = inverseOnSurfaceLight,
                inversePrimary = inversePrimaryLight,
            )

        override val lightScheme =
            lightColorScheme(
                primary = primaryLight,
                onPrimary = onPrimaryLight,
                primaryContainer = primaryContainerLight,
                onPrimaryContainer = onPrimaryContainerLight,
                secondary = secondaryLight,
                onSecondary = onSecondaryLight,
                secondaryContainer = secondaryContainerLight,
                onSecondaryContainer = onSecondaryContainerLight,
                tertiary = tertiaryLight,
                onTertiary = onTertiaryLight,
                tertiaryContainer = tertiaryContainerLight,
                onTertiaryContainer = onTertiaryContainerLight,
                error = errorLight,
                onError = onErrorLight,
                errorContainer = errorContainerLight,
                onErrorContainer = onErrorContainerLight,
                background = backgroundLight,
                onBackground = onBackgroundLight,
                surface = surfaceLight,
                onSurface = onSurfaceLight,
                surfaceVariant = surfaceVariantLight,
                onSurfaceVariant = onSurfaceVariantLight,
                scrim = scrimLight,
                inverseSurface = inverseSurfaceLight,
                inverseOnSurface = inverseOnSurfaceLight,
                inversePrimary = inversePrimaryLight,
                border = inversePrimaryLight,
            )

        override val darkSchemeMaterial =
            androidx.compose.material3.darkColorScheme(
                primary = primaryDark,
                onPrimary = onPrimaryDark,
                primaryContainer = primaryContainerDark,
                onPrimaryContainer = onPrimaryContainerDark,
                secondary = secondaryDark,
                onSecondary = onSecondaryDark,
                secondaryContainer = secondaryContainerDark,
                onSecondaryContainer = onSecondaryContainerDark,
                tertiary = tertiaryDark,
                onTertiary = onTertiaryDark,
                tertiaryContainer = tertiaryContainerDark,
                onTertiaryContainer = onTertiaryContainerDark,
                error = errorDark,
                onError = onErrorDark,
                errorContainer = errorContainerDark,
                onErrorContainer = onErrorContainerDark,
                background = backgroundDark,
                onBackground = onBackgroundDark,
                surface = surfaceDark,
                onSurface = onSurfaceDark,
                surfaceVariant = surfaceVariantDark,
                onSurfaceVariant = onSurfaceVariantDark,
                scrim = scrimDark,
                inverseSurface = inverseSurfaceDark,
                inverseOnSurface = inverseOnSurfaceDark,
                inversePrimary = inversePrimaryDark,
            )

        override val darkScheme =
            darkColorScheme(
                primary = primaryDark,
                onPrimary = onPrimaryDark,
                primaryContainer = primaryContainerDark,
                onPrimaryContainer = onPrimaryContainerDark,
                secondary = secondaryDark,
                onSecondary = onSecondaryDark,
                secondaryContainer = secondaryContainerDark,
                onSecondaryContainer = onSecondaryContainerDark,
                tertiary = tertiaryDark,
                onTertiary = onTertiaryDark,
                tertiaryContainer = tertiaryContainerDark,
                onTertiaryContainer = onTertiaryContainerDark,
                error = errorDark,
                onError = onErrorDark,
                errorContainer = errorContainerDark,
                onErrorContainer = onErrorContainerDark,
                background = backgroundDark,
                onBackground = onBackgroundDark,
                surface = surfaceDark,
                onSurface = onSurfaceDark,
                surfaceVariant = surfaceVariantDark,
                onSurfaceVariant = onSurfaceVariantDark,
                scrim = scrimDark,
                inverseSurface = inverseSurfaceDark,
                inverseOnSurface = inverseOnSurfaceDark,
                inversePrimary = inversePrimaryDark,
                border = Color(0xFFD4850A),
            )
    }
