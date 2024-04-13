package com.plociennik.leetcode.easy.p13dRomanToInteger;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
 *
 * Symbol       Value
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 *
 * For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.
 *
 * Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:
 *
 *     I can be placed before V (5) and X (10) to make 4 and 9.
 *     X can be placed before L (50) and C (100) to make 40 and 90.
 *     C can be placed before D (500) and M (1000) to make 400 and 900.
 *
 * Given a roman numeral, convert it to an integer.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "III"
 * Output: 3
 * Explanation: III = 3.
 *
 * Example 2:
 *
 * Input: s = "LVIII"
 * Output: 58
 * Explanation: L = 50, V= 5, III = 3.
 *
 * Example 3:
 *
 * Input: s = "MCMXCIV"
 * Output: 1994
 * Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
 *
 *
 *
 * Constraints:
 *
 *     1 <= s.length <= 15
 *     s contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M').
 *     It is guaranteed that s is a valid roman numeral in the range [1, 3999].
 *
 * The problem can be found at: https://leetcode.com/problems/roman-to-integer/description/
 */
public class RomanToInteger {

    public static void main(String[] args) {

        System.out.println(romanToInt("III"));
        System.out.println(romanToInt("LVIII"));
        System.out.println(romanToInt("MCMXCIV"));

    }

    public static int romanToInt(String s) {

        int result = 0;
        int index = 0;

        while (index < s.length() - 1) {
            char c = s.charAt(index);

            if (c == 'M') {
                result += 1000;
                index += 1;
                continue;
            }

            if (c == 'D') {
                result += 500;
                index += 1;
                continue;
            }

            if (c == 'C') {
                if (s.charAt(index + 1) == 'D') {
                    result += 400;
                    index += 2;
                    continue;
                }
                if (s.charAt(index + 1) == 'M') {
                    result += 900;
                    index += 2;
                    continue;
                }
                result += 100;
                index += 1;
                continue;
            }

            if (c == 'L') {
                result += 50;
                index += 1;
                continue;
            }

            if (c == 'X') {
                if (s.charAt(index + 1) == 'L') {
                    result += 40;
                    index += 2;
                    continue;
                }
                if (s.charAt(index + 1) == 'C') {
                    result += 90;
                    index += 2;
                    continue;
                }
                result += 10;
                index += 1;
                continue;
            }

            if (c == 'V') {
                result += 5;
                index += 1;
                continue;
            }

            if (c == 'I') {
                if (s.charAt(index + 1) == 'V') {
                    result += 4;
                    index += 2;
                    continue;
                }
                if (s.charAt(index + 1) == 'X') {
                    result += 9;
                    index += 1;
                    continue;
                }
                result += 1;
                index += 1;
            }
        }
        return result;
    }
}
