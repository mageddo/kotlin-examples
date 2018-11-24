package com.mageddo

fun main() {
	println(myStaticFunc())
	println(mapper.writeValueAsString(Car.getAllBrands()))
}

fun myStaticFunc(): String {
	return """
		|hello world
	""".trimMargin()
}

class Car(var model: String) {
	companion object {
		fun getAllBrands(): Array<String> {
			return arrayOf("Nissan", "Audi", "Lamborghini")
		}
	}
}
