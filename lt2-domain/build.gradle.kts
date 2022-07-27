plugins {
    id("org.jetbrains.kotlin.plugin.allopen") version PluginVersions.ALLOPEN_VERSION
}

dependencies {
    implementation("org.springframework:spring-tx:5.3.20")
}

allOpen {
    annotation("com.lt2.lt2hexagonalspringserver.ApplicationService")
}