pluginManagement {
    includeBuild("build_logic")
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "ModularizationTemplate"
enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

include(":app")
include(":core")
include(":core:datastore")
include(":core:ui")
include(":feature:on_boarding:presentation")
include(":feature:home:presentation")
include(":domain:application:model")
include(":domain:application:repository")
include(":domain:application:usecase")
include(":data:preferences:application")
