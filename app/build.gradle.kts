plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("kapt")
    id ("kotlin-android")
    id ("kotlin-parcelize")
    id ("kotlin-kapt")
    id ("com.google.dagger.hilt.android") version "2.41" apply false
}

android {
    namespace = "com.example.gitapicompose"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.example.gitapicompose"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "18"
    }
}

dependencies {

    implementation ("org.jetbrains.kotlin:kotlin-stdlib:1.0")
    implementation ("androidx.activity:activity-ktx:1.3.1")
    implementation ("androidx.core:core-ktx:1.6.0")
    implementation ("androidx.appcompat:appcompat:1.3.1")
    implementation ("com.google.android.material:material:1.4.0")
    implementation( "androidx.compose.ui:ui:1.0.1")
    implementation ("androidx.compose.material:material:1.0.1")
    implementation ("androidx.compose.ui:ui-tooling-preview:1.0.1")
    androidTestImplementation ("androidx.compose.ui:ui-test-junit4:1.0.1")
    debugImplementation ("androidx.compose.ui:ui-tooling:1.0.1")
    implementation ("androidx.lifecycle:lifecycle-viewmodel-compose:1.0.0-alpha07")

    implementation ("androidx.compose.runtime:runtime-livedata:1.0.1")
    implementation ("androidx.lifecycle:lifecycle-runtime-ktx:2.3.1")
    implementation ("androidx.activity:activity-compose:1.3.1")

    testImplementation ("junit:junit:4.13.2")
    androidTestImplementation ("androidx.test.ext:junit:1.1.3")
    androidTestImplementation ("androidx.test.espresso:espresso-core:3.4.0")

    implementation ("androidx.lifecycle:lifecycle-runtime-ktx:2.3.1")
    implementation ("androidx.lifecycle:lifecycle-extensions:2.2.0")
    implementation ("androidx.lifecycle:lifecycle-viewmodel-ktx:2.3.1")
    implementation ("androidx.lifecycle:lifecycle-livedata-ktx:2.3.1")

    implementation ("com.squareup.retrofit2:retrofit:2.9.0")
    implementation ("com.squareup.retrofit2:converter-gson:2.9.0")
    implementation ("com.squareup.okhttp3:logging-interceptor:4.9.1")
    implementation ("com.google.code.gson:gson:2.8.7")

    implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.5.1")
    implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.5.1")

    implementation ("com.google.dagger:hilt-android:2.41")
    kapt ("com.google.dagger:hilt-compiler:2.41")

    implementation ("com.google.accompanist:accompanist-insets:0.16.0")
    implementation ("io.coil-kt:coil-compose:1.3.2")
}