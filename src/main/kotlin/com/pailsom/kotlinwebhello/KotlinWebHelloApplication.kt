package com.pailsom.kotlinwebhello

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinWebHelloApplication

fun main(args: Array<String>) {
	runApplication<KotlinWebHelloApplication>(*args)
}
