plugins {
    id("com.android.library")
    id("kotlin-android")
    id("VitaminComposeLibraryPlugin")
    id("com.vanniktech.maven.publish")
}

dependencies {
    api(project(":foundation"))
    api(project(":text-inputs"))
    implementation(AndroidX.compose.ui.tooling)
}
