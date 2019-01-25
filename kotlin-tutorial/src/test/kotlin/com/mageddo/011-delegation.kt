package com.mageddo

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.Test
import java.lang.Exception

class DelegationTest {
	@Test
	fun delegationTest(){
		// arrange
		val controller = LimitedVolumeTvController(DefaultTvController())

		// act
		controller.power()
		controller.volumeDown()

		// assert
		assertThrows(TooHighVolumeException::class.java) {
			for (i in  1..100){
				controller.volumeUp()
			}
		}
	}
}

interface TvController {
	fun power()
	fun volumeUp()
	fun volumeDown()
	fun volume(): Int
}

class DefaultTvController : TvController {

	private var volume: Int = 0

	override fun power() {
		println("powering on / off")
	}

	override fun volumeUp() {
		this.volume++
		println("volume up to ${volume} ")
	}

	override fun volumeDown() {
		this.volume--
		println("volume down to ${volume} ")
	}

	override fun volume(): Int {
		return this.volume
	}
}

class LimitedVolumeTvController(var controller: TvController) : TvController by controller {
	override fun volumeUp() {
		if(volume() >= 50){
			throw TooHighVolumeException(volume())
		}
		controller.volumeUp()
	}
}

class TooHighVolumeException : Exception {
	constructor(volume: Int) : super("Too high volume: ${volume}")
}
