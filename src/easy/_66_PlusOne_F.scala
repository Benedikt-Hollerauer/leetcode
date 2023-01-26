package easy

// https://leetcode.com/problems/plus-one/

import scala.math.BigInt

object _66_PlusOne_F:

    def plusOne(digits: Array[Int]): Array[Int] = {
        (BigInt(digits.mkString) + 1)
            .toString
            .map(_.toString.toInt)
            .toArray
    }