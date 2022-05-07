object Dependencies {
    //---------------------------------------------------//
    //                  Core                             //
    //---------------------------------------------------//
    const val coreKtx = "androidx.core:core-ktx:${Versions.coreKtx}"
    //---------------------------------------------------//
    //                  Ui   Dependencies                //
    //---------------------------------------------------//
    private const val appCompat = "androidx.appcompat:appcompat:${Versions.appcompat}"
    private const val materialDesign = "com.google.android.material:material:${Versions.materialDesign}"
    private const val constraintLayout ="androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
    //---------------------------------------------------//
    //                  Test Dependencies                //
    //---------------------------------------------------//
    private const val testCore = "androidx.test:core:${Versions.testCore}"
    private const val junit = "junit:junit:${Versions.junit}"
    private const val junitEx  = "androidx.test.ext:junit:${Versions.extJunit}"
    private const val espresso  = "androidx.test.espresso:espresso-core:${Versions.espresso}"

    //---------------------------------------------------//
    //               Dependencies  List                  //
    //---------------------------------------------------//
    val uiDependencies = arrayListOf<String>().apply {
       add(appCompat)
       add(materialDesign)
       add(constraintLayout)
    }

    val unitTestDependencies = arrayListOf<String>().apply {
        add(testCore)
        add(junit)
        add(junitEx)
        add(espresso)
    }
}