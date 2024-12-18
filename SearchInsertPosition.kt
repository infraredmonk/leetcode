class SearchInsertPosition {
    fun searchInsert(nums: IntArray, target: Int): Int {
        if (nums.isEmpty() || target <= nums[0]) {
            return 0
        }
        if (target > nums[nums.size - 1]) {
            return nums.size
        }
        var mid = nums.size / 2
        while (true) {
            if (nums[mid] >= target) {
                if (nums[mid - 1] < target) return mid
                else mid /= 2
            } else {
                mid = (mid + nums.size) / 2
            }
        }
    }
}

fun main(args: Array<String>) {
    println(SearchInsertPosition().searchInsert(intArrayOf(1), 1))
}
