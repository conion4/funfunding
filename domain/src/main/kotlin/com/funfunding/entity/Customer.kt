package com.funfunding.entity

import javax.persistence.*

@Entity
@Table(name = "CUSTOMER")
class Customer(
  val name: String, val age: Int
) {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  val id: Long = 0;
}