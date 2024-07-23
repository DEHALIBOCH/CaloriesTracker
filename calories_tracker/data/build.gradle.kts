plugins {
    id(libs.plugins.android.library.get().pluginId)
    alias(libs.plugins.jetbrains.kotlin.android)
    alias(libs.plugins.compose.compiler)
    alias(libs.plugins.ksp)
    alias(libs.plugins.hilt)
    id("kotlin-parcelize")
}

apply(from = "$rootDir/compose-module.gradle")

android {
    namespace = "kz.dehaliboch.data"
}

dependencies {

    implementation(project(":core"))
    implementation(project(":calories_tracker:domain"))

    implementation(libs.retrofit)
    implementation(libs.okhttp)
    implementation(libs.retrofit.converter.moshi)
    debugImplementation (libs.chucker.library)
    releaseImplementation (libs.chucker.library.no.op)

    ksp(libs.room.compiler)
    implementation(libs.room.runtime)
    implementation(libs.room.ktx)
}