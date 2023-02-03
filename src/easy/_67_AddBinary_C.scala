package easy

// https://leetcode.com/problems/add-binary/

object _67_AddBinary_C extends App:

    def addBinary(a: String, b: String) = {
        val it = List(a, b)
            it.map(
                _.reverse
                    .padTo(it.max.length, "0")
                    .reverse
            ).transpose
                .reverse
                .map(_.map(_.toString.toInt).sum)
                .foreach(println)
    }

    addBinary(
        "1010",
        "1011"
    )

    // should be: 10101