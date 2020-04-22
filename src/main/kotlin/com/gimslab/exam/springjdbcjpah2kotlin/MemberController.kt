package com.gimslab.exam.springjdbcjpah2kotlin

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping("/members")
@RestController
class WordPlayController(
		private val memberRepository: MemberRepository
) {
	@GetMapping
	fun list() =
			memberRepository.findAll()
}

