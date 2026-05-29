package com.github.jankoran90.yellyfin.ui.detail.series

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusState
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.github.jankoran90.yellyfin.data.ChosenStreams
import com.github.jankoran90.yellyfin.data.model.BaseItem
import com.github.jankoran90.yellyfin.preferences.UserPreferences
import com.github.jankoran90.yellyfin.ui.components.EpisodeName
import com.github.jankoran90.yellyfin.ui.components.HeaderUtils
import com.github.jankoran90.yellyfin.ui.components.OverviewText
import com.github.jankoran90.yellyfin.ui.components.QuickDetails
import com.github.jankoran90.yellyfin.ui.components.VideoStreamDetails

@Composable
fun FocusedEpisodeHeader(
    preferences: UserPreferences,
    ep: BaseItem?,
    chosenStreams: ChosenStreams?,
    overviewOnClick: () -> Unit,
    overviewOnFocus: (FocusState) -> Unit,
    modifier: Modifier = Modifier,
) {
    val context = LocalContext.current
    val dto = ep?.data
    Column(
        verticalArrangement = Arrangement.spacedBy(8.dp),
        modifier = modifier,
    ) {
        EpisodeName(dto, modifier = Modifier.padding(start = HeaderUtils.startPadding))

        ep?.ui?.quickDetails?.let {
            QuickDetails(
                it,
                ep.timeRemainingOrRuntime,
                Modifier.padding(start = HeaderUtils.startPadding),
            )
        }

        if (dto != null) {
            VideoStreamDetails(
                chosenStreams = chosenStreams,
                numberOfVersions = dto.mediaSourceCount ?: 0,
                modifier = Modifier.padding(start = HeaderUtils.startPadding),
            )
        }
        OverviewText(
            overview = dto?.overview ?: "",
            maxLines = 3,
            onClick = overviewOnClick,
            modifier = Modifier.onFocusChanged(overviewOnFocus),
        )
    }
}
