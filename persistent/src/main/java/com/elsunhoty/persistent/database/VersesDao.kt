package com.elsunhoty.persistent.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.elsunhoty.persistent.models.ChapterLocal
import com.elsunhoty.persistent.models.VersesLocal

@Dao
interface VersesDao {

    @Query(" SELECT * FROM `verses` where chapterNumber = :chapterId  ORDER BY numberInChapter ASC")
    fun getVerses(chapterId: Int): List<VersesLocal>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun saveVerse(verse: VersesLocal): Long

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun saveChapter(verses: List<VersesLocal>)
}