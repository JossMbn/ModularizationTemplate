plugins {
    alias(libs.plugins.convention.android.application)
    alias(libs.plugins.convention.compose)
}

android {
    namespace = "com.jmabilon.modularizationtemplate"

    defaultConfig {
        applicationId = "com.jmabilon.modularizationtemplate"
        versionCode = 1
        versionName = "1.0"
    }
}

dependencies {
    implementation(libs.androidx.activity.compose)
}
