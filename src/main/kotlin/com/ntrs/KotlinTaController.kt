package com.ntrs

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class KotlinTaController {

    @GetMapping("/hello/{name}")
    fun person(@PathVariable name: String) = "Hello $name!"

    @GetMapping("/")
    fun root() = "Hello, world! Add /hello/there to the URL to get a friendly reply."

}
