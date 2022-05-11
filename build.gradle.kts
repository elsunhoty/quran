// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application").apply(false).version(Versions.gradle)
    id("com.android.library").apply(false).version(Versions.gradle)
    id("org.jetbrains.kotlin.android").apply(false).version(Versions.kotlin)
    id("org.jetbrains.kotlin.jvm") version "1.6.21" apply false
}
tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
