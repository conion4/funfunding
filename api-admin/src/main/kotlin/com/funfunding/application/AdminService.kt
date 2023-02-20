package com.funfunding.application

import com.funfunding.usecase.AdminUseCase
import com.funfunding.dto.AdminDto
import org.springframework.stereotype.Service
import com.funfunding.service.AdminDomainReader

@Service
class AdminService(
  private val adminDomainReader: AdminDomainReader
) : AdminUseCase {
  override fun findByName(name: String): AdminDto? {
    return adminDomainReader.findByNameOrNull(name)
  }
}