package com.elsunhoty.persistent.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "chapters")
data class ChapterLocal(
    @PrimaryKey(autoGenerate = false)
    val number: Int,
    val versesCount: Int,
    val nameAr: String,
    val nameEn: String,
    val isMeccan: Boolean
)