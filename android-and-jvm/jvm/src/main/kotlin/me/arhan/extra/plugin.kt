package me.arhan.extra

class Plugin {
    val text: String
        get() = _text

    lateinit var _text: String

    operator fun String.unaryPlus() { _text = this }
}

fun plugin(p: Plugin.() -> Unit) =
    Plugin().apply(p)
