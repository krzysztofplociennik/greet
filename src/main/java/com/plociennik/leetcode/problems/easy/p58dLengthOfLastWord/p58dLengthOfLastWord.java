package com.plociennik.leetcode.problems.easy.p58dLengthOfLastWord;

public class p58dLengthOfLastWord {

    public static void main(String[] args) {

//        System.out.println(lengthOfLastWord("Hello World"));
//        System.out.println(lengthOfLastWord("   fly me   to   the moon  "));
//        System.out.println(lengthOfLastWord("luffy is still joyboy"));
        System.out.println(lengthOfLastWord("a "));
    }

    public static int lengthOfLastWord(String s) {

        int indexOfLastWhitespace = s.lastIndexOf(' ');

        if (indexOfLastWhitespace == -1) {
            return s.length();
        } else if (indexOfLastWhitespace == s.length() - 1) {
            int startingIndexOfLastWord = -1;
            for (int i = indexOfLastWhitespace - 1; i >= 0; i--) {
                boolean isSpace = s.charAt(i) == ' ';
                if (!isSpace) {
                    startingIndexOfLastWord = i;
                    break;
                }
            }
            for (int i = startingIndexOfLastWord - 1; i >= 0; i--) {
                boolean isSpace = s.charAt(i) == ' ';
                if (isSpace) {
                    return startingIndexOfLastWord - i;
                }
            }
            return startingIndexOfLastWord + 1;
        } else {
            return s.length() - indexOfLastWhitespace - 1;
        }
    }
}
