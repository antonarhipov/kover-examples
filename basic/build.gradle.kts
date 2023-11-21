import kotlinx.kover.gradle.plugin.dsl.GroupingEntityType


plugins {
    kotlin("jvm") version "1.9.20"
    id("org.jetbrains.kotlinx.kover") version "0.8.0"
}

group = "org.kover"
version = "1.0-SNAPSHOT"

kover {

    reports {
        filters {
            excludes {
                // exclude any classes in any packages that end with 'Plugin'
//                classes("*Plugin")

                // exclude any package that ends with 'ext' (all the subpackages will also be excluded)
                packages("*ext")
            }
        }

        verify {
            rule("Minimum coverage") {
                minBound(10)
                groupBy = GroupingEntityType.CLASS

                // same as minBound(10) but allows changing the defaults
//                bound {
//                    this.min = 10
//                    this.aggregationForGroup = AggregationType.COVERED_PERCENTAGE
//                    this.coverageUnits = MetricType.LINE
//                }
            }
        }

        total {
            log {
                groupBy = GroupingEntityType.CLASS
            }
        }
    }

}

kotlin {
    jvmToolchain(17)
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

