package com.funfunding.controller

import com.funfunding.controller.response.AdminRes
import com.funfunding.usecase.AdminUseCase
import com.funfunding.dto.AdminDto
import mu.KotlinLogging
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

private val logger = KotlinLogging.logger { }

@RestController
@RequestMapping("/admin")
class AdminController(
  private val adminUseCase: AdminUseCase
) {
  @GetMapping
  fun getAdmin(
    @RequestParam(name = "name", required = true) name: String
  ): ResponseEntity<AdminRes> {
    logger.warn { "Hello $name" }
    val dto: AdminDto = adminUseCase.findByName(name)
      ?: return ResponseEntity.notFound().build()

    return ResponseEntity.ok(AdminRes.fromDto(dto))
  }
}