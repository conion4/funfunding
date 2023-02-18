package com.funfunding

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.boot.web.servlet.ServletComponentScan


@SpringBootApplication
class FunfundingApplication

fun main(args: Array<String>) {
	runApplication<FunfundingApplication>(*args)
}
