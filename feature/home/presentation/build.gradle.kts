import com.jmabilon.modularizationtemplate.implementation

plugins {
    alias(libs.plugins.convention.android.library)
    alias(libs.plugins.convention.compose)
}

android {
    namespace = "com.jmabilon.modularizationtemplate.feature.home.presentation"
}

dependencies {
    implementation(libs.androidx.lifecycle.viewmodel)
}
