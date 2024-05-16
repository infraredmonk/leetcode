class RemoveDupesSortedArray {
    fun removeDuplicates(nums: IntArray): Int {
        if (nums.isEmpty()) return 0
        if (nums.size == 1) return 1
        var i: Int = 0
        var j: Int = 1
        while (i < nums.size && j < nums.size) {
            if (nums[i] == nums[j]) {
                j += 1
            } else {
                i += 1
                nums[i] = nums[j]
            }
        }
        println(nums.contentToString())
        return i + 1
    }
}

fun main(args: Array<String>) {
    println(RemoveDupesSortedArray().removeDuplicates(intArrayOf(1, 1, 2)))
}