package com.miszelo.jacket

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class JacketApplication

fun main(args: Array<String>) {
	runApplication<JacketApplication>(*args)
}
