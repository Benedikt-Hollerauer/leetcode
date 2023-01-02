package easy

import scala.annotation.tailrec

// https://leetcode.com/problems/longest-common-prefix/

object _14_LongestCommonPrefix_Finished:

    def longestCommonPrefix(strs: Array[String]): String = {
        @tailrec
        def helper(it: List[String], commonPrefix: String): String =
            it.reduce((x, y) =>
                if(x.isEmpty | y.isEmpty) "-"
                else if(x.head == y.head) x.head.toString
                else "-"
            ) match {
                case "-" => commonPrefix
                case commonChar => helper(it.map(_.tail), commonPrefix + commonChar)
            }

        if(strs.contains("")) ""
        else if(strs.length <= 1) strs.head
        else helper(strs.toList, "")
    }