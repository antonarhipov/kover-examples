import kotlinx.kover.gradle.plugin.dsl.AggregationType
import kotlinx.kover.gradle.plugin.dsl.GroupingEntityType
import kotlinx.kover.gradle.plugin.dsl.MetricType

plugins {
    kotlin("jvm")
    id("org.jetbrains.kotlinx.kover")
}

group = "me.anton"
version = "1.0-SNAPSHOT"


kotlin {
    jvmToolchain(17)
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

