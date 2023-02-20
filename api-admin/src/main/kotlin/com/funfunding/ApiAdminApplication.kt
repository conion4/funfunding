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
class ApiAdminApplication : SpringBootServletInitializer() {

  override fun configure(builder: SpringApplicationBuilder): SpringApplicationBuilder {
    return builder.properties(DEFAULT_PROPERTIES).sources(ApiAdminApplication::class.java)
  }
}

fun main(args: Array<String>) {
  runApplication<ApiAdminApplication>(*args)
}
