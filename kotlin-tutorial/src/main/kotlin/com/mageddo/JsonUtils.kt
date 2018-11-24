package com.mageddo

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.SerializationFeature

val mapper: ObjectMapper = ObjectMapper()
	.enable(SerializationFeature.INDENT_OUTPUT)
