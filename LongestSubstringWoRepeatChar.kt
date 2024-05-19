class LongestSubstringWoRepeatChar {
    fun lengthOfLongestSubstring(s: String): Int {
        val allSubstrings = Array(s.length) { "" }
        var ssi = 0
        var i = 0
        while (i < s.length) {
            if (allSubstrings[ssi] == "") {
                allSubstrings[ssi] = s[i].toString()
            } else if (allSubstrings[ssi].indexOf(s[i]) == -1) {
                allSubstrings[ssi] = allSubstrings[ssi] + s[i]
            } else {
                ssi++
                i = ssi - 1
            }
            i++
        }
        var longestSubstring = ""
        for (substring in allSubstrings) {
            if (substring.length > longestSubstring.length) {
                longestSubstring = substring
            }
        }
        return longestSubstring.length
    }
}

fun main(args: Array<String>) {
    println(LongestSubstringWoRepeatChar().lengthOfLongestSubstring("dvdf"))
}
