package medium

import scala.collection.AbstractIterator

/**
 * https://leetcode.com/problems/add-two-numbers/
 *
 * Time: O(n)
 *
 * Space: O(n)
 */

object _2_AddTwoNumbers_F extends App:

    class ListNode(_x: Int = 0, _next: ListNode = null) {
        var next: ListNode = _next
        var x: Int = _x
    }

    implicit class ExtendedListNode(val l: ListNode) {
        def toList: List[Int] = new Iterator[ListNode] {
            var current = l
            def hasNext: Boolean = current != null
            def next: ListNode = {
                val result = current
                current = current.next
                result
            }
        }.toList.map(_.x)
    }

    //extension (l: ListNode) {
    //    def toList: List[Int] = new Iterator[ListNode] {
    //        var current = l
    //        def hasNext: Boolean = current != null
    //        def next: ListNode = {
    //            val result = current
    //            current = current.next
    //            result
    //        }
    //    }.toList.map(_.x)
    //}

    def addTwoNumbers(l1: ListNode, l2: ListNode) = {
        List(l1.toList, l2.toList)
            .map(x =>
                BigInt(
                    x.reverse
                        .mkString
                )
            ).sum
            .toString
            .reverse
            .map(x => new ListNode(x.toString.toInt))
            .reduceRight((x, y) => new ListNode(x.x, y))
    }