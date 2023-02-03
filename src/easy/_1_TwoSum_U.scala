package easy

// https://leetcode.com/problems/two-sum/

object _1_TwoSum_U extends App:

    def twoSum(nums: Array[Int], target: Int): Array[Int] = {
        nums.zipWithIndex
            .combinations(2)
            .map {
                case Array(x, y) => (x._2, y._2, x._1 + y._1)
            }.filter(x => x._3 == target)
            .flatMap  {
                case (x, y, z) => Array(x, y)
            }.toArray
    }

    twoSum(Array(2, 7, 11, 15), 9).foreach(println)