package com.plociennik.leetcode.problems.easy.p26dRemoveDuplicates;


public class RemoveDuplicates2 {

    public static void main(String[] args) {

        System.out.println(removeDuplicates(new int[] {1,1,2}));
        System.out.println(removeDuplicates(new int[] {0,0,1,1,1,2,2,3,3,4}));
        System.out.println(removeDuplicates(new int[] {-3,-1,0,0,0,3,3}));

    }

    public static int removeDuplicates(int[] nums) {

        int temp = -99999999;

        int[] result = new int[nums.length];
        int resIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != temp) {
                temp = nums[i];
                result[resIndex] = nums[i];
                resIndex++;
            }
        }

        for (int i = 0; i < result.length; i++) {
            nums[i] = result[i];
        }

        return resIndex;
    }
}
