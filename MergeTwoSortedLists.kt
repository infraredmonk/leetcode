class ListNode(var `val`: Int) {
    var next: ListNode? = null

    override fun toString(): String {
        val listOfValues: MutableList<Int> = mutableListOf()
        var curr: ListNode? = this
        while (curr != null) {
            listOfValues += curr.`val`
            curr = curr.next
        }
        return listOfValues.joinToString(",")
    }
}

class MergeTwoSortedLists {
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        var mergedHead: ListNode? = null
        var mergedTrav: ListNode? = null
        var t1: ListNode? = list1
        var t2: ListNode? = list2
        while (t1 != null && t2 != null) {
            if (t1.`val` <= t2.`val`) {
                if (mergedHead == null) {
                    mergedHead = t1
                    mergedTrav = t1
                    t1 = t1.next
                    mergedTrav.next = null
                } else {
                    mergedTrav!!.next = t1
                    t1 = t1.next
                    mergedTrav = mergedTrav.next
                    mergedTrav!!.next = null
                }
            } else {
                if (mergedHead == null) {
                    mergedHead = t2
                    mergedTrav = t2
                    t2 = t2.next
                    mergedTrav.next = null
                } else {
                    mergedTrav!!.next = t2
                    t2 = t2.next
                    mergedTrav = mergedTrav.next
                    mergedTrav!!.next = null
                }
            }
        }

        while (t1 != null) {
            if (mergedHead == null) {
                mergedHead = t1
                mergedTrav = t1
                t1 = t1.next
                mergedTrav.next = null
            } else {
                mergedTrav!!.next = t1
                t1 = t1.next
                mergedTrav = mergedTrav.next
                mergedTrav!!.next = null
            }
        }

        while (t2 != null) {
            if (mergedHead == null) {
                mergedHead = t2
                mergedTrav = t2
                t2 = t2.next
                mergedTrav.next = null
            } else {
                mergedTrav!!.next = t2
                t2 = t2.next
                mergedTrav = mergedTrav.next
                mergedTrav!!.next = null
            }
        }

        return mergedHead
    }
}

fun intArrayToListNodes(inputArray: Array<Int>): ListNode? {
    var head: ListNode? = null
    var curr: ListNode? = null
    for (i in inputArray) {
        if (head == null) {
            head = ListNode(i)
            curr = head
        } else {
            curr?.next = ListNode(i)
            curr = curr?.next
        }
    }
    return head
}

fun main(args: Array<String>) {
    val head1: ListNode? = intArrayToListNodes(arrayOf())
    val head2: ListNode? = intArrayToListNodes(arrayOf(0))
    println(MergeTwoSortedLists().mergeTwoLists(head1, head2))
}
