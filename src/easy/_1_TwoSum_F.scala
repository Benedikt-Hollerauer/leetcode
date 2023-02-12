package easy

/**
 * https://leetcode.com/problems/two-sum/
 *
 * Time: O(n)
 *
 * Space: O(n)
 */

object _1_TwoSum_F:

    def twoSum(nums: Array[Int], target: Int): Array[Int] = {
        def helper(nums: Array[(Int, Int)], map: Map[Int, Int]): Array[Int] = nums.head match {
            case (n, i) if map.isEmpty => helper(nums.tail, Map(target - n -> i))
            case (n, i) if map.get(n).isDefined => Array(map(n), i)
            case (n, i) => helper(nums.tail, map + (target - n -> i))
        }

        helper(nums.zipWithIndex, Map.empty)
    }