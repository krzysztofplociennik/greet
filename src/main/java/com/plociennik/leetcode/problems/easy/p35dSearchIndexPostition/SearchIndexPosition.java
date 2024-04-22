package com.plociennik.leetcode.problems.easy.p35dSearchIndexPostition;

public class SearchIndexPosition {

    public static void main(String[] args) {

        System.out.println(searchInsert(new int[] {1,3,5,6}, 5));
        System.out.println(searchInsert(new int[] {1,3,5,6}, 2));
        System.out.println(searchInsert(new int[] {1,3,5,6}, 7));
        System.out.println(searchInsert(new int[] {1,3}, 2));
    }

    public static int searchInsert(int[] nums, int target) {

        int first = nums[0];
        int last = nums[nums.length - 1];

        if (first > target || first == target) {
            return 0;
        }
        if (last < target) {
            return nums.length;
        }

        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] < target && (nums[i] > target || nums[i] == target)) {
                return i;
            }
        }
        return -1;
    }
}
