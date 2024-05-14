class RomanToInteger {

    fun romanToInt(s: String): Int {
        var calculatedResult: Int = 0
        var previousChar: Char? = null
        for (index in s.length - 1 downTo 0) {
            when (s[index]) {
                'I' -> if (previousChar == 'V' || previousChar == 'X') calculatedResult -= 1 else calculatedResult += 1
                'V' -> calculatedResult += 5
                'X' -> if (previousChar == 'L' || previousChar == 'C') calculatedResult -= 10 else calculatedResult += 10
                'L' -> calculatedResult += 50
                'C' -> if (previousChar == 'D' || previousChar == 'M') calculatedResult -= 100 else calculatedResult += 100
                'D' -> calculatedResult += 500
                'M' -> calculatedResult += 1000
            }
            previousChar = s[index]
        }
        return calculatedResult
    }
}

fun main(args: Array<String>) {
    println(RomanToInteger().romanToInt("MCMXCIV"))
}
