class ZigzagConversion {
    fun convert(s: String, numRows: Int): String {
        if (numRows == 1) {
            return s
        }
        val computeArray: Array<String> = Array(numRows) { "" }
        var result = ""
        var moveDown = true
        var i = 0
        for (str in s) {
            computeArray[i] = computeArray[i] + str
            if (moveDown) {
                i += 1
                if (i == numRows - 1) {
                    moveDown = false
                }
            } else {
                i -= 1
                if (i == 0) {
                    moveDown = true
                }

            }
        }
        for (strings in computeArray) {
            result += strings
        }
        return result
    }
}

fun main(args: Array<String>) {
    println(ZigzagConversion().convert("AB", 1))
}

