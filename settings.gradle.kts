pluginManagement {
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

rootProject.name = "CaloriesTracker"
include(":app")
include(":core")
include(":onboarding")
include(":onboarding:presentation")
include(":onboarding:domain")
include(":calories_tracker")
include(":calories_tracker:presentation")
include(":calories_tracker:domain")
include(":calories_tracker:data")
include(":core-ui")
