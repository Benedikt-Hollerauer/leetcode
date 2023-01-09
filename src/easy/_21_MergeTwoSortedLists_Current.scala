package easy

// https://leetcode.com/problems/merge-two-sorted-lists/

object _21_MergeTwoSortedLists_Current extends App:

    class ListNode(_x: Int = 0, _next: ListNode = null) {
        var next: ListNode = _next
        var x: Int = _x
    }

    def mergeTwoLists(list1: ListNode, list2: ListNode): ListNode = {
        def helper(list1: ListNode, list2: ListNode, intermediate: List[Int]): ListNode =
            if(list1.next != null) helper(list1.next, list2, list1.x :: intermediate)
            else if(list2.next != null) helper(list1, list2.next, list2.x :: intermediate)
            else {
                (list1.x +: intermediate :+ list2.x)
                    .sorted
                    .map(x => new ListNode(x))
                    .reduce((x, y) => new ListNode(x.x, y))
            }

        helper(list1, list2, List.empty[Int])
    }

    println(
        mergeTwoLists(
            new ListNode(1, new ListNode(2, new ListNode(4))),
            new ListNode(1, new ListNode(3, new ListNode(4)))
        )
    )