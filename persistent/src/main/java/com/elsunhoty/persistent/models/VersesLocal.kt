package com.elsunhoty.persistent.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "verses")
data class VersesLocal(
    @PrimaryKey(autoGenerate = false)
    val numberInQuran: Int,
    val numberInChapter:Int,
    val chapterNumber:Int,
    val juzNumber:Int,
    val hasSajda:Boolean,
    val textAr:String,
    val textEn:String,
    val audioRemote:String,
    val audioLocal:String
)