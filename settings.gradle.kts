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
        @Suppress("ktlint:standard:property-naming")
        val YellyfinExtensionsUsername: String? by settings
        if (!YellyfinExtensionsUsername.isNullOrBlank()) {
            maven("https://maven.pkg.github.com/jankoran90/yellyfin-extensions") {
                name = "YellyfinExtensions"
                credentials(PasswordCredentials::class)
            }
        }
    }
}

rootProject.name = "Yellyfin"
include(":app")
