package easy

import scala.annotation.tailrec
import scala.util.Random

// https://leetcode.com/problems/longest-common-prefix/

object _14_LongestCommonPrefix_F extends App:

    def longestCommonPrefix(strs: Array[String]): String = {
        strs.toList
            .map(x => x.dropRight(x.length - strs.min.length).toList)
            .transpose
            .map(_.reduce((x, y) =>
                if(x == y) x
                else '-'
            )).takeWhile(_ != '-')
            .mkString
    }

    println(longestCommonPrefix(Array("ia", "ia", "iaiiii")))