package com.github.jankoran90.yellyfin.ui.playback

import androidx.compose.ui.text.intl.Locale
import androidx.media3.common.Player
import androidx.media3.common.text.Cue
import com.github.jankoran90.yellyfin.data.model.BaseItem
import com.github.jankoran90.yellyfin.data.model.ItemPlayback
import com.github.jankoran90.yellyfin.data.model.Playlist
import com.github.jankoran90.yellyfin.preferences.PlayerBackend
import com.github.jankoran90.yellyfin.ui.formatBitrate
import com.github.jankoran90.yellyfin.util.LoadingState
import io.github.peerless2012.ass.media.AssHandler
import org.jellyfin.sdk.model.api.MediaSegmentDto

data class PlaybackState(
    val loading: LoadingState = LoadingState.Loading,
    val currentMediaInfo: CurrentMediaInfo = CurrentMediaInfo.EMPTY,
    val currentPlayback: CurrentPlayback? = null,
    val currentItemPlayback: ItemPlayback? = null,
    val currentSegment: MediaSegmentState? = null,
    val analyticsState: AnalyticsState = AnalyticsState(),
    val subtitleCues: List<Cue> = emptyList(),
    val nextUp: BaseItem? = null,
    val playlist: Playlist = Playlist(listOf()),
)

data class PlayerInstance(
    val player: Player,
    val backend: PlayerBackend,
    val assHandler: AssHandler?,
)

data class MediaSegmentState(
    val segment: MediaSegmentDto,
    val interacted: Boolean,
)

data class AnalyticsState(
    val bitrate: String = formatBitrate(0),
    val bitrateEstimate: String = formatBitrate(0),
    val droppedFrames: Int = 0,
)

data class SubtitleSearchState(
    val status: SubtitleSearchStatus = SubtitleSearchStatus.Inactive,
    val language: String = Locale.current.language,
)
