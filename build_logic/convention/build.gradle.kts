plugins {
    `kotlin-dsl`
}

group = "com.jmabilon.modularizationtemplate.buildlogic"

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

dependencies {
    compileOnly(gradleApi())
    compileOnly(libs.android.gradle.plugin)
}

gradlePlugin {
    plugins {
        create("conventionAndroidApplication") {
            id = libs.plugins.convention.android.application.get().pluginId
            implementationClass = "AndroidApplicationConventionPlugin"
        }
        create("conventionAndroidLibrary") {
            id = libs.plugins.convention.android.library.get().pluginId
            implementationClass = "AndroidLibraryConventionPlugin"
        }
        create("conventionCompose") {
            id = libs.plugins.convention.compose.get().pluginId
            implementationClass = "AndroidComposeConventionPlugin"
        }
    }
}
