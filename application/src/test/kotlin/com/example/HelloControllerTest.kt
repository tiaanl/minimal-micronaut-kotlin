package com.example

import io.micronaut.test.extensions.junit5.annotation.MicronautTest
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNotNull
import org.junit.jupiter.api.Test
import javax.inject.Inject

@MicronautTest
class HelloControllerTest {

    @Inject
    private lateinit var helloClient: HelloClient

    @Test
    fun returnsValidResult() {
        assertNotNull(helloClient)

        val result = helloClient.index()
        assertEquals(15, result)
    }
}
