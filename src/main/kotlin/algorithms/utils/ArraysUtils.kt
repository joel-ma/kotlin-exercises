package algorithms.utils

class ArraysUtils {
    fun rotateFrom(array: IntArray, startIndex: Int): IntArray {
        require(startIndex >= 0 && startIndex < array.size)

        return array.mapIndexed { index, _ ->
            array[(index + startIndex) % array.size]
        }.toIntArray()
    }
}