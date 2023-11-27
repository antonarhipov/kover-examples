package me.java;

public class JavaClass {

    public int stringLengthPositiveOrNegative(String s, Boolean positive){
        if (positive) {
            return s.length();
        }
        return -s.length();
    }

//    @Deprecated(forRemoval = true)
    public int blah(String s, Boolean positive){
        return positive ? s.length() : -s.length();
    }
}
