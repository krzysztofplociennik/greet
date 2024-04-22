package com.plociennik.leetcode.problems.easy.p27dRemoveElement;

public class RemoveElement2 {
    public static void main(String[] args) {

        System.out.println(removeElement(new int[] {3,2,2,3} , 3));
        System.out.println(removeElement(new int[] {0,1,2,2,3,0,4,2} , 2));

    }

    public static int removeElement(int[] nums, int val) {

        int[] resultNums = new int[nums.length];

        int resultIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                resultNums[resultIndex] = nums[i];
                resultIndex++;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = resultNums[i];
        }

        return resultIndex;
    }
}
