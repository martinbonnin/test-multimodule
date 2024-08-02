plugins {
    id("org.jetbrains.kotlin.jvm")
    id("com.apollographql.apollo")
}

dependencies {
    api("com.apollographql.apollo:apollo-runtime")
}

apollo {
    service("service") {
        packageName.set("com.example")
        srcDir("graphql")

        generateApolloMetadata.set(true)
    }
}