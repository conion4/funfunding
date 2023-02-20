package com.funfunding.repository

import com.funfunding.entity.Admin
import org.springframework.data.jpa.repository.JpaRepository

interface AdminRepository : JpaRepository<Admin, Long> {
  fun findByName(name: String): Admin?
}