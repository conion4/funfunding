package com.funfunding.annotation

import com.funfunding.domain.DomainConfig
import org.springframework.context.annotation.Import

@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
@MustBeDocumented
@Import(DomainConfig::class)
annotation class EnableDomain()