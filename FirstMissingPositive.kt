/**
 * Given an unsorted integer array nums. Return the smallest positive integer that is not present in nums.
 *
 * You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space.
 */
class FirstMissingPositive {
    fun firstMissingPositive(nums: IntArray): Int {
        for (i in nums.indices) {
            if (nums[i] < 0) {
                nums[i] = 0
            }
        }

        for (i in nums.indices) {
            val num = kotlin.math.abs(nums[i]) - 1
            if (num < nums.size && num >= 0) {
                if (nums[num] == 0) {
                    nums[num] = nums.size + 1
                }
                if (nums[num] > 0) {
                    nums[num] = nums[num] * -1
                }
            }
        }

        var firstMissingPositive = 1
        for (i in 1..nums.size) {
            if (nums[i - 1] < 0) {
                firstMissingPositive = i + 1
            } else {
                break
            }
        }

        println(nums.contentToString())
        return firstMissingPositive
    }
}

fun main(args: Array<String>) {
    println(FirstMissingPositive().firstMissingPositive(intArrayOf(1, 1)))
}