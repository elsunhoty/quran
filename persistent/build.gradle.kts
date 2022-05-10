plugins {
    id("com.android.library")
    kotlin("android")
    kotlin("kapt")
}

android {
    compileSdk = AppConfig.compileSdkVersion
    defaultConfig {
        minSdk = AppConfig.minSdk
        targetSdk = AppConfig.targetSdk
        testInstrumentationRunner = AppConfig.androidTestInstrumentation
        consumerProguardFiles("consumer-rules.pro")
    }
    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                AppConfig.proguardConsumerRules
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    testOptions {
        unitTests {
            isIncludeAndroidResources = true
        }
    }
}

dependencies {
    implementation(Dependencies.coreKtx)
    implementation(Dependencies.roomDependencies)
    implementation(Dependencies.roomDependencies)
    implementation(Dependencies.injector)

    implementation(Dependencies.liveData)
        ?.because("Required For robolectric Test Cases")

    kapt(Dependencies.roomKapt)

    testImplementation(Dependencies.unitTestDependencies)
    testImplementation(Dependencies.robolectric)
    testImplementation(Dependencies.roomTest)
    testImplementation(Dependencies.testArcCore)


}