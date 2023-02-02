package easy

import scala.annotation.tailrec
import scala.util.Random

// https://leetcode.com/problems/longest-common-prefix/

object _14_LongestCommonPrefix_F extends App:

    def longestCommonPrefix(strs: Array[String]): String = {
        strs.toList
            .reduce((x, y) =>
                x.compareTo(y) match {
                    case i if i > 0 => x.take(i)
                    case _ => x
                }
            )
    }

    println(longestCommonPrefix(Array("i", "")))