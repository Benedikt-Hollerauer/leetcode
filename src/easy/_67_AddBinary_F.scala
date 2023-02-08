package easy

// https://leetcode.com/problems/add-binary/

object _67_AddBinary_F:

    def addBinary(a: String, b: String): String = {
        val it = List(a, b)
        it.map(_.reverse
            .padTo(it.maxBy(_.length).length, "0")
        ).transpose
            .map(_.map(_.toString.toInt).sum.toString)
            .appended("0")
            .reduce { (x, y) => (x, y) match {
                case (x, y) if x.takeRight(1) == "3" => x.dropRight(1) + "1" + (y.toInt + 1).toString
                case (x, y) if x.takeRight(1) == "2" => x.dropRight(1) + "0" + (y.toInt + 1).toString
                case (x, y) => x + y
            }}.reverse.toList match {
                case '0' :: t => t.mkString
                case s => s.mkString
            }
    }