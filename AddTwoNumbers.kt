class AddTwoNumbers {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        var p1 = l1
        var p2 = l2
        var carry = 0
        var resultHead: ListNode? = null
        var resultTrav: ListNode? = null

        while (p1 != null && p2 != null) {
            val sum = p1.`val` + p2.`val` + carry
            carry = sum / 10
            val node = ListNode(sum % 10)
            if (resultHead == null) resultHead = node
            if (resultTrav == null) {
                resultTrav = resultHead
            } else {
                resultTrav.next = node
                resultTrav = resultTrav.next
            }
            p1 = p1.next
            p2 = p2.next
        }

        while (p1 != null) {
            val sum = p1.`val` + carry
            carry = sum / 10
            val node = ListNode(sum % 10)
            if (resultHead == null) resultHead = node
            if (resultTrav == null) {
                resultTrav = resultHead
            } else {
                resultTrav.next = node
                resultTrav = resultTrav.next
            }
            p1 = p1.next
        }

        while (p2 != null) {
            val sum = p2.`val` + carry
            carry = sum / 10
            val node = ListNode(sum % 10)
            if (resultHead == null) resultHead = node
            if (resultTrav == null) {
                resultTrav = resultHead
            } else {
                resultTrav.next = node
                resultTrav = resultTrav.next
            }
            p2 = p2.next
        }

        if (carry > 0) {
            val node = ListNode(carry)
            resultTrav!!.next = node
        }

        return resultHead
    }
}

fun main(args: Array<String>) {
    val head1: ListNode? = intArrayToListNodes(arrayOf(9, 9, 9, 9, 9, 9, 9))
    val head2: ListNode? = intArrayToListNodes(arrayOf(9, 9, 9, 9))
    println(AddTwoNumbers().addTwoNumbers(head1, head2))
}