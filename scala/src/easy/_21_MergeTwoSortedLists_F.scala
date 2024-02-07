package easy

/**
 * https://leetcode.com/problems/merge-two-sorted-lists/
 *
 * Time: O()
 *
 * Space: O()
 */

object _21_MergeTwoSortedLists_F:

    class ListNode(_x: Int = 0, _next: ListNode = null) {
        var next: ListNode = _next
        var x: Int = _x
    }

    def mergeTwoLists(list1: ListNode, list2: ListNode): ListNode = {
        def helper(list1: ListNode, list2: ListNode, acc: List[Int]): ListNode =
            if(list1 != null) helper(list1.next, list2, list1.x :: acc)
            else if(list2 != null) helper(list1, list2.next, list2.x :: acc)
            else {
                acc.sorted
                    .map(new ListNode(_))
                    .reduceRightOption((x, y) => new ListNode(x.x, y))
                    .getOrElse(list1)
            }

        helper(list1, list2, Nil)
    }