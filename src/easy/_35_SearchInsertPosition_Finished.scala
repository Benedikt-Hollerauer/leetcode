package easy

// https://leetcode.com/problems/search-insert-position/

object _35_SearchInsertPosition_Finished:

    def searchInsert(nums: Array[Int], target: Int): Int = {
        nums.filter(_ < target).length
    }