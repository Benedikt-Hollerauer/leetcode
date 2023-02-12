package easy

/**
 * https://leetcode.com/problems/valid-parentheses/
 *
 * Time: O(n)
 *
 * Space: O(n)
 */

object _20_ValidParentheses_F:

    def isValid(s: String): Boolean = {
        def helper(it: List[Char], stack: List[Char]): Boolean =
            it match {
                case Nil if stack.isEmpty => true
                case ')' :: t if stack.headOption == Some('(') => helper(t, stack.tail)
                case '}' :: t if stack.headOption == Some('{') => helper(t, stack.tail)
                case ']' :: t if stack.headOption == Some('[') => helper(t, stack.tail)
                case h :: t => helper(t , h :: stack)
                case Nil => false
            }

        helper(
            s.toList,
            List.empty[Char]
        )
    }