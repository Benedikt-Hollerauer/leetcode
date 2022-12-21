package easy

// https://leetcode.com/problems/palindrome-number/

object `9_PalindromeNumber_Finished`:

    def isPalindrome(x: Int): Boolean =
        if(x.toString == x.toString.reverse) true
        else false