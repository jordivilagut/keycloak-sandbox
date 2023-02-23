package com.keycloaksandbox.app

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@SpringBootApplication
@EntityScan("com.keycloaksandbox.entities")
@EnableJpaRepositories("com.keycloaksandbox.repositories")
@ComponentScan("com.keycloaksandbox.controllers", "com.keycloaksandbox.services", "com.keycloaksandbox.security")
class KeycloakSandboxApplication

fun main(args: Array<String>) {
    runApplication<KeycloakSandboxApplication>(*args)
}
