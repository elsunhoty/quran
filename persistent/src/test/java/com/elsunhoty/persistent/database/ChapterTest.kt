package com.elsunhoty.persistent.database

import android.os.Build
import org.junit.Rule
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config

@RunWith(RobolectricTestRunner::class)
@Config(sdk = [Build.VERSION_CODES.P], manifest = Config.NONE)
class ChapterTest {

//    @get:Rule
//    var instantExecutorRule = InstantTaskExecutorRule()

    private lateinit var db: QuranDatabase
    private lateinit var chapterDao:ChapterDao



}