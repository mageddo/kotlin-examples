package com.mageddo

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import java.nio.ByteBuffer
import java.util.*

class ByteArrayManipulationTest {

	@Test
	fun extractUserData() {
		val data = byteArrayOf(69, 108, 118, 105, 115, 0, 0, 0, 23)
		val user = extractUser(data)
		assertEquals(69, data[0])
		assertEquals(23, user.age)
		assertEquals("Elvis", user.name)
	}

}

fun extractUser(userData: ByteArray): User {
	return User(
		name = String(Arrays.copyOfRange(userData, 0, 5)),
		age = ByteBuffer.wrap(Arrays.copyOfRange(userData, 5, 9)).getInt()
	)
}

class User {

	val name: String?
	val age: Int

	constructor(name: String? = null, age: Int = 0){
		this.name = name
		this.age = age
	}
}
