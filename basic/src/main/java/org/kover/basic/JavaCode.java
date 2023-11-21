package org.kover.basic;

import org.jetbrains.annotations.NotNull;

public class JavaCode {

    public static boolean stringLengthIsOdd(@NotNull String s) {
        return s.length() % 2 != 0;
    }

    public static int findFirstNumber(String s) {
        int index = -1;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isDigit(c)) {
                index = i;
                break;
            }
        }
        return index;
    }
}

