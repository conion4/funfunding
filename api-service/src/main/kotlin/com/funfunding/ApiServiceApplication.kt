package com.funfunding

import com.funfunding.annotation.EnableDomain
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.builder.SpringApplicationBuilder
import org.springframework.boot.runApplication
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer

private val DEFAULT_PROPERTIES = mapOf(
  "spring.profiles.active" to "local"
)

@EnableDomain
@SpringBootApplication
class ApiServiceApplication : SpringBootServletInitializer() {
  override fun configure(builder: SpringApplicationBuilder): SpringApplicationBuilder {
    return builder.properties(DEFAULT_PROPERTIES).sources(ApiServiceApplication::class.java)
  }
}

fun main(args: Array<String>) {
  runApplication<ApiServiceApplication>(*args)
}
