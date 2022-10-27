plugins {
    kotlin("jvm")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":events:citizen:domain"))
    implementation(kotlin("stdlib"))
    implementation("org.springframework:spring-context:5.3.23")
}
