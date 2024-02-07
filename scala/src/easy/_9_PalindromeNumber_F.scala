package easy

/**
 * https://leetcode.com/problems/palindrome-number/
 *
 * Time: O(n)
 *
 * Space: O(n)
 */

object _9_PalindromeNumber_F:

    def isPalindrome(x: Int): Boolean = {
        if(x.toString == x.toString.reverse) true
        else false
    }