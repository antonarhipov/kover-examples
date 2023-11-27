package me.arhan

fun foo(s: String, positive: Boolean = true): Int =
    if (positive) s.length else -s.length

fun main() {
    println(foo("qwerty", ))
    println(foo("qwerty", false))
}