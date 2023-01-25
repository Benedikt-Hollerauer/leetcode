package easy

// https://leetcode.com/problems/two-sum/

object _1_TwoSum_U:

    def twoSum(nums: Array[Int], target: Int): Array[Int] = {
        nums.flatMap(x =>
            nums.drop(nums.indexOf(x))
                .flatMap(y =>
                    if(x + y == target) {
                        println(x.toString + "_" + y.toString)
                        Array(nums.indexOf(x), nums.indexOf(y))
                    } // here I think it does´t work, when multiple of the same element are present
                    else Array(999)
                ).filter(x => x != 999)
        )
    }