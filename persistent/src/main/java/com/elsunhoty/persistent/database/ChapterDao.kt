package com.elsunhoty.persistent.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.elsunhoty.persistent.models.ChapterLocal

@Dao
interface ChapterDao {


    @Query(" SELECT * FROM `chapters` ORDER BY number ASC")
    fun getChapters():List<ChapterLocal>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun saveChapter(chapterLocal: ChapterLocal): Long

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun saveChapter(chapterLocal: List<ChapterLocal>)


}