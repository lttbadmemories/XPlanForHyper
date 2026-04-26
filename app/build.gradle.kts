plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.example.xplan"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.xplan"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }

    buildFeatures {
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.14"
    }
}

dependencies {
    // Fix lỗi dependency
    implementation("androidx.navigation:navigation-compose:2.7.7")

    // Shizuku (OK với mavenCentral)
    implementation("dev.rikka.shizuku:api:13.1.5")
    implementation("dev.rikka.shizuku:provider:13.1.5")

    implementation("androidx.activity:activity-compose:1.9.0")
}
