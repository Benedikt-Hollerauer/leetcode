package easy

import scala.annotation.tailrec

// https://leetcode.com/problems/roman-to-integer/

object `13_RomanToInteger_Finished`:

    def romanToInt(s: String): Int =
        @tailrec
        def helper(it: List[Int], acc: Int = 0): Int =
            it match {
                case first :: Nil => acc + first
                case first :: second :: tail if first >= second => helper(second :: tail, acc + first)
                case first :: second :: tail if first < second => helper(tail, acc + second - first)
                case _ => acc
            }

        helper(
            s.map(_ match {
                case 'I' => 1
                case 'V' => 5
                case 'X' => 10
                case 'L' => 50
                case 'C' => 100
                case 'D' => 500
                case 'M' => 1000
            }).toList
        )