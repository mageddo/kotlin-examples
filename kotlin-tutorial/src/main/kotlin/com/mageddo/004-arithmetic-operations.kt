package com.mageddo

fun main(args: Array<String>) {

	val a: Int = 1
	val b: Int = 1

	println(a.plus(b))
	println(4.times(5))

	println("\n=========")
	intArrayOf(1,2,3).forEach {
		println(it)
	}
	println("\n=========")

	println(sum(5, 5))
}


fun sum(a: Int, b: Int): Int {
	return a.plus(b)
}


fun funB(){

}
