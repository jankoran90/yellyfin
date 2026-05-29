package com.github.jankoran90.yellyfin.services.hilt

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.core.DataStoreFactory
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler
import androidx.datastore.dataStoreFile
import androidx.datastore.preferences.core.PreferenceDataStoreFactory
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.preferencesDataStoreFile
import androidx.room.Room
import com.github.jankoran90.yellyfin.data.AppDatabase
import com.github.jankoran90.yellyfin.data.ItemPlaybackDao
import com.github.jankoran90.yellyfin.data.JellyfinServerDao
import com.github.jankoran90.yellyfin.data.LibraryDisplayInfoDao
import com.github.jankoran90.yellyfin.data.Migrations
import com.github.jankoran90.yellyfin.data.PlaybackEffectDao
import com.github.jankoran90.yellyfin.data.PlaybackLanguageChoiceDao
import com.github.jankoran90.yellyfin.data.SeerrServerDao
import com.github.jankoran90.yellyfin.data.ServerPreferencesDao
import com.github.jankoran90.yellyfin.preferences.AppPreferences
import com.github.jankoran90.yellyfin.preferences.AppPreferencesSerializer
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {
    @Provides
    @Singleton
    fun database(
        @ApplicationContext context: Context,
    ): AppDatabase =
        Room
            .databaseBuilder(
                context,
                AppDatabase::class.java,
                "yellyfin",
            ).addMigrations(Migrations.Migrate2to3)
//            .setQueryCallback({ sqlQuery, args ->
//                Timber.v("sqlQuery=$sqlQuery, args=$args")
//            }, Dispatchers.IO.asExecutor())
            .build()

    @Provides
    @Singleton
    fun serverDao(db: AppDatabase): JellyfinServerDao = db.serverDao()

    @Provides
    @Singleton
    fun itemPlaybackDao(db: AppDatabase): ItemPlaybackDao = db.itemPlaybackDao()

    @Provides
    @Singleton
    fun serverPreferencesDao(db: AppDatabase): ServerPreferencesDao = db.serverPreferencesDao()

    @Provides
    @Singleton
    fun libraryDisplayInfoDao(db: AppDatabase): LibraryDisplayInfoDao = db.libraryDisplayInfoDao()

    @Provides
    @Singleton
    fun playbackLanguageChoiceDao(db: AppDatabase): PlaybackLanguageChoiceDao = db.playbackLanguageChoiceDao()

    @Provides
    @Singleton
    fun seerrServerDao(db: AppDatabase): SeerrServerDao = db.seerrServerDao()

    @Provides
    @Singleton
    fun playbackEffectDao(db: AppDatabase): PlaybackEffectDao = db.playbackEffectDao()

    @Provides
    @Singleton
    fun userPreferencesDataStore(
        @ApplicationContext context: Context,
        userPreferencesSerializer: AppPreferencesSerializer,
    ): DataStore<AppPreferences> =
        DataStoreFactory.create(
            serializer = userPreferencesSerializer,
            produceFile = { context.dataStoreFile("app_preferences.pb") },
            corruptionHandler =
                ReplaceFileCorruptionHandler(
                    produceNewData = { AppPreferences.getDefaultInstance() },
                ),
        )

    @Provides
    @Singleton
    fun keyValueDataStore(
        @ApplicationContext context: Context,
    ): DataStore<Preferences> =
        PreferenceDataStoreFactory.create(
            produceFile = { context.preferencesDataStoreFile("key_value") },
        )
}
