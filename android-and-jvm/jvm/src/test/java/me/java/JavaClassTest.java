package me.java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class JavaClassTest {

    @Test
    public void testStringLength() {
        JavaClass jc = new JavaClass();
        String s = "qwerty";
        int positiveResult = jc.stringLengthPositiveOrNegative(s, true);
        int negativeResult = jc.stringLengthPositiveOrNegative(s, false);

        assertEquals(s.length(), positiveResult);
        assertEquals(-s.length(), negativeResult);
    }

   @Test
    public void testStringLengthWithTernary() {
        JavaClass jc = new JavaClass();
        String s = "qwerty";
        int positiveResult = jc.blah(s, true);

        assertEquals(s.length(), positiveResult);
    }

}