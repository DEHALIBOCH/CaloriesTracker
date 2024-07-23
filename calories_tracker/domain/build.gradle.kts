plugins {
    id(libs.plugins.android.library.get().pluginId)
    alias(libs.plugins.jetbrains.kotlin.android)
    alias(libs.plugins.ksp)
    alias(libs.plugins.hilt)
    id("kotlin-parcelize")
}

apply(from = "$rootDir/base-module.gradle")

android {
    namespace = "kz.dehaliboch.domain"
}

dependencies {

    implementation(project(":core"))
}