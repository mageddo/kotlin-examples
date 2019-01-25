package com.mageddo

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MultilineStringsTest {

	@Test
	fun testMultilineStringAndStringInterpolation() {
		assertEquals("Hi Elvis", printName("Elvis"))
	}

}
