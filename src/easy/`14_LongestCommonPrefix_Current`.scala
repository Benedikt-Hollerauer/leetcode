package easy

// https://leetcode.com/problems/longest-common-prefix/

object `14_LongestCommonPrefix_Current`:

  def longestCommonPrefix(strs: Array[String]): String = {
      strs.toList
          .map(x => x.toList)

      // stash the elements of the index in the same sub list like that:
      // List(List(a, b, c, d), List(a, c, d, e), List(u, b, d, e)) => List(List(a, a, u) <- the first elements of the other arrays, List(b, c, b) <-  the second elements of the other arrays, ...)
  }