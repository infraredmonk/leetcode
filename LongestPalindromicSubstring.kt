class LongestPalindromicSubstring {
    private fun isPalindrome(s: String): Boolean {
        if (s.length < 2) return false
        var i = 0
        var j = s.length - 1
        while (i <= j) {
            if (s[i] == s[j]) {
                i += 1
                j -= 1
            } else {
                break
            }
        }
        return j - i < 0
    }

    fun longestPalindrome(s: String): String {
        var longestPalindrome = s[0].toString()
        var start = 0
        var end = s.length
        while (start < s.length - 1) {
            val tmp = s.substring(start, end)
            val isPalindrome = isPalindrome(tmp)
//            println("string evaluated : $tmp; is palindrome : $isPalindrome")
            if (isPalindrome) {
                if (longestPalindrome.length < tmp.length) {
                    longestPalindrome = tmp
                }
                start += 1
                end = s.length
            } else {
                end -= 1
            }
            if (end == start) {
                start += 1
                end = s.length
            }
        }
        return longestPalindrome
    }
}

fun main(args: Array<String>) {
    println(LongestPalindromicSubstring().longestPalindrome("ac"))
}