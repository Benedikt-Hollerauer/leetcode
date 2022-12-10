package easy

import scala.concurrent.Future

// https://leetcode.com/problems/two-sum/

object `1_TwoSum`:

    def twoSum(nums: Array[Int], target: Int): Array[Int] =
        nums.flatMap(x =>
            nums.tail.flatMap(y =>  // the tail just works for the first iteration, because only the first element is removed
                if(x + y == target) Array(nums.indexOf(x), nums.indexOf(y))
                else Array(789)
            ).filter(x => x != 789)
        )