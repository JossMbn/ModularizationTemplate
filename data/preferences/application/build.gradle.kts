import com.jmabilon.modularizationtemplate.implementation

plugins {
    alias(libs.plugins.convention.android.library)
    alias(libs.plugins.kotlin.serialization)
}

android {
    namespace = "com.jmabilon.modularizationtemplate.data.preferences.application"
}

dependencies {
    implementation(projects.core.datastore)
    implementation(projects.domain.application.repository)

    implementation(libs.androidx.datastore.preferences)
    implementation(libs.kotlin.serialization.json)
}
