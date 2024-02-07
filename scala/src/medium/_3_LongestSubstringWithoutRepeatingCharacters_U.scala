package medium

/**
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/
 *
 * Time: O()
 *
 * Space: O()
 */

object _3_LongestSubstringWithoutRepeatingCharacters_U extends App:

    def lengthOfLongestSubstring(s: String) = {
        s.zipWithIndex
            .foldLeft(Map.empty[Char, Int] -> 0) {
                case (x, y)
                    if x._1.contains(y._1) && x._1(y._1) >= y._2
                        => x._1 + y -> (x._2 + 1)
                case (x, y) => x._1 + y -> x._2
            }
    }

    List(
        "dvdf",
        "abcabcbb",
        "bbbbb",
        "pwwkew"
    ).map(lengthOfLongestSubstring)
        .foreach(println)