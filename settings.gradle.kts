plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.5.0"
}
rootProject.name = "state-management"

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

include(
    "deployments:state-management-search",
    "deployments:state-management-execute",
    "deployments:state-management-worker",
    "deployments:state-management-worker-dlq"
)
