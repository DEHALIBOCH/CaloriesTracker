plugins {
    id(libs.plugins.android.library.get().pluginId)
    alias(libs.plugins.jetbrains.kotlin.android)
    alias(libs.plugins.compose.compiler)
    alias(libs.plugins.ksp)
    alias(libs.plugins.hilt)
    kotlin("kapt")
    id("kotlin-parcelize")
}

apply(from = "$rootDir/compose-module.gradle")

android {
    namespace = "kz.dehaliboch.presentation"
}

dependencies {

    implementation(project(":core"))
    implementation(project(":calories_tracker:domain"))

    implementation(libs.coil.compose)
}