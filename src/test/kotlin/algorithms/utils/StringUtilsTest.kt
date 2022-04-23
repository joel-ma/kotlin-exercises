package algorithms.utils

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test


internal class StringUtilsTest {

    val stringUtils = StringUtils()

    @Test
    fun reverseWordsInSentence() {
        val input = "Hello, it's a me. Mario"
        val expected = "mario me a it's hello"

        val result = stringUtils.reverseWordsInSentence(input)

        assertEquals(expected, result)
    }
}