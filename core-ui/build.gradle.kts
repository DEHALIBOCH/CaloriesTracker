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
    namespace = "kz.dehaliboch.core_ui"
}