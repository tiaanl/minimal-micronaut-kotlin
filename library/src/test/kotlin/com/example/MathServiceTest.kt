package com.example

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MathServiceTest {

    @Test
    fun testAddCorrectly() {
        assertEquals(25, MathService().add(10, 15))
    }

    @Test
    fun testCanAddFive() {
        assertEquals(15, MathService().addFive(10))
    }
}
