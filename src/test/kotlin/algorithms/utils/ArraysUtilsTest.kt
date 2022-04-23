package algorithms.utils

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

internal class ArraysUtilsTest {
    private val arraysUtils = ArraysUtils()

    @Test
    fun rotateFromInvalidIndexTooBig() {
        val input = intArrayOf(1,2,3)

        assertThrows<java.lang.IllegalArgumentException> { arraysUtils.rotateFrom(input, 3) }
    }

    @Test
    fun rotateFromInvalidIndexTooSmall() {
        val input = intArrayOf(1,2,3)

        assertThrows<java.lang.IllegalArgumentException> { arraysUtils.rotateFrom(input, -1) }
    }

    @Test
    fun rotateFromIndexZero() {
        val input = intArrayOf(1,2,3,4,5,6,7,8,9)

        val result = arraysUtils.rotateFrom(input, 0)

        assertArrayEquals(input, result)
    }

    @Test
    fun rotateFromNormal() {
        val input = intArrayOf(1,2,3,4,5,6,7,8,9)
        val expected = intArrayOf(4,5,6,7,8,9,1,2,3)

        val result = arraysUtils.rotateFrom(input, 3)

        assertArrayEquals(expected, result)
    }
}