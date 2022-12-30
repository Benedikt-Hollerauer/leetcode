package easy

// https://leetcode.com/problems/longest-common-prefix/

object `14_LongestCommonPrefix_Current`:

    def main(args: Array[String]): Unit = {

        longestCommonPrefix(Array("flower", "flight", "flow"))
    }

    def longestCommonPrefix(strs: Array[String]) = {
        strs.toList
            .map(x => x.toList) // List[List[String]]

        def helper(it: List[List[Char]], moin: Option[Char]) =
            it.reduce((x, y) =>
                if(x.head == y.head) helper(it.filter(!x.head), Some(x))
            )

        // stash the elements of the index in the same sub list like that:
        // List(List(a, b, c, d), List(a, c, d, e), List(u, b, d, e)) => List(List(a, a, u) <- the first elements of the other arrays, List(b, c, b) <-  the second elements of the other arrays, ...)
    }
