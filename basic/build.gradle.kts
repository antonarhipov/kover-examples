plugins {
    kotlin("jvm") version "1.9.0"
    id("org.jetbrains.kotlinx.kover") version "0.7.3"
}

group = "org.kover"
version = "1.0-SNAPSHOT"

kover {
    //disable coverage without deleting this configuration
    disable()

    //do not calculate coverage for Java code
    excludeJavaCode()

    // use JaCoCo engine
    useJacoco()

    // disable instrumentation for package and classes
    excludeInstrumentation {
        packages()
        classes()
    }

    // exclude source sets
    excludeSourceSets {
        names("src1", "src2")
    }

    // test task names to exclude
    excludeTests {
        tasks("a","b","c")
    }
}

koverReport {
    filters {
        // filters for all reports
    }

    verify {
        // verification rules for all reports
    }

    defaults {
        xml { /* default XML report config */ }
        html { /* default HTML report config */ }
        verify { /* default verification config */ }
        log { /* default logging config */ }
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

