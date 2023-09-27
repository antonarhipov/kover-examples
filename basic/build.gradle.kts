plugins {
    kotlin("jvm") version "1.9.0"
    id("org.jetbrains.kotlinx.kover") version "0.7.3"
}

group = "org.kover"
version = "1.0-SNAPSHOT"

kover {
    // disable instrumentation for package and classes
    excludeInstrumentation {
        packages("org.kover.basic.ext")
    }
}

koverReport {
    filters {
        excludes {
            packages("org.kover.basic.ext")
        }
    }

    verify {
        rule("Minimal coverage") {
            minBound(99)
        }
    }

    // koverVerify
    total {
        xml { path{} }
        html { path{} }
    }
//
//    report("ReleaseA") {  // koverVerifyReleaseA
//        filter { exclude("a.b") }
//        path("releaseA")
//    }
//
//    report("ReleaseB") { // koverVerifyReleaseB
//        path("releaseB")
//    }

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

