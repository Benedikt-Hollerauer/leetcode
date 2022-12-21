package easy

// https://leetcode.com/problems/roman-to-integer/

object `13_RomanToInteger_Current`:

    @main
    def romanToInt(s: String): Int =
        s.map(numberChar =>
            numberChar match
                case 'I' => 1
                case 'V' => 5
                case 'X' => 10
                case 'L' => 50
                case 'C' => 100
                case 'D' => 500
                case 'M' => 1000
        )

    println(romanToInt("MCMXCIV"))  // 1994

