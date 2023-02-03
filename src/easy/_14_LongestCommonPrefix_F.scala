package easy

import scala.annotation.tailrec
import scala.util.Random

// https://leetcode.com/problems/longest-common-prefix/

object _14_LongestCommonPrefix_F:

    def longestCommonPrefix(strs: Array[String]) = {
        strs.toList
            .map(_.padTo(strs.maxBy(_.length).length, "%"))
            .transpose
            .map(_.reduce((x, y) =>
                if(x == y) x else '%'
            )).takeWhile(_ != '%')
            .mkString
    }