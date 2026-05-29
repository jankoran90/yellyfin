package com.github.jankoran90.yellyfin.ui.detail.series

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.FocusState
import com.github.jankoran90.yellyfin.data.ChosenStreams
import com.github.jankoran90.yellyfin.data.model.BaseItem
import com.github.jankoran90.yellyfin.preferences.UserPreferences
import com.github.jankoran90.yellyfin.ui.components.ExpandablePlayButtons
import org.jellyfin.sdk.model.extensions.ticks
import kotlin.time.Duration

@Composable
fun FocusedEpisodeFooter(
    preferences: UserPreferences,
    ep: BaseItem,
    chosenStreams: ChosenStreams?,
    playOnClick: (Duration) -> Unit,
    moreOnClick: () -> Unit,
    watchOnClick: () -> Unit,
    favoriteOnClick: () -> Unit,
    canDelete: Boolean,
    onConfirmDelete: () -> Unit,
    modifier: Modifier = Modifier,
    buttonOnFocusChanged: (FocusState) -> Unit = {},
) {
    val dto = ep.data
    val resumePosition = dto.userData?.playbackPositionTicks?.ticks ?: Duration.ZERO
    val firstFocus = remember { FocusRequester() }
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier,
    ) {
        ExpandablePlayButtons(
            title = ep.title ?: "",
            resumePosition = resumePosition,
            watched = dto.userData?.played ?: false,
            favorite = dto.userData?.isFavorite ?: false,
            playOnClick = playOnClick,
            moreOnClick = moreOnClick,
            watchOnClick = watchOnClick,
            favoriteOnClick = favoriteOnClick,
            buttonOnFocusChanged = buttonOnFocusChanged,
            trailers = null,
            trailerOnClick = {},
            canDelete = canDelete,
            onConfirmDelete = onConfirmDelete,
            modifier = Modifier.fillMaxWidth(),
        )
    }
}
