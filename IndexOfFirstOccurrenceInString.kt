class IndexOfFirstOccurrenceInString {
    fun strStr(haystack: String, needle: String): Int {
        val locSize = needle.length
        val strSize = haystack.length
        var i = 0
        while (i < (strSize - locSize + 1)) {
            if (haystack.substring(i, i + locSize).equals(needle)) {
                return i
            }
            i += 1
        }
        return -1
    }
}

fun main(args: Array<String>) {
    println(IndexOfFirstOccurrenceInString().strStr("bac", "a"))
}