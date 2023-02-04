package com.funfunding

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.builder.SpringApplicationBuilder
import org.springframework.boot.runApplication
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer

@SpringBootApplication
class ApiAdminApplication : SpringBootServletInitializer() {

    override fun configure(builder: SpringApplicationBuilder): SpringApplicationBuilder {
        return builder.properties(DEFAULT_PROPERTIES).sources(ApiAdminApplication::class.java)
    }

    companion object {
        val DEFAULT_PROPERTIES = mapOf(
            "spring.application.name" to "funfunding-admin",
            "spring.profiles.actvie" to "local"
        )
    }
}

fun main(args: Array<String>) {
    runApplication<ApiAdminApplication>(*args)
}
