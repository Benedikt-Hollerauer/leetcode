package easy

// https://leetcode.com/problems/length-of-last-word/

object _58_LengthOfLastWord_Finished:

    def lengthOfLastWord(s: String): Int = {
        s.trim
            .reverse
            .takeWhile(!_.isWhitespace)
            .length
    }