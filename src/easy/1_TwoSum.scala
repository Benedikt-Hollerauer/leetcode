package easy

// https://leetcode.com/problems/two-sum/

object `1_TwoSum`:

    def twoSum(nums: Array[Int], target: Int): Array[Int] =
        def helper(acc: Int): Array[Int] =
            nums.flatMap(x =>
                if(x + nums(acc) == target) Array(acc, nums.indexOf(x))
                else helper(acc + 1)
            )

        helper(0)