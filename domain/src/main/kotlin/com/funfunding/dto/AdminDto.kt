package com.funfunding.dto

import com.funfunding.entity.Admin

data class AdminDto(
  val name: String
) {
  companion object {
    fun fromEntity(entity: Admin): AdminDto =
      AdminDto(
        name = entity.name
      )
  }
}
