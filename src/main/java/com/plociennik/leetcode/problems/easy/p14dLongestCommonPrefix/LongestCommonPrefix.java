package com.plociennik.leetcode.problems.easy.p14dLongestCommonPrefix;

import java.util.Arrays;

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

public class LongestCommonPrefix {

    public static void main(String[] args) {

    }

    public static String longestCommonPrefix(String[] strs) {

        String result ="";

        boolean canLoop = true;
        int index = 0;
        while (canLoop) {
            for (int i = 0; i < strs.length - 1; i++) {
                if (strs[0].length() < index + 1) {
                    canLoop = false;
                    break;
                }

            }
        }


        return result;
    }
}
