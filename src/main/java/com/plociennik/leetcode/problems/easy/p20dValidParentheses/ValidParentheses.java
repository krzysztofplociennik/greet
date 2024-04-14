package com.plociennik.leetcode.problems.easy.p20dValidParentheses;

public class ValidParentheses {

    public static void main(String[] args) {


        System.out.println(isValid("(}"));
        System.out.println(isValid("()[]{}"));
        System.out.println(isValid("(]"));
    }

    public static boolean isValid(String s) {
        String result = subtractValidParentheses(s);
        return result.length() == 0;
    }

    public static String subtractValidParentheses(String s) {
        String temp = s.replace("()", "").replace("[]", "").replace("{}", "");
        if (s.length() == temp.length()) {
            return temp;
        } else {
            return subtractValidParentheses(temp);
        }
    }
}
