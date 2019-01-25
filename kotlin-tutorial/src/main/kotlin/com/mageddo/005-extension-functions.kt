package com.mageddo

import org.apache.commons.lang3.StringUtils

fun String.isBlank(): Boolean {
	return StringUtils.isBlank(this)
}
