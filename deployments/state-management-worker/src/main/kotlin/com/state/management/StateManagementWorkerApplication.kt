package com.state.management

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.ConfigurationPropertiesScan
import org.springframework.boot.runApplication

@SpringBootApplication
@ConfigurationPropertiesScan
class StateManagementWorkerApplication

fun main(args: Array<String>) {
    runApplication<StateManagementWorkerApplication>(*args)
}
