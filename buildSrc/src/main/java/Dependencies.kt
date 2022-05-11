object Dependencies {
    //region core
    //---------------------------------------------------//
    //                  Core                             //
    //---------------------------------------------------//
    const val coreKtx = "androidx.core:core-ktx:${Versions.coreKtx}"

    //endregion
    //region UI
    //---------------------------------------------------//
    //                  Ui   Dependencies                //
    //---------------------------------------------------//
    private const val appCompat = "androidx.appcompat:appcompat:${Versions.appcompat}"
    private const val materialDesign =
        "com.google.android.material:material:${Versions.materialDesign}"
    private const val constraintLayout =
        "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"

    //endregion
    //region Test
    //---------------------------------------------------//
    //                  Test Dependencies                //
    //---------------------------------------------------//
    private const val testCore = "androidx.test:core:${Versions.testCore}"
    private const val junit = "junit:junit:${Versions.junit}"
    private const val junitEx = "androidx.test.ext:junit:${Versions.extJunit}"

    const val robolectric = "org.robolectric:robolectric:${Versions.robolectric}"
    const val testArcCore = "androidx.arch.core:core-testing:${Versions.testArcCore}"

    //endregion
    //region Injection
    //---------------------------------------------------//
    //                  dependency injection            //
    //---------------------------------------------------//
    const val injector = "javax.inject:javax.inject:1"

    //endregion
    //region Room
    //---------------------------------------------------//
    //             Room Database dependencies            //
    //---------------------------------------------------//
    private const val room = "androidx.room:room-runtime:${Versions.roomDatabase}"
    private const val roomKtx = "androidx.room:room-ktx:${Versions.roomDatabase}"
    const val roomKapt = "androidx.room:room-compiler:${Versions.roomDatabase}"
    const val roomTest = "androidx.room:room-testing:${Versions.roomDatabase}"
//    private const val roomTestCore = "android.arch.persistence.room:testing:1.1.1"
    //endregion
    //region LiveData
    //---------------------------------------------------//
    //             LiveData      dependencies            //
    //---------------------------------------------------//
    const val liveData = "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.liveData}"
    //endregion
    //region Injection
    //---------------------------------------------------//
    //                  Restful Api            //
    //---------------------------------------------------//
    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    const val okHttp = "com.squareup.okhttp3:okhttp:${Versions.okHttp}"
    const val loggingInterceptor = "com.squareup.okhttp3:logging-interceptor:${Versions.okHttp}"
    const val converterGson = "com.squareup.retrofit2:converter-gson:${Versions.retrofit}"
    const val gson = "com.google.code.gson:gson:${Versions.gson}"
    const val formatLogInterceptor = "com.github.ihsanbal:LoggingInterceptor:${Versions.logInterceptor}"
    //endregion

    //---------------------------------------------------//
    //               Dependencies  List                  //
    //---------------------------------------------------//
    val uiDependencies = arrayListOf<String>().apply {
        add(appCompat)
        add(materialDesign)
        add(constraintLayout)
    }

    val restfulApi = arrayListOf<String>().apply {
        add(retrofit)
        add(okHttp)
        add(loggingInterceptor)
        add(converterGson)
        add(gson)
        add(formatLogInterceptor)
    }
    val roomDependencies = arrayListOf<String>().apply {
        add(room)
        add(roomKtx)
    }
    val unitTestDependencies = arrayListOf<String>().apply {
        add(testCore)
        add(junit)
        add(junitEx)
    }
}