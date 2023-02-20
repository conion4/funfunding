import org.springframework.boot.gradle.tasks.bundling.BootJar

group = "com.funfunding"
version = "0.0.1-SNAPSHOT"

val jar: Jar by tasks
val bootJar: BootJar by tasks
bootJar.enabled = false
jar.enabled = true

plugins {
  id("org.springframework.boot")
  id("io.spring.dependency-management")
  kotlin("plugin.jpa")
  kotlin("plugin.allopen")
  kotlin("plugin.spring")
  id("java-test-fixtures")
}

allOpen {
  annotation("javax.persistence.Entity")
  annotation("javax.persistence.Embeddable")
  annotation("javax.persistence.MappedSuperclass")
  annotation("org.springframework.stereotype.Service")
}

dependencies {
  implementation(project(":core"))

  implementation("org.springframework.boot:spring-boot-starter-web")
  implementation("org.springframework.boot:spring-boot-starter-data-jpa")

  implementation("com.querydsl:querydsl-jpa")
  kapt(group = "com.querydsl", name = "querydsl-apt", classifier = "jpa")

  implementation("com.h2database:h2")

  testImplementation("org.springframework.boot:spring-boot-starter-test")
}

kotlin.sourceSets.main {
  setBuildDir("$buildDir")
}
