package com.jmabilon.modularizationtemplate

import com.android.build.gradle.BaseExtension
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies

internal fun Project.configureCompose(commonExtension: BaseExtension) {
    commonExtension.apply {
        buildFeatures.compose = true

        dependencies {
            implementation(platform(libs.findLibrary("androidx-compose-bom").get()))
            // Material3 automatically brings in core Compose libraries such as
            // `ui`, `ui-graphics`, `foundation`, and `runtime` through transitive dependencies.
            // This means you get access to components like Column, Row, Modifier, Color, etc.
            // without needing to declare those modules explicitly.
            implementation(libs.findLibrary("androidx-compose-material3").get())
            // Use to get access to LayoutInspector and some debug functions for preview.
            debugImplementation(libs.findLibrary("androidx-compose-ui-tooling").get())
            // Use to get access preview inside Android Studio.
            implementation(libs.findLibrary("androidx-compose-ui-tooling-preview").get())
            implementation(libs.findLibrary("koin-androidx-compose").get())
        }
    }
}
