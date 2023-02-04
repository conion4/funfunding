package com.funfunding.base

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/hello")
class Hello {
    @GetMapping()
    fun index() : ResponseEntity<String>{
        return ResponseEntity.ok("안녕하세요!")
    }
}