// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    kotlin("jvm") version "1.9.0" apply false
    id("com.android.application") version "8.2.0-rc03" apply false
    id("org.jetbrains.kotlin.android") version "1.9.0" apply false
    id("org.jetbrains.kotlinx.kover") version "0.8.0"
}

allprojects {
    apply(plugin = "org.jetbrains.kotlinx.kover")
    kover {
        variants {
            named("custom") {
                add("jvm", optional = true)
                add("release", optional = true)
                addAndroid(optional = true) {
                    buildType("release") {
                        allFlavors()
                    }
                }
            }
        }
    }
}


kover {
    reports {
        filters {
            ///...
        }
    }
}

dependencies {
    kover(project(":app"))
    kover(project(":jvm"))
}