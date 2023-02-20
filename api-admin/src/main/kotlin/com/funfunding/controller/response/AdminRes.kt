package com.funfunding.controller.response

import com.funfunding.dto.AdminDto

data class AdminRes(
  val name: String
) {
  companion object {
    fun fromDto(dto: AdminDto): AdminRes =
      AdminRes(
        name = dto.name
      )
  }
}