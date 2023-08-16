package org.kover.basic

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class Tests {

    @Test
    fun `test adding numbers`(){
        val sum = addingNumbers(1, 2)
        assertEquals(3, sum)
    }

    @Test
    fun `test string length`(){
        val s = "qwerty"
        assertEquals(-s.length, stringLength(s, false))
    }

}