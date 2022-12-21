package easy

// https://leetcode.com/problems/roman-to-integer/

object `13_RomanToInteger_Current`:

    def romanToInt(s: String): Int =
        s.map(numberChar =>
            numberChar match
                case "I" =>
                case "V" =>
                case "X" =>
                case "L" =>
                case "C" =>
                case "D" =>
                case "M" =>
        )