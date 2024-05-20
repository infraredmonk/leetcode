class ReverseInteger {
    fun reverse(x: Int): Int {
        if (x / 10 == 0) return x
        var multiplier = 1
        if (x < 0) multiplier = -1
        val evalNum = kotlin.math.abs(x).toString()
        var resultNum = ""
        for (i in evalNum.indices) {
            resultNum += evalNum[evalNum.length - 1 - i]
        }
        return try {
            resultNum.toInt() * multiplier
        } catch (e: NumberFormatException) {
            0
        }
    }
}

fun main(args: Array<String>) {
    println(Int.MAX_VALUE)
    println(Int.MIN_VALUE)
    println(ReverseInteger().reverse(1563847412))
}
