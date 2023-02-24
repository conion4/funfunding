package com.funfunding.controller.request

data class FundingTemplateLookUpRequest(
  val id: String,
  val name: String,
  val price: Int,
  val displayStartAt: String,
  val displayEndAt: String,
)