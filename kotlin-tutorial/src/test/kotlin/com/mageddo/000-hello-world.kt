package com.mageddo

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import java.io.ByteArrayOutputStream
import java.io.PrintStream
import java.nio.charset.Charset

class HelloWorldTest {
	@Test
	fun helloWorld(){
		// arrange
		val bout = ByteArrayOutputStream()
		System.setOut(PrintStream(bout))

		// act
		println("Hello World")

		// assert
		assertEquals("Hello World\n", bout.toString(Charset.defaultCharset()))
	}
}
