package me.arhan.extra

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class PluginTest {

    @Test
    fun pluginTest() {
        val value = "blah"
        val plugin = plugin { +value }
        assertEquals(value, plugin.text)
    }
}