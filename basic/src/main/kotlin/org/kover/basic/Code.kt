package org.kover.basic

fun addingNumbers(a: Int, b: Int) = a + b

fun addingStrings(a: String, b: String) = a + b

fun stringLength(s: String, positive: Boolean = true) = if (positive) {
    s.length
} else {
    -s.length
}
