package com.funfunding.controller.response

data class FundingTemplateResponse(
  val id: String,
  val name: String,
  val price: Int,
  val imageUrl: String,
  val description: String,
  val displayStartAt: String, // TODO 시간에 대한 값?
  val displayEndAt: String
)