package com.mageddo

import com.mageddo.utils.mapper

fun main() {
	println(myStaticFunc())
	println(mapper.writeValueAsString(Car.getBrands()))
}

fun myStaticFunc(): String {
	return """
		|hello world
	""".trimMargin()
}

class Car(var model: String){
	companion object {
		fun getBrands(): Array<String> {
			return arrayOf("Nissan", "Audi", "Lamborghini")
		}
	}
}
