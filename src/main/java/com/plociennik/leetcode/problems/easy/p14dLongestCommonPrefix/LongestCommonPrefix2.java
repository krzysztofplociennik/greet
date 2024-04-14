package com.plociennik.leetcode.problems.easy.p14dLongestCommonPrefix;

/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 *
 * If there is no common prefix, return an empty string "".
 *
 *
 *
 * Example 1:
 *
 * Input: strs = ["flower","flow","flight"]
 * Output: "fl"
 *
 * Example 2:
 *
 * Input: strs = ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 *
 *
 *
 * Constraints:
 *
 *     1 <= strs.length <= 200
 *     0 <= strs[i].length <= 200
 *     strs[i] consists of only lowercase English letters.
 */

public class LongestCommonPrefix2 {

    public static void main(String[] args) {

        System.out.println(longestCommonPrefix(new String[] {"flower","flow","flight"}));
        System.out.println(longestCommonPrefix(new String[] {"dog","racecar","car"}));
        System.out.println(longestCommonPrefix(new String[] {"flower","flower","flower","flower"}));
        System.out.println(longestCommonPrefix(new String[] {"ab", "a"}));

    }

    public static String longestCommonPrefix(String[] strs) {

        StringBuilder result = new StringBuilder();

        if (strs.length == 0) {
            return result.toString();
        }
        if (strs.length == 1) {
            return strs[0];
        }

        String str = strs[0];

        int index = 0;
        while (index < str.length()) {
            char c = str.charAt(index);

            for (int i = 1; i < strs.length; i++) {
                String currentString = strs[i];
                if (currentString.length() == result.length() || currentString.charAt(index) != c) {
                    return result.toString();

                }
            }
            result.append(c);
            index++;
        }


        return result.toString();
    }
}
