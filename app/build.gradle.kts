plugins {
    application
    checkstyle
    jacoco
}

application {
    mainClass = "hexlet.code.App"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}
tasks.getByName("run", JavaExec::class) {
    standardInput = System.`in`
}
