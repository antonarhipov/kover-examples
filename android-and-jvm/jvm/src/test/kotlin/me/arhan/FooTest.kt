package me.arhan

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class FooTest {

    @Test
    fun foo_test() {
        val s = "abcdefg"
        val result = foo(s,)
        assertEquals(s.length, result)
    }

}