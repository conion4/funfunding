package com.funfunding.controller.response

data class FundingTemplateLookUpResponse(
  val success: Boolean,
  val id: String,
  val name: String,
  val price: Int,
  val displayStartAt: String,
  val displayEndAt: String,
)