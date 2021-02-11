package com.example

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller("/hello")
class HelloController(private val mathService: MathService) {

    @Get("/")
    fun index(): Int {
        return mathService.addFive(10)
    }
}
