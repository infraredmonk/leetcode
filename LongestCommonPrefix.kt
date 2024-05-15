import kotlin.math.min

class LongestCommonPrefix {
    fun longestCommonPrefix(strs: Array<String>): String {
        var lcp: String? = null
        for (curr in strs) {
            if (lcp == null) {
                lcp = curr
            } else {
                var length = min(lcp.length, curr.length)
                while (length != 0) {
                    if (lcp!!.substring(0, length) == curr.substring(0, length)) {
                        lcp = lcp.substring(0, length)
                        break
                    } else {
                        length -= 1
                    }
                }
                if (length == 0) {
                    return ""
                }
            }
        }
        return lcp!!
    }
}

fun main(args: Array<String>) {
    println(LongestCommonPrefix().longestCommonPrefix(arrayOf("dog","racecar","car")))
}