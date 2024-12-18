class RegularExpressionMatching {
    fun isMatch(s: String, p: String): Boolean {
        if (p.contains("*") || p.contains(".")) {
            var i = 0
            var j = 0
            while (j < p.length) {
                if (p[j].isLetter()) {
                    i++
                    if (s[i] != p[j]) break
                } else if (p[j] == '.') {
                    if (!s[i].isLetter()) break
                } else if (p[j] == '*') {
                    while((s[i].equals(p[j-1]) || p[j-1] == '.') && i < s.length - 1) {
                        i++
                    }
                }
                j++
            }
            return i == s.length - 1
        } else {
            return p.equals(s)
        }
    }
}

fun main(args: Array<String>) {
    println(RegularExpressionMatching().isMatch("aab", "c*a*b"))
}
