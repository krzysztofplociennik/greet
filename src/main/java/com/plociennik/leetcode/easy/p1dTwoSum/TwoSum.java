/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.



Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Output: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]


Constraints:

2 <= nums.length <= 105
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.
*/
package com.plociennik.leetcode.easy.p1dTwoSum;

import java.util.Arrays;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {

        int farthestIndex = Arrays.binarySearch(nums, target);
        int[] resultArray = new int[2];

        for (int i = 0; i < farthestIndex; i++) {
            int secondIndex = findRemaining(nums, target - nums[i], farthestIndex);
            if (secondIndex != -1 && secondIndex != i) {
                resultArray[0] = i;
                resultArray[1] = secondIndex;
                break;
            } else {
                resultArray[0] = -1;
                resultArray[1] = -1;
            }
        }

        return resultArray;
    }

    public int findRemaining(int[] array, int remain, int index) {
        int result = -1;
        for (int i = 0; i < index; i++) {
            if (array[i] == remain) {
                result = i;
            }
        }
        return result;
    }

    public static void main(String[] args) {

        TwoSum twoSum = new TwoSum();

        int[] a = {3, 3};

        Arrays.stream(twoSum.twoSum(a, 6)).forEach(System.out::println);

    }

}
