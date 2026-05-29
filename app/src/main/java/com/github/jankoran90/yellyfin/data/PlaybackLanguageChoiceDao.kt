package com.github.jankoran90.yellyfin.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.github.jankoran90.yellyfin.data.model.PlaybackLanguageChoice
import java.util.UUID

@Dao
interface PlaybackLanguageChoiceDao {
    @Query("SELECT * FROM PlaybackLanguageChoice WHERE userId=:userId AND seriesId=:seriesId")
    suspend fun get(
        userId: Int,
        seriesId: UUID,
    ): PlaybackLanguageChoice?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun save(plc: PlaybackLanguageChoice): Long

    @Delete
    fun delete(plc: PlaybackLanguageChoice)
}
