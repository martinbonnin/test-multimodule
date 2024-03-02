plugins {
    id("org.jetbrains.kotlin.jvm")
    id("com.apollographql.apollo3")
    id("java-test-fixtures")
}

dependencies {
    api(project(":schema"))
    testFixturesApi("org.jetbrains.kotlinx:kotlinx-collections-immutable:0.3.6")
}

apollo {
    service("service") {
        packageName.set("com.example")
        srcDir("graphql")

        alwaysGenerateTypesMatching.set(emptyList())
        dependsOn(project(":schema"))
    }
}