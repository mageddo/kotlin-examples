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
		assertEquals(23, user.getAge())
		assertEquals("Elvis", user.getName())
	}

}

fun extractUser(userData: ByteArray): User {
	return User()
		.setName(String(Arrays.copyOfRange(userData, 0, 5)))
		.setAge(ByteBuffer.wrap(Arrays.copyOfRange(userData, 5, 9)).getInt())
}

class User {

	private var name: String?
	private var age: Int

	constructor(){
		this.name = null
		this.age = 0
	}

	fun getName(): String? {
		return name
	}

	fun setName(name: String): User {
		this.name = name
		return this
	}

	fun getAge(): Int {
		return age
	}

	fun setAge(age: Int): User {
		this.age = age
		return this
	}
}
