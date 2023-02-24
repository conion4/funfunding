package com.funfunding.controller

import com.funfunding.controller.request.FundingTemplateCreateRequest
import com.funfunding.controller.response.FundingTemplateResponse
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/admin")
class FundingTemplateController {


  @PostMapping("/funding-templates")
  fun createFundingTemplate(
    @RequestBody fundingTemplateCreateRequest: FundingTemplateCreateRequest
  ): ResponseEntity<FundingTemplateResponse> {
    // TODO Swagger / RestDoc 으로 코드 문서화하기

    return ResponseEntity.ok(
      FundingTemplateResponse(
        id = "1",
        name = "name",
        price = 1000,
        imageUrl = "naver.com",
        description = "설명",
        displayStartAt = "2022-02-02",
        displayEndAt = "2023-03-01",
      )
    )
  }
}