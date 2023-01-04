package easy

import scala.annotation.tailrec

// https://leetcode.com/problems/valid-parentheses/

object _20_ValidParentheses_Current extends App:

    def isValid(s: String): Boolean = {
        @tailrec
        def helper(isValid: Boolean, it: List[Int], stack: List[Int]): Boolean =
            it match {
                case first :: second :: Nil if first + second == 0 && isValid => helper(isValid, List.empty)
                case first :: second :: tail if first + second == 0 => helper(false, it = tail)
                case _ => isValid
            }

        List(1, 3, -1, -3)

        helper(
            true,
            s.map(char =>
                char match {
                    case '(' => 1
                    case ')' => -1
                    case '{' => 2
                    case '}' => -2
                    case '[' => 3
                    case ']' => -3
                }
            ).toList
        )
    }

    println(isValid("([)]"))