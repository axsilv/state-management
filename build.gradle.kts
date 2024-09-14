plugins {
    alias(libs.plugins.kotlin)
    alias(libs.plugins.spring.boot)
    alias(libs.plugins.spring.dependency.management)
    alias(libs.plugins.plugin.spring)
    alias(libs.plugins.kotlinter)
}

group = "com.state.management"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

subprojects {
    if ( file("src/main/kotlin").isDirectory || file("src/main/resource").isDirectory) {
        apply {
            plugin("org.jetbrains.kotlin.jvm")
            plugin("org.springframework.boot")
            plugin("io.spring.dependency-management")
            plugin("org.jetbrains.kotlin.plugin.spring")
            plugin("org.jmailen.kotlinter")
        }

        dependencies {
            implementation(rootProject.libs.spring.boot)
            implementation(rootProject.libs.spring.boot.bom)
            implementation(rootProject.libs.spring.boot.starter)

            testImplementation(rootProject.libs.kotest.junit5)
            testImplementation(rootProject.libs.kotest.assertions)
            testImplementation(rootProject.libs.kotest.property)
            testImplementation(rootProject.libs.mockk)
        }

        tasks.test {
            useJUnitPlatform()
        }

        repositories {
            mavenCentral()
        }

        kotlin {
            jvmToolchain(21)
        }
    }
}
