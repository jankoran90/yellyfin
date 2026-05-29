package com.github.jankoran90.yellyfin.ui.components

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.combinedClickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.runtime.Composable
import androidx.compose.runtime.NonRestartableComposable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.tv.material3.DenseListItem
import androidx.tv.material3.ListItem
import androidx.tv.material3.ListItemBorder
import androidx.tv.material3.ListItemColors
import androidx.tv.material3.ListItemDefaults
import androidx.tv.material3.ListItemGlow
import androidx.tv.material3.ListItemScale
import androidx.tv.material3.ListItemShape

/**
 * Displays either a [ListItem] or [DenseListItem] based on the dense parameter
 */
@OptIn(ExperimentalFoundationApi::class)
@Composable
fun ListItemWrapper(
    dense: Boolean,
    selected: Boolean,
    onClick: () -> Unit,
    headlineContent: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    onLongClick: (() -> Unit)? = null,
    overlineContent: (@Composable () -> Unit)? = null,
    supportingContent: (@Composable () -> Unit)? = null,
    leadingContent: (@Composable BoxScope.() -> Unit)? = null,
    trailingContent: (@Composable () -> Unit)? = null,
    tonalElevation: Dp = ListItemDefaults.TonalElevation,
    shape: ListItemShape = ListItemDefaults.shape(),
    colors: ListItemColors = ListItemDefaults.colors(),
    scale: ListItemScale = ListItemDefaults.scale(),
    border: ListItemBorder = ListItemDefaults.border(),
    glow: ListItemGlow = ListItemDefaults.glow(),
    interactionSource: MutableInteractionSource? = null,
) {
    val touchModifier = modifier.combinedClickable(
        interactionSource = remember { MutableInteractionSource() },
        indication = null,
        enabled = enabled,
        onClick = onClick,
        onLongClick = onLongClick,
    )
    if (dense) DenseListItem(
        selected = selected,
        onClick = onClick,
        headlineContent = headlineContent,
        modifier = touchModifier,
        enabled = enabled,
        onLongClick = onLongClick,
        overlineContent = overlineContent,
        supportingContent = supportingContent,
        leadingContent = leadingContent,
        trailingContent = trailingContent,
        tonalElevation = tonalElevation,
        shape = shape,
        colors = colors,
        scale = scale,
        border = border,
        glow = glow,
        interactionSource = interactionSource,
    )
    else ListItem(
        selected = selected,
        onClick = onClick,
        headlineContent = headlineContent,
        modifier = touchModifier,
        enabled = enabled,
        onLongClick = onLongClick,
        overlineContent = overlineContent,
        supportingContent = supportingContent,
        leadingContent = leadingContent,
        trailingContent = trailingContent,
        tonalElevation = tonalElevation,
        shape = shape,
        colors = colors,
        scale = scale,
        border = border,
        glow = glow,
        interactionSource = interactionSource,
    )
}
