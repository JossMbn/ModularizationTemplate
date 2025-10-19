import com.jmabilon.modularizationtemplate.implementation

plugins {
    alias(libs.plugins.convention.android.application)
    alias(libs.plugins.convention.compose)
    alias(libs.plugins.kotlin.serialization)
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
    implementation(projects.feature.home.presentation)
    implementation(projects.feature.onBoarding.presentation)

    implementation(projects.domain.application.usecase)

    implementation(projects.data.preferences.application)

    implementation(libs.androidx.activity.compose)
    implementation(libs.androidx.compose.navigation)
    implementation(libs.kotlin.serialization.json)
}
