plugins {
    id("com.github.johnrengelman.shadow") version "6.1.0" apply false
    id("io.micronaut.application") version "1.3.3" apply false
    kotlin("jvm") version "1.4.10"
    kotlin("kapt") version "1.4.10"
    kotlin("plugin.allopen") version "1.4.10"
}

allprojects {
    repositories {
        mavenCentral()
    }
}
