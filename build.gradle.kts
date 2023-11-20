@file:Suppress("DSL_SCOPE_VIOLATION") // Suppresion for https://github.com/gradle/gradle/issues/22797 error
plugins {
    //trick: for the same plugin versions in all sub-modules
    alias(libs.plugins.androidApplication).apply(false)
    alias(libs.plugins.androidLibrary).apply(false)
    alias(libs.plugins.kotlinAndroid).apply(false)
    alias(libs.plugins.kotlinMultiplatform).apply(false)

    // Setup KMP-NativeCoroutines
    id("com.google.devtools.ksp").version("1.9.20-1.0.14").apply(false)
    id("com.rickclephas.kmp.nativecoroutines").version("1.0.0-ALPHA-20").apply(false)
}
