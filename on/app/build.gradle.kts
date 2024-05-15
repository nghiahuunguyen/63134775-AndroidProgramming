plugins {
<<<<<<< HEAD
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.example.on"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.on"
=======
    id("com.android.application")
}

android {
    namespace = "till.edu.on"
    compileSdk = 34

    defaultConfig {
        applicationId = "till.edu.on"
>>>>>>> 7e3ff9723b1067cbaa9c4c7e0d457d038cecaebb
        minSdk = 24
        targetSdk = 34
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
<<<<<<< HEAD
=======
    buildFeatures {
        viewBinding = true
    }
>>>>>>> 7e3ff9723b1067cbaa9c4c7e0d457d038cecaebb
}

dependencies {

<<<<<<< HEAD
    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
=======
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.12.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("androidx.navigation:navigation-fragment:2.6.0")
    implementation("androidx.navigation:navigation-ui:2.6.0")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
>>>>>>> 7e3ff9723b1067cbaa9c4c7e0d457d038cecaebb
}