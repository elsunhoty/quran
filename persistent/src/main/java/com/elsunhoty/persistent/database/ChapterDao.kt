package com.elsunhoty.persistent.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.elsunhoty.persistent.models.ChapterLocal

@Dao
interface ChapterDao {


    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun saveChapter(vararg chapterLocal: ChapterLocal) : List<Long>


    @Query(" SELECT * FROM `chapters` ORDER BY number ASC")
    fun getChapters():List<ChapterLocal>


}