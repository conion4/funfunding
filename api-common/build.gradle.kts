import org.springframework.boot.gradle.tasks.bundling.BootJar

val jar: Jar by tasks
val bootJar: BootJar by tasks
bootJar.enabled = false
jar.enabled = true

plugins {
    id("org.springframework.boot")
    id("io.spring.dependency-management")
    kotlin("plugin.spring")
    kotlin("plugin.jpa")
    id("java-test-fixtures")
}

val aspectjWeaverVersion: String by rootProject

dependencies {

    implementation(project(":core"))
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.aspectj:aspectjweaver:${Version.aspectjWeaverVersion}")

    testImplementation("org.springframework.boot:spring-boot-starter-test")
}
