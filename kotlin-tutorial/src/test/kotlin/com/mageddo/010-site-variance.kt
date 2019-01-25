package com.mageddo

// https://kotlinlang.org/docs/reference/generics.html#use-site-variance-type-projections
class SiteVarianceTest {
	fun voix(){
		val ints: Array<Int> = arrayOf(1, 2, 3)
		val any = Array<Any>(3) { "" }
		copy(ints, any)
	}
}
fun <T>copy(from: Array<out T>, to: Array<T>) {
	assert(from.size == to.size)
	for (i in from.indices)
		to[i] = from[i]
}
