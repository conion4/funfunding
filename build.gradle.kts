plugins {
    kotlin("jvm")
    kotlin("kapt")
    kotlin("plugin.noarg")
}

configurations {
    compileOnly {
        extendsFrom(configurations.annotationProcessor.get())
    }
}

allprojects {
    apply(plugin = "kotlin")
    apply(plugin = "java")
    apply(plugin = "kotlin-kapt")
    apply(plugin = "kotlin-noarg")

    noArg {
        annotation("org.springframework.boot.gradle.tasks.bundling.BootJar")
    }

    group = "com.funfunding"
    version = "1.0.0-SNAPSHOT"
    java.sourceCompatibility = JavaVersion.VERSION_11
    java.targetCompatibility = JavaVersion.VERSION_11

    tasks.withType<Test> {
        useJUnitPlatform()

        // Test Logging 설정 (참고: gradle 은 기본적으로 test 콘솔 로깅이 비활성화 되어있다.)
        testLogging {
            showStandardStreams = true
            showCauses = true
            showExceptions = true
            showStackTraces = true
            exceptionFormat = org.gradle.api.tasks.testing.logging.TestExceptionFormat.FULL

            // Test Logging 에 포함할 이벤트
            events(
                org.gradle.api.tasks.testing.logging.TestLogEvent.FAILED,
            )
        }
    }

    tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
        kotlinOptions {
            freeCompilerArgs = listOf("-Xjsr305=strict")
            jvmTarget = "11"
        }
    }

    repositories {
        mavenCentral()
    }
}

subprojects {
    dependencies {
        implementation(kotlin("stdlib"))
        implementation("org.jetbrains.kotlin:kotlin-reflect")
        implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
        implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
        implementation("com.fasterxml.jackson.datatype:jackson-datatype-jsr310")

        // Simple Kotlin Logger
        implementation("io.github.microutils:kotlin-logging:${Version.kotlinLoggingVersion}")

        // annotation processor
        annotationProcessor("org.springframework.boot:spring-boot-configuration-processor")
        kapt("org.springframework.boot:spring-boot-configuration-processor")

        testImplementation("org.assertj:assertj-core")
        testImplementation("org.jetbrains.kotlin:kotlin-test")
        testImplementation("org.jetbrains.kotlinx:kotlinx-coroutines-test:${Version.kotlinCoroutinesVersion}")
        testImplementation("io.kotest:kotest-runner-junit5:${Version.koTestVersion}")
        testImplementation("io.kotest:kotest-assertions-core:${Version.koTestVersion}")
        testImplementation("io.kotest.extensions:kotest-extensions-spring:${Version.koTestExtensionsSpringVersion}")
        testImplementation("io.mockk:mockk:${Version.mockkVersion}")
        testImplementation("org.mockito.kotlin:mockito-kotlin:${Version.mockitoVersion}")
        testImplementation("org.mockito:mockito-inline:${Version.mockitoVersion}")
    }

    repositories {
        gradlePluginPortal()
        mavenCentral()
    }
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}