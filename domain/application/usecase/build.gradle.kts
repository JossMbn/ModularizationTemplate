plugins {
    alias(libs.plugins.convention.android.library)
}

android {
    namespace = "com.jmabilon.modularizationtemplate.domain.application.usecase"
}

dependencies {
    api(projects.domain.application.model)
    implementation(projects.domain.application.repository)
}
