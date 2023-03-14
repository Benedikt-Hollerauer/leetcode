package medium

/**
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/
 *
 * Time: O()
 *
 * Space: O()
 */

object _3_LongestSubstringWithoutRepeatingCharacters_C extends App:

    def lengthOfLongestSubstring(s: String) = {
        s.zipWithIndex
            .foldLeft(Map.empty[Char, Int]) {
                case (x, y) if x.contains(y._1) && x(y._1) >= y._2 => x + y
                case (x, y) => x + (y._1 -> y._2)
            }
    }

    List(
        "dvdf",
        "abcabcbb",
        "bbbbb",
        "pwwkew"
    ).map(x =>
        lengthOfLongestSubstring(x)
    ).foreach(println)