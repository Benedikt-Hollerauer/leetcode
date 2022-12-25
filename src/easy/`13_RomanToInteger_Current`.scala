package easy

// https://leetcode.com/problems/roman-to-integer/

object `13_RomanToInteger_Current`:

    @main
    def romanToInt(s: String): Int =
        val seq = s.map(_ match
            case 'I' => 1
            case 'V' => 5
            case 'X' => 10
            case 'L' => 50
            case 'C' => 100
            case 'D' => 500
            case 'M' => 1000
        )

        def helper(acc: Int): Int =
            if(seq(acc) <= seq(acc + 1)) seq(acc) - seq(acc + 1)
            else seq(acc) + seq(acc + 1)

        helper(0)



    println(romanToInt("MCMXCIV"))  // 1994  V-I-C-X-M-C-M