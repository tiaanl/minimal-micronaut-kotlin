package com.example

import io.micronaut.context.annotation.Factory
import io.micronaut.runtime.Micronaut.build
import javax.inject.Singleton

@Factory
class Application {

    @Singleton
    fun mathService(): MathService {
        println("MathService")
        return MathService()
    }
}

fun main(args: Array<String>) {
    build(*args)
        .packages("com.example.*")
        .start()
}
