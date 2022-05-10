package com.elsunhoty.persistent.database

import android.content.Context
import androidx.annotation.NonNull
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.elsunhoty.persistent.models.ChapterLocal
import com.elsunhoty.persistent.models.VersesLocal

@Database(
    entities = [ChapterLocal::class, VersesLocal::class],
    version = 1,
//    autoMigrations = [
//        AutoMigration(
//            from = 1,
//            to = 2,
//            spec = QuranDatabase.MyAutoMigration::class
//        )
//    ]
)
abstract class QuranDatabase : RoomDatabase() {

    abstract fun chapterDao(): ChapterDao
    abstract fun versesDao(): VersesDao

    companion object {
        private val LOCK: Any = Any()
        private const val DATABASE_NAME = "Quran.db"
        private var instance: QuranDatabase? = null
        fun instance(@NonNull context: Context): QuranDatabase {
            if (instance == null) {
                synchronized(LOCK) {
                    if (instance == null) {
                        instance = Room.databaseBuilder(
                            context,
                            QuranDatabase::class.java,
                            DATABASE_NAME
                        ).build()
                    }
                }
            }
            return instance!!
        }

    }
}