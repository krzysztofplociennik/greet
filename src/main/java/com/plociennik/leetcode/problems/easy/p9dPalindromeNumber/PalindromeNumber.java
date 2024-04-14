package com.plociennik.leetcode.problems.easy.p9dPalindromeNumber;

/**
 *
 * Given an integer x, return true if x is a
 * palindrome
 * , and false otherwise.
 *
 *
 *
 * Example 1:
 *
 * Input: x = 121
 * Output: true
 * Explanation: 121 reads as 121 from left to right and from right to left.
 *
 * Example 2:
 *
 * Input: x = -121
 * Output: false
 * Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
 *
 * Example 3:
 *
 * Input: x = 10
 * Output: false
 * Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 *
 *
 *
 * Constraints:
 *
 *     -231 <= x <= 231 - 1
 *
 * ===================================================================================================================
 * The problem can be found at:
 * https://leetcode.com/problems/palindrome-number/description/
 * ===================================================================================================================
 *
 */

public class PalindromeNumber {

    public static void main(String[] args) {

        System.out.println(isPalindrome(110011));
        System.out.println(isPalindrome(110021));
        System.out.println(isPalindrome(111111));
        System.out.println(isPalindrome(10011));
        System.out.println(isPalindrome(112232211));
        System.out.println(isPalindrome(1122322211));

    }

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        String s = String.valueOf(x);
        int j = s.length() - 1;
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            j--;
        }
        return true;
    }
}
