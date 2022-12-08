package easy

// https://leetcode.com/problems/two-sum/

object `1_TwoSum`:

    def twoSum(nums: Array[Int], target: Int): Array[Int] =
        def helper(acc: Int): Array[Int] =
            if(nums(acc + 1) + nums(acc) == target) Array(acc, nums.indexOf(acc + 1))
            else helper(acc + 1)

        helper(0)