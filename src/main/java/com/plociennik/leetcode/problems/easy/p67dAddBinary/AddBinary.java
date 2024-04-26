package com.plociennik.leetcode.problems.easy.p67dAddBinary;

public class AddBinary {

    public static void main(String[] args) {

//        System.out.println(turnIntoBinary(11));
//        System.out.println(turnIntoBinary(323));

//        System.out.println(turnIntoNumber("1011"));
//        System.out.println(turnIntoNumber("101000011"));

        System.out.println(addBinary("11", "1"));
        System.out.println(addBinary("1010", "1011"));
    }

    public static String addBinary(String a, String b) {

        int first = turnIntoNumber(a);
        int second = turnIntoNumber(b);

        String s = turnIntoBinary(first + second);

        return s;
    }

    public static int turnIntoNumber(String binary) {

        int result = 0;
        int maxPower = binary.length() - 1;
        for (int i = 0; i < binary.length(); i++, maxPower--) {
            if (binary.charAt(i) == '1') {
                result += numberToPowerOf(2, maxPower);
            }
        }

        return result;
    }

    public static String turnIntoBinary(int number) {

        int maxPower = 0;
        int maxNumber = numberToPowerOf(2, maxPower);
        while (maxNumber < number) {
            maxNumber = numberToPowerOf(2, ++maxPower);
        }

        int tempNumber = number;
        String resultBinary = "";

        for (int i = maxPower; i >= 0; i--) {
            int twoPowerOfMax = numberToPowerOf(2, i);
            if (twoPowerOfMax <= tempNumber) {
                resultBinary += "1";
                tempNumber = tempNumber - twoPowerOfMax;
            } else {
                resultBinary += "0";
            }
        }

        if (resultBinary.length() < maxPower) {
            int diff = resultBinary.length() - maxPower;
            for (int i = 0; i < diff; i++) {
                resultBinary += "0";
            }
        }

        return resultBinary;
    }

    public static int numberToPowerOf(int base, int power) {

        if (power == 0) {
            return 1;
        } else if (power == 1) {
            return base;
        } else {
            int result = 1;
            for (int i = 0; i < power; i++) {
                result = result * base;
            }
            return result;
        }

    }
}
