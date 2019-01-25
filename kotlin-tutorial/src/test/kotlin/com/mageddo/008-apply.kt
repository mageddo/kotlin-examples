package com.mageddo

import org.junit.jupiter.api.Test

class ApplyTest {
	@Test
	fun printNameUsingApply(){
		printNameUsingApply(Customer("Elvis"))
	}
}

data class Customer(var name: String) {
}

fun printNameUsingApply(customer: Customer){
	customer.apply {
		println(this.name)
	}
}
