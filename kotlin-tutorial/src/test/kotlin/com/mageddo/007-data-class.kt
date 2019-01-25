package com.mageddo

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

data class Fruit(val name:String, val weightKg:Int) {
}

class DataClassTest {
	@Test
	fun dataClassTest(){
		// arrange / act
		val apple = Fruit("Apple", 2)

		// assert
		assertEquals("Fruit(name=Apple, weightKg=2)", apple.toString())
		assertEquals("Fruit(name=Orange, weightKg=2)", apple.copy(name = "Orange").toString())
	}
}
