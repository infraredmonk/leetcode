import java.util.*

class Palindrome {

    fun isPalindrome(x: Int): Boolean {
        if (x < 0) return false
        var tmp = x
        val digitList = arrayListOf<Int>()
        while (tmp != 0) {
            digitList += (tmp % 10)
            tmp /= 10
        }
        if (digitList.size % 2 != 0) {
            val middleIndex = digitList.size / 2
            digitList.removeAt(middleIndex)
        }
        for (i in 0 until digitList.size) {
            var j = digitList.size - (i + 1)
            if (digitList[i] - digitList[j] != 0) {
                return false
            }
        }
        return true
    }
}

fun main(args: Array<String>) {
    println("is palindrome? ${Palindrome().isPalindrome(1231)}")
}