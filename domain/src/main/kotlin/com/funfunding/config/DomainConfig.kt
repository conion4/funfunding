package com.funfunding.domain

import org.springframework.boot.context.properties.ConfigurationPropertiesScan
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration

@Configuration
@ComponentScan(basePackages = ["com.funfunding.domain"])
@ConfigurationPropertiesScan
class DomainConfig {

}