group = "com.state.management"
version = "1.0-SNAPSHOT"

dependencies {
    implementation(libs.spring.boot)
    implementation(libs.spring.boot.bom)
    implementation(libs.spring.boot.starter)
    implementation(libs.spring.boot.starter.webflux)
}

repositories {
    mavenCentral()
}

kotlin {
    jvmToolchain(21)
}