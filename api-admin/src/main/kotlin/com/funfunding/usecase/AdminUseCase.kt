package com.funfunding.usecase

import com.funfunding.dto.AdminDto

/**
 * @see [com.funfunding.application.AdminService]
 */
interface AdminUseCase {
  fun findByName(name: String): AdminDto?
}