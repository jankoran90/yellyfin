package com.github.jankoran90.yellyfin.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.github.jankoran90.yellyfin.data.model.JellyfinUser
import com.github.jankoran90.yellyfin.data.model.NavDrawerPinnedItem

@Dao
interface ServerPreferencesDao {
    fun getNavDrawerPinnedItems(user: JellyfinUser): List<NavDrawerPinnedItem> = getNavDrawerPinnedItems(user.rowId)

    @Query("SELECT * from NavDrawerPinnedItem WHERE userId=:userId")
    fun getNavDrawerPinnedItems(userId: Int): List<NavDrawerPinnedItem>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun saveNavDrawerPinnedItems(vararg items: NavDrawerPinnedItem)
}
