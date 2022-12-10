package easy

import scala.concurrent.Future

// https://leetcode.com/problems/two-sum/

object `1_TwoSum`:

    def twoSum(nums: Array[Int], target: Int): Array[Int] =
        nums.flatMap(x =>
            nums.drop(nums.indexOf(x))
                .flatMap(y =>
                    if(x + y == target) {println(x.toString + "_" + y.toString); Array(nums.indexOf(x), nums.indexOf(y))} // here I think it does´t work, when multiple of the same element are present
                    else Array(789)
                ).filter(x => x != 789)
        )