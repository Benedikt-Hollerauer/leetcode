package easy

// https://leetcode.com/problems/remove-duplicates-from-sorted-array/

object _26_RemoveDuplicatesFromSortedArray_Current:

    def removeDuplicates(nums: Array[Int]): Int = {
        def helper(nums: List[Int], acc: Int): List[Int] =
            nums match {
                case f :: s :: t if f == s => helper(f +: t :+ s, acc + 1)
                case f :: s :: t if f > s => List(acc)
                case f :: t => f +: helper(t, acc + 1)
                case _ => List(0)
            }

        helper(nums.toList, 0).head
    }