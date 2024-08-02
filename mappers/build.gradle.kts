plugins {
    id("org.jetbrains.kotlin.jvm")
    id("com.apollographql.apollo")
}

dependencies {
    api(project(":schema"))
}

apollo {
    service("service") {
        packageName.set("com.example")
        srcDir("graphql")

        dependsOn(project(":schema"))
    }
}