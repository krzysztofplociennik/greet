package com.plociennik.leetcode.problems.easy.p28dIndexOfFirstOccurence;

public class IndexOfFirstOccurrence {

    public static void main(String[] args) {

        System.out.println(strStr("sadbutsad", "sad"));
        System.out.println(strStr("leetcode", "leeto"));
        System.out.println(strStr("a", "a"));
        System.out.println(strStr("abc", "c"));
    }

    public static int strStr(String haystack, String needle) {
        if (haystack.equals(needle)) {
            return 0;
        }
        int resultIndex = -1;
        char needleStart = needle.charAt(0);

        for (int i = 0; i < haystack.length(); i++) {
            char c = haystack.charAt(i);
            if (c == needleStart) {
                if (i + needle.length() > haystack.length()) {
                    return resultIndex;
                } else {
                    String substring = haystack.substring(i, i + needle.length());
                    if (substring.equals(needle)) {
                        return i;
                    }
                }
            }
        }
        return resultIndex;
    }

    public static boolean startsWithNeedle() {
        return false;
    }
}
