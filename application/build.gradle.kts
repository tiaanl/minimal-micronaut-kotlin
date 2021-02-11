plugins {
    kotlin("jvm")
    kotlin("kapt")
    kotlin("plugin.allopen")
    id("io.micronaut.application")
}

application {
    mainClass.set("com.example.Application")
}

micronaut {
    version("2.3.1")
    runtime("netty")
    testRuntime("junit")
    processing {
        incremental(true)
        annotations("com.example.*")
    }
}

dependencies {
    implementation(project(":library"))

    implementation("io.micronaut:micronaut-http-client")

    runtimeOnly("ch.qos.logback:logback-classic")
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    kotlinOptions {
        jvmTarget = "11"
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}
