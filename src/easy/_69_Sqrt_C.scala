package easy

/**
 *  https://leetcode.com/problems/sqrtx/
 *
 *  Time: O()
 *
 *  Space: O()
 */

object _69_Sqrt_C extends App:

    def mySqrt(x: Int): Int = {
        (0 to x).collectFirst {
            case y if y * y >= x => y
        }.get
    }

    println(mySqrt(8))