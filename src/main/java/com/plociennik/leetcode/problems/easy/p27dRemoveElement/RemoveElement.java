package com.plociennik.leetcode.problems.easy.p27dRemoveElement;

import javax.swing.*;

public class RemoveElement {
    public static void main(String[] args) {

//        System.out.println(removeElement(new int[] {3,2,2,3} , 3));
        System.out.println(removeElement(new int[] {0,1,2,2,3,0,4,2} , 2));

    }

    public static int removeElement(int[] nums, int val) {

        int[] resultNums = new int[nums.length];

        int startingIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i + startingIndex >= nums.length) {
                resultNums[i] = 0;
            } else {
                int number = nums[i + startingIndex];
                if (number != val) {
                    resultNums[i] = number;
                } else {
                    startingIndex++;
                    for (int j = startingIndex + i; j < nums.length; j++) {
                        if (j > nums.length) {
                            resultNums[i] = 0;
                        } else {
                            int number2 = nums[j];
                            if (number2 != val) {
                                resultNums[i] = number2;
                                break;
                            }
                        }
                    }
                }
            }
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = resultNums[i];
        }


        return startingIndex;
    }

    public static int findNextVal(int[] original, int startingIndex, int valueToAvoid) {
        for (int i = startingIndex; i < original.length; i++) {
            if (original[i] != valueToAvoid) {
                return original[i];
            }
        }
        return -9999999;
    }
}
