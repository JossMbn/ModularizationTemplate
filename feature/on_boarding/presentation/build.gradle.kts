import com.jmabilon.modularizationtemplate.implementation

plugins {
    alias(libs.plugins.convention.android.library)
    alias(libs.plugins.convention.compose)
}

android {
    namespace = "com.jmabilon.modularizationtemplate.feature.onboarding.presentation"
}

dependencies {
    implementation(projects.domain.application.usecase)

    implementation(libs.androidx.lifecycle.viewmodel)
}
