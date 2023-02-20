package com.funfunding.service

import com.funfunding.dto.AdminDto
import com.funfunding.repository.AdminRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional(readOnly = true)
class AdminDomainReader(
  private val adminRepository: AdminRepository
) {

  fun findByNameOrNull(name: String): AdminDto? {
    return adminRepository.findByName(name)
      ?.let(AdminDto::fromEntity)
  }

}