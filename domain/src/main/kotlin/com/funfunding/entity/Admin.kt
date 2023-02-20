package com.funfunding.entity

import javax.persistence.*

@Entity
@Table(name = "ADMIN")
class Admin(
  val name: String
) {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  val id: Long = 0;
}