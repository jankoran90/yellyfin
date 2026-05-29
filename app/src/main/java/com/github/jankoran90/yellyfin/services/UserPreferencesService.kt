package com.github.jankoran90.yellyfin.services

import androidx.datastore.core.DataStore
import com.github.jankoran90.yellyfin.data.ServerRepository
import com.github.jankoran90.yellyfin.preferences.AppPreferences
import com.github.jankoran90.yellyfin.preferences.UserPreferences
import kotlinx.coroutines.flow.firstOrNull
import kotlinx.coroutines.flow.map
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Get the current user's [UserPreferences]
 */
@Singleton
class UserPreferencesService
    @Inject
    constructor(
        private val serverRepository: ServerRepository,
        private val preferencesDataStore: DataStore<AppPreferences>,
    ) {
        val flow = preferencesDataStore.data.map { UserPreferences(it) }

        suspend fun getCurrent(): UserPreferences =
            serverRepository.currentUserDto!!.configuration.let { userConfig ->
                val appPrefs = preferencesDataStore.data.firstOrNull() ?: AppPreferences.getDefaultInstance()
                UserPreferences(
                    appPrefs,
                )
            }
    }
