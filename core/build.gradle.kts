plugins {
    alias(libs.plugins.convention.android.library)
}

android {
    namespace = "com.jmabilon.modularizationtemplate.core"
}

dependencies {
    implementation(projects.core.datastore)
}
