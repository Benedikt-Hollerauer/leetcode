package easy

import scala.math.BigDecimal.double2bigDecimal

/**
 *  https://leetcode.com/problems/sqrtx/
 *
 *  Time: O(1)
 *
 *  Space: O(1)
 */

object _69_Sqrt_F:

    import scala.math.sqrt
    def mySqrt(x: Int): Int = {
        sqrt(x).toInt
    }