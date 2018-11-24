package com.mageddo

// https://stackoverflow.com/questions/43465032/getting-error-while-dealing-with-getter-and-setter-in-kotlin
// https://www.programiz.com/kotlin-programming/getters-setters
// https://kotlinlang.org/docs/reference/data-classes.html

fun main(){
	val person = Person("Jose")
	person.name = "Maria"
	println(person.name)
}

class Person {
	var name: String
		get() {
			return field
		}
		set(name) {
			field = name
		}

	constructor(name: String) {
		this.name = name
	}

}
