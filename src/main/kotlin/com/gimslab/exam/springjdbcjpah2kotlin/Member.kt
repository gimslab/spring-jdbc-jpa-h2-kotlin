package com.gimslab.exam.springjdbcjpah2kotlin

import javax.persistence.*

@Table(name = "MEMBER")
@Entity
class Member(

		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		var id: Long?,

		val name: String,
		val age: Int
)