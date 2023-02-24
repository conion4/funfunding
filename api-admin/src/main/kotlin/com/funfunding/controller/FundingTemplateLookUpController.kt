package com.funfunding.controller

import com.funfunding.controller.request.FundingTemplateLookUpRequest
import com.funfunding.controller.response.FundingTemplateLookUpResponse
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/admin")
class FundingTemplateLookUpController {
  @PostMapping("/funding-LookUp")
  fun lookUpFundingTemplate(
    @RequestBody fundingTemplateLookUpRequest: FundingTemplateLookUpRequest
  ): ResponseEntity<FundingTemplateLookUpResponse>{
    return ResponseEntity.ok(
      FundingTemplateLookUpResponse(
        success = true,
        id = "2",
        name = "name",
        price = 5000,
        displayStartAt = "2022-02-22",
        displayEndAt = "2022-03-30",
      )
    )

  }
}