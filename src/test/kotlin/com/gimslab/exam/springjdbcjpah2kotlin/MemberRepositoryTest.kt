package com.gimslab.exam.springjdbcjpah2kotlin

import org.junit.jupiter.api.Test
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.annotation.Rollback

@SpringBootTest
@Rollback(false)
class MemberRepositoryTest(
		@Autowired
		private val memberRepository: MemberRepository
) {
	companion object {
		private val logger: Logger = LoggerFactory.getLogger(this.javaClass)
	}

	@Test
	fun save() {
		val m = Member(id = null, name = "Kim", age = 22)
		val saved = memberRepository.save(m)
		logger.info("++ saved:$saved")
	}
}