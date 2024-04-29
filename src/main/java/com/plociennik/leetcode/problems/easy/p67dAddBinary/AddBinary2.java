package com.plociennik.leetcode.problems.easy.p67dAddBinary;

public class AddBinary2 {

    public static void main(String[] args) {

        System.out.println(addBinary("11", "1"));
        System.out.println(addBinary("1010", "1011"));
        System.out.println(addBinary("0", "0"));
        System.out.println(addBinary("10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101", "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011"));
        // a binary: 24847893154024981730169397005
        // a binary: 526700554598729746900966573811

    }

    public static String addBinary(String a, String b) {
        StringBuilder stringBuilder = new StringBuilder();

        int biggerIndex = a.length() > b.length() ? a.length() : b.length();

        int carry = 0;

        for (int i = 0; i <= biggerIndex; i++) {
            int wanderAIndex = a.length() - 1 - i;
            int wanderBIndex = b.length() - 1 - i;
//            char achar = a.charAt(wanderAIndex);
//            char bchar = b.charAt(wanderBIndex);
            if (wanderAIndex < 0) {

            } else if (wanderBIndex < 0) {

            } else {
                // to implement
            }
        }

        return stringBuilder.toString();
    }

    public static char addDigits(char a, char b) {
        if (a == '0' && b == '0') {
            return '0';
        } else if (a == '1' && b == '1') {
            return '2';
        } else {
            return '1';
        }
    }
}
