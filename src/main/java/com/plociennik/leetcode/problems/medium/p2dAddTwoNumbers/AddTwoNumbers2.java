package com.plociennik.leetcode.problems.medium.p2dAddTwoNumbers;

import com.plociennik.testing.resources.ListNode;

/**
 * Problem can be found at: https://leetcode.com/problems/add-two-numbers/description/
 *
 *  * Definition for singly-linked list.
 *  * public class ListNode {
 *  *     int val;
 *  *     ListNode next;
 *  *     ListNode() {}
 *  *     ListNode(int val) { this.val = val; }
 *  *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 *  * }
 *
 */

public class AddTwoNumbers2 {

    public static void main(String[] args) {

        String ex = "123";
        String ex2 = "456";

        ListNode listNode = transformIntoNode(ex);
        ListNode listNode1 = transformIntoNode(ex2);
        System.out.println("Done");

        System.out.println("\n=====================================\n");


        ListNode node = createNode("123");
        System.out.println("node done");

    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        long firstNumber = getNumberFromNode(l1);
        long secondNumber = getNumberFromNode(l2);
        long sum = firstNumber + secondNumber;
        StringBuilder reversed = new StringBuilder(String.valueOf(sum)).reverse();

        ListNode listNode = transformIntoNode(reversed.toString());
        return listNode;
    }

    private static ListNode createNode(String s) {

        if (s.length() == 1) {
            int i = Integer.parseInt(s);
            return new ListNode(i);
        } else {
            int i = Integer.parseInt(String.valueOf(s.charAt(0)));
            s = s.substring(1);
            return new ListNode(i, createNode(s));
        }
    }

    private static ListNode transformIntoNode(String value) {

        int firstDigit = Integer.parseInt(String.valueOf(value.charAt(0)));
        ListNode listNode = new ListNode(firstDigit);
        ListNode tempNode = listNode;

        for (int i = 1; i < value.length() -1; i++) {
            populateFirstNextNull(listNode, value.charAt(i), i);
            ListNode travel = getFirstNextNull(listNode, i);
        }
        return new ListNode(3);
    }

    private static ListNode getFirstNextNull(ListNode start, int index) {
        ListNode node = start.next;
        return null;
    }

    private static void travel(ListNode l1) {
    }

    private static void populateFirstNextNull(ListNode startingNode, char c, int index) {
//        if (startingNode.next) {
//
//        }

        ListNode tempNode = startingNode;
        for (int i = 0; i < index; i++) {
            int digit = Integer.parseInt(String.valueOf(c));
            tempNode.next = new ListNode(digit);
        }
    }

    private static long getNumberFromNode(ListNode node) {

        StringBuilder stringBuilder = new StringBuilder();

        ListNode temp = node;

        while(temp != null) {
            stringBuilder.append(temp.val);
            temp = temp.next;
        }

        StringBuilder reverse = stringBuilder.reverse();

        return Long.parseLong(reverse.toString());
    }
}
