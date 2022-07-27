plugins {
    id("org.springframework.boot") version PluginVersions.SPRING_BOOT_VERSION
    id("io.spring.dependency-management") version PluginVersions.DEPENDENCY_MANAGER_VERSION
    kotlin("plugin.spring") version PluginVersions.SPRING_PLUGIN_VERSION
    kotlin("plugin.jpa") version PluginVersions.JPA_PLUGIN_VERSION
}

group = "com.lt2"
version = "0.0.1-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(Dependencies.SPRING_VALIDATION)
    implementation(Dependencies.SPRING_STARTER)
    implementation(Dependencies.AOP)

//    implementation(Dependencies.JPA)
//    implementation(Dependencies.MYSQL_CONNECTOR)

    implementation(Dependencies.JACKSON)
    implementation(project(":lt2-domain"))
}

tasks.getByName<Jar>("jar") {
    enabled = false
}