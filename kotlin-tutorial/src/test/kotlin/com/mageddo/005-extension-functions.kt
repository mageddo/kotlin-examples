package com.mageddo

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Test

class ExtensionFunctionsTest {
	@Test
	fun functionExtension() {
		assertFalse("Elvis".isBlank())
	}
}

