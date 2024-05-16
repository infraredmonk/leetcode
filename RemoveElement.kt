class RemoveElement {
    fun removeElement(nums: IntArray, `val`: Int): Int {
        if (nums.isEmpty()) {
            return 0
        }
        var i = 0
        var count: Int = nums.size
        while (i < count) {
            if (nums[i] == `val`) {
                if (nums.size == 1) {
                    return 0
                }
                var j: Int = i
                while (j + 1 < count) {
                    nums[j] = nums[j + 1]
                    j += 1
                }
                count -= 1
            } else {
                i += 1
            }
        }
        println(nums.contentToString())
        return i
    }
}

fun main(args: Array<String>) {
    println(RemoveElement().removeElement(intArrayOf(3, 2, 2, 3), 3))
}