plugins {
    id("org.jetbrains.kotlin.jvm")
    id("com.apollographql.apollo3")
}

dependencies {
    api("com.apollographql.apollo3:apollo-runtime")
}

apollo {
    service("service") {
        packageName.set("com.example")
        srcDir("graphql")

        alwaysGenerateTypesMatching.set(emptyList())
        generateApolloMetadata.set(true)
        isADependencyOf(project(":mappers"))
    }
}