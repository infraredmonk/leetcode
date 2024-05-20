class StringToInteger {
    fun myAtoi(s: String): Int {
        var result = ""
        for (c in s) {
            when {
                c.isDigit() -> result += c.toString()
                c.equals(' ') -> if (result.isEmpty()) continue else break
                c.isLetter() || c.equals('.') -> break
                c.equals('+') || c.equals('-') -> if (result.isEmpty()) result += c.toString() else break
            }
        }
        return try {
            if (result.isEmpty() || result.equals("+") || result.equals("-")) 0 else result.toInt()
        } catch (e: NumberFormatException) {
            if (result.startsWith('-')) {
                return Int.MIN_VALUE
            } else {
                return Int.MAX_VALUE
            }
        }
    }
}

fun main(args: Array<String>) {
    println(StringToInteger().myAtoi("   +0 123"))
}