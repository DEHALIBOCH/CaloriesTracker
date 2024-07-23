plugins {
    `kotlin-dsl`
}

repositories {
    mavenCentral()
    google()
    maven(url = "https://jitpack.io")
}


dependencies {
    implementation(libs.android.gradle)
}