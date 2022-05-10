package com.elsunhoty.persistent.database

import android.content.Context
import android.os.Build
import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.room.Room
import androidx.test.core.app.ApplicationProvider
import com.elsunhoty.persistent.stub.FakeVerses
import org.junit.*
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config


@RunWith(RobolectricTestRunner::class)
@Config(sdk = [Build.VERSION_CODES.P], manifest = Config.NONE)
class VersesTest {

    @get:Rule
    var instantExecutorRule = InstantTaskExecutorRule()

    private lateinit var db: QuranDatabase
    private lateinit var versesDao: VersesDao

    @Before
    fun setUp() {
        val context = ApplicationProvider.getApplicationContext<Context>()
        db = Room
            .inMemoryDatabaseBuilder(context, QuranDatabase::class.java)
            .allowMainThreadQueries()
            .build()
        versesDao = db.versesDao()
    }

    @Test
    fun `saveVerse many versed should pass`() {
        //arrange (in Fake Object)
        val insertedObject =  FakeVerses.versesChapterOne
        // act
        val savedVerses = versesDao.saveVerse(*insertedObject)
        //assert
        Assert.assertEquals(savedVerses.size, insertedObject.size)
    }

    @Test
    fun `getVerses with Valid chapterId should return List`() {
        //arrange (in Fake Object)
        val versesChapterOne =  FakeVerses.versesChapterOne
        val versesChapterTwo =  FakeVerses.versesChapterTwo
        // act
        val savedVersesOne = versesDao.saveVerse(*versesChapterOne)
        val savedVersesTwo = versesDao.saveVerse(*versesChapterTwo)
        //assert
        val verses = versesDao.getVerses(versesChapterOne[0].chapterNumber)
        Assert.assertEquals(verses.size, versesChapterOne.size)
    }
    @Test
    fun `getVerses with inValid chapterId should return EmptyList`() {
        //arrange (in Fake Object)
        val versesChapterOne =  FakeVerses.versesChapterOne
        val versesChapterTwo =  FakeVerses.versesChapterTwo
        // act
        val savedVersesOne = versesDao.saveVerse(*versesChapterOne)
        val savedVersesTwo = versesDao.saveVerse(*versesChapterTwo)
        //assert
        val verses = versesDao.getVerses(-1)
        Assert.assertEquals(verses.size, 0)
    }
    @After
    fun close() {
        db.close()
    }
}