package easy

// https://leetcode.com/problems/palindrome-number/

object _9_PalindromeNumber_F:

    def isPalindrome(x: Int): Boolean = {
        if(x.toString == x.toString.reverse) true
        else false
    }