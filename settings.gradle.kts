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

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
rootProject.name = "nuevo_proyecto"
=======
rootProject.name = "App"
>>>>>>> origin/Nicolee
=======
rootProject.name = "ParteFranco"
>>>>>>> origin/franco
=======
rootProject.name = "ParteEzio1"
>>>>>>> origin/ezio1
include(":app")
 