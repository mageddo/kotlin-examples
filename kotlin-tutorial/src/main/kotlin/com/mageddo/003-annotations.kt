package com.mageddo

import kotlin.reflect.KClass

@Target(AnnotationTarget.CLASS, AnnotationTarget.FUNCTION)
@MustBeDocumented
public annotation class Watcher(val clazz: KClass<*>, val name: String, val version: Int = 1) {
}

public class PersonDao {
	@Watcher(clazz = PersonDao::class, name = "count")
	@JavaWatcher(PersonDao::class)
	public fun count(){
		println("PersonDao.count")
		println(Person::class.members)
	}
}

fun main(args: Array<String>) {
	PersonDao().count()
}
