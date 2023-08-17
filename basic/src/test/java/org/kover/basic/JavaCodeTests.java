package org.kover.basic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class JavaCodeTests {

    @Test
    public void testStringLengthOddity(){
        String a = "qwerty";
        assertFalse(JavaCode.stringLengthIsOdd(a));

        String b = "qwertyu";
        assertTrue(JavaCode.stringLengthIsOdd(b));
    }

    @Test
    public void testNumberIndex(){
        // the string does not contain any number os purpose
        // to demonstrate the missing coverage in a branch
        String a = "qwerty";
        assertEquals(-1, JavaCode.findFirstNumber(a));
    }

}
