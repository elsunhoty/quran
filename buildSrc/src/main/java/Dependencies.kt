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
    private const val testArcCore = "androidx.arch.core:core-testing:${Versions.testArcCore}"
    private const val junit = "junit:junit:${Versions.junit}"
    private const val junitEx = "androidx.test.ext:junit:${Versions.extJunit}"

    const val robolectric = "org.robolectric:robolectric:${Versions.robolectric}"

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

    //---------------------------------------------------//
    //               Dependencies  List                  //
    //---------------------------------------------------//
    val uiDependencies = arrayListOf<String>().apply {
        add(appCompat)
        add(materialDesign)
        add(constraintLayout)
    }
    val roomDependencies = arrayListOf<String>().apply {
        add(room)
        add(roomKtx)
    }
    val unitTestDependencies = arrayListOf<String>().apply {
        add(testCore)
        add(testArcCore)
        add(junit)
        add(junitEx)
    }
}