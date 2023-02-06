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
            .map(_.map(_.toString.toInt).sum.toString)
            .appended("0")
            .reduce {
                case (x ,y) if x.takeRight(1) == "2" => x.dropRight(1) + "0" + (y.toInt + 1).toString
                case (x, y) => x + y
            }.reverse
    }

    addBinary(
        "11",
        "1"
    )

    // should be: 10101