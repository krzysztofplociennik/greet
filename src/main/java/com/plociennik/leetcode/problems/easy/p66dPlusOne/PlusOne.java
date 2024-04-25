package com.plociennik.leetcode.problems.easy.p66dPlusOne;

import java.util.Arrays;

public class PlusOne {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(plusOne(new int[]{1, 2, 3})));
        System.out.println(Arrays.toString(plusOne(new int[]{4,3,2,1})));
        System.out.println(Arrays.toString(plusOne(new int[]{9})));

    }

    public static int[] plusOne(int[] digits) {

        int carry = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            int result = digits[i] + carry;
            if (result > 9) {
                digits[i] = 0;
                carry = 1;
            } else {
                digits[i] = result;
                carry = 0;
            }
        }

        if (carry == 0) {
            return digits;
        } else {
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            for (int i = 0; i < digits.length; i++) {
                result[i + 1] = digits[i];
            }
            return result;
        }
    }
}
