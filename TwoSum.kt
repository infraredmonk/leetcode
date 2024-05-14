/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to
 * target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * You can return the answer in any order.
 */
class TwoSum {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val result: IntArray = IntArray(2)
        for (i in nums.indices) {
            for (j in i + 1 until nums.size) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i
                    result[1] = j
                    break
                }
            }
        }
        return result
    }
}

fun main() {
    val result = TwoSum().twoSum(intArrayOf(3, 3), 6)
    println("[${result[0]},${result[1]}]")
}
