package com.ntrs

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinTaApplication

fun main(args: Array<String>) {
    runApplication<SpringRestSeedApplication>(*args)
}
