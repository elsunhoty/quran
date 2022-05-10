package com.elsunhoty.persistent.database

import android.content.Context
import android.os.Build
import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.room.Room
import androidx.test.core.app.ApplicationProvider
import com.elsunhoty.persistent.models.ChapterLocal
import com.elsunhoty.persistent.stub.FakeChapter
import org.junit.*
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config


@RunWith(RobolectricTestRunner::class)
@Config(sdk = [Build.VERSION_CODES.P], manifest = Config.NONE)
class ChapterTest {

    @get:Rule
    var instantExecutorRule = InstantTaskExecutorRule()

    private lateinit var db: QuranDatabase
    private lateinit var chapterDao: ChapterDao

    @Before
    fun setUp() {
        val context = ApplicationProvider.getApplicationContext<Context>()
        db = Room
            .inMemoryDatabaseBuilder(context, QuranDatabase::class.java)
            .allowMainThreadQueries()
            .build()
        chapterDao = db.chapterDao()
    }

    @Test
    fun `saveChapter one chapter should pass`() {
        //arrange (in Fake Object)
        val insertedObject = FakeChapter.chapterOne;
        // act
        val savedChapter = chapterDao.saveChapter(insertedObject)
        //assert
        Assert.assertEquals(savedChapter.size, 1)
    }

    @Test
    fun `saveChapter many chapter should pass`() {
        //arrange (in Fake Object)
        val insertedObject = arrayOf(
            FakeChapter.chapterOne,
            FakeChapter.chapterOne,
            FakeChapter.chapterOne,
        )
        // act
        val savedChapter = chapterDao.saveChapter(*insertedObject)
        //assert
        Assert.assertEquals(savedChapter.size, insertedObject.size)
    }

    @Test
    fun `saveChapter duplicate chapter should replace`() {
        //arrange (in Fake Object)
        val chapterOne = FakeChapter.chapterOne
        // act
        val firstInsert = chapterDao.saveChapter(chapterOne)
        val secondInsert = chapterDao.saveChapter(chapterOne)
        //assert
        Assert.assertEquals(firstInsert[0], secondInsert[0])
    }

    @Test
    fun `getChapters empty table should return emptyList`() {
        // act
        val chapters = chapterDao.getChapters()
        Assert.assertEquals(chapters.size, 0)

    }

    @Test
    fun `getChapters table should return List`() {
        val insertedObject = arrayOf(
            FakeChapter.chapterOne,
            FakeChapter.chapterTwo,
            FakeChapter.chapterThree,
        )
        // act
        chapterDao.saveChapter(*insertedObject)
        val chapters = chapterDao.getChapters()
        // assert
        Assert.assertEquals(chapters.size, insertedObject.size)

    }

    @After
    fun close() {
        db.close()
    }
}