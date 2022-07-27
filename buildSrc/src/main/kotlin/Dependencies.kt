object Dependencies {

    //kotlin spring
    const val KOTLIN_REFLECT = "org.jetbrains.kotlin:kotlin-reflect"
    const val KOTLIN_JDK = "org.jetbrains.kotlin:kotlin-stdlib-jdk8"
    const val JACKSON = "com.fasterxml.jackson.module:jackson-module-kotlin"

    //spring starter
    const val SPRING_STARTER = "org.springframework.boot:spring-boot-starter-web"
    const val SPRING_VALIDATION = "org.springframework.boot:spring-boot-starter-validation"
    const val AOP = "org.springframework.boot:spring-boot-starter-aop"

    //database
    const val MYSQL_CONNECTOR = "mysql:mysql-connector-java"
    const val JPA = "org.springframework.boot:spring-boot-starter-data-jpa"
    //test
    const val SPRING_TEST = "org.springframework.boot:spring-boot-starter-test:${PluginVersions.SPRING_BOOT_VERSION}"
    const val MOCKITO = "com.nhaarman.mockitokotlin2:mockito-kotlin:${DependencyVersions.MOCKITO_VERSION}"
    const val MOCKITO_INLINE = "org.mockito:mockito-inline:${DependencyVersions.MOCKITO_INLINE_VERSION}"
}