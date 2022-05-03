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
