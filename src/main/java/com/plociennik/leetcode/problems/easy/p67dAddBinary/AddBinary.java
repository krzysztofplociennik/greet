package com.plociennik.leetcode.problems.easy.p67dAddBinary;

public class AddBinary {

    public static void main(String[] args) {

        num2BinPrint(11, "1011");
        num2BinPrint(323, "101000011");
        num2BinPrint(4, "100");

        bin2NumPrint("1011", 11);
        bin2NumPrint("101000011", 323);
        bin2NumPrint("11", 3);
        bin2NumPrint("1", 1);
        bin2NumPrint("1010", 10);
        bin2NumPrint("1011", 11);

        System.out.println(addBinary("11", "1"));
        System.out.println(addBinary("1010", "1011"));
        System.out.println(addBinary("0", "0"));
    }

    public static void bin2NumPrint(String binaryInput, int numberExpected) {
        int output = turnIntoNumber(binaryInput);
        System.out.println("Binary to number -> input: " + binaryInput + " | expected output: " + numberExpected + " | actual output: " + output);
    }

    public static void num2BinPrint(int numberInput, String binaryExpected) {
        String output = turnIntoBinary(numberInput);
        System.out.println("Number to binary -> input: " + numberInput + " | expected output: " + binaryExpected + " | actual output: " + output);

    }

    public static String addBinary(String a, String b) {

        int first = turnIntoNumber(a);
        int second = turnIntoNumber(b);

        String s = turnIntoBinary(first + second);

        return s;
    }

    public static int turnIntoNumber(String binary) {
        if (binary.equals("0")) {
            return 0;
        }

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
        if (number == 0) {
            return "0";
        }

        int maxPower = 0;
        int maxNumber = numberToPowerOf(2, maxPower);
        while (maxNumber <= number) {
            maxNumber = numberToPowerOf(2, ++maxPower);
        }

        int tempNumber = number;
        String resultBinary = "";

        for (int i = maxPower - 1; i >= 0; i--) {
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
