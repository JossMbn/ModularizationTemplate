import com.jmabilon.modularizationtemplate.implementation

plugins {
    alias(libs.plugins.convention.android.library)
    alias(libs.plugins.kotlin.serialization)
}

android {
    namespace = "com.jmabilon.modularizationtemplate.core.datastore"
}

dependencies {
    implementation(projects.domain.application.model)
    implementation(projects.domain.application.repository)

    implementation(libs.androidx.datastore.preferences)
    implementation(libs.kotlin.serialization.json)
    implementation(libs.core.ktx)
}
