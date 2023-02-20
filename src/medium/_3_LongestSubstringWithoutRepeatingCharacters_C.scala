package medium

/**
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/
 *
 * Time: O()
 *
 * Space: O()
 */

object _3_LongestSubstringWithoutRepeatingCharacters_C extends App:

    def lengthOfLongestSubstring(s: String): Int = {
        s.toList
            .map(_.toString)
            .reduce((cSS, n) =>
                if(cSS.contains(n)) cSS
                else cSS + n
            ).length
    }

    println(
        lengthOfLongestSubstring("pwwkew")
    )