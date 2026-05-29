package com.github.jankoran90.yellyfin.services

import com.github.jankoran90.yellyfin.BuildConfig
import com.github.jankoran90.yellyfin.api.seerr.SeerrApiClient
import com.github.jankoran90.yellyfin.ui.isNotNullOrBlank
import com.github.jankoran90.yellyfin.ui.setup.seerr.createSeerrApiUrl
import okhttp3.OkHttpClient

/**
 * Wrapper for [SeerrApiClient]. In most cases, you should use [SeerrService] instead.
 */
class SeerrApi(
    private val okHttpClient: OkHttpClient,
) {
    var api: SeerrApiClient =
        SeerrApiClient(
            baseUrl = "",
            apiKey = null,
            okHttpClient = okHttpClient,
        )
        private set

    val active: Boolean get() = api.baseUrl.isNotNullOrBlank() && BuildConfig.DISCOVER_ENABLED

    fun update(
        baseUrl: String,
        apiKey: String?,
    ) {
        api = SeerrApiClient(createSeerrApiUrl(baseUrl), apiKey, okHttpClient)
    }
}
