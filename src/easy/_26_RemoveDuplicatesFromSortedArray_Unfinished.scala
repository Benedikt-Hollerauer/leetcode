package easy

// https://leetcode.com/problems/remove-duplicates-from-sorted-array/

object _26_RemoveDuplicatesFromSortedArray_Unfinished:

    def removeDuplicates(nums: Array[Int]): Int = {
        def helper(nums: Array[Int]): Array[Int] =
            nums match
                case Array(f, s, t*) if f == s => helper(t.prepended(f).appended(s).toArray)
                case Array(f, s) if f > s => nums
                case Array(f, t*) => helper(t.toArray).prepended(f)

        helper(nums).foreach(println)
        1
    }