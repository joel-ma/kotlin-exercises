package algorithms.utils

class StringUtils {

    fun reverseWordsInSentence(str: String): String = str.removeSpecialChars()
            .reverseByWord()
            .lowercase()

    private fun String.reverseByWord(): String = this.split(" ").reversed().joinToString(" ")

    private fun String.removeSpecialChars(): String {
        val specialCharsRegex = Regex(",|\\.")
        return this.replace(specialCharsRegex, "")
    }
}





private fun rotateFrom(array: IntArray, startIndex: Int): IntArray {
    return array.mapIndexed { index, elem ->
        array[(index + startIndex) % array.size]
    }.toIntArray()
}

fun main() {
    val intArray = intArrayOf(1,2,3,4,5,6,7,8,9)
    val expected = intArrayOf(4,5,6,7,8,9,1,2,3)
    println(rotateFrom(intArray, 3).asList())
    println(rotateFrom(intArray, 3).equals(expected))
}
