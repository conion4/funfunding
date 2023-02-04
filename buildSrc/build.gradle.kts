plugins {
    `kotlin-dsl`
}

repositories {
    mavenCentral()
    gradlePluginPortal()
}
object PluginVersion {
    const val KOTLIN = "1.6.21"
    const val SPRING_BOOT = "2.7.8"
    const val SPRING_DEPENDENCY_MANAGEMENT = "1.0.15.RELEASE"
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:${PluginVersion.KOTLIN}")
    implementation("org.jetbrains.kotlin:kotlin-allopen:${PluginVersion.KOTLIN}")
    implementation("org.jetbrains.kotlin:kotlin-noarg:${PluginVersion.KOTLIN}")
    implementation("org.springframework.boot:spring-boot-gradle-plugin:${PluginVersion.SPRING_BOOT}")
    implementation("io.spring.gradle:dependency-management-plugin:${PluginVersion.SPRING_DEPENDENCY_MANAGEMENT}")
}
