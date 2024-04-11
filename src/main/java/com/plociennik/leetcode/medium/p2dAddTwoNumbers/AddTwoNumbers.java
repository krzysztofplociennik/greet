package com.plociennik.leetcode.medium.p2dAddTwoNumbers;

import java.math.BigInteger;

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

public class AddTwoNumbers {

    public static void main(String[] args) {

        ListNode node1 = createNode("1000000000000000000000000000001");
        ListNode node2 = createNode("564");
        ListNode listNode = addTwoNumbers(node1, node2);
        System.out.println("node done");

    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        BigInteger firstNumber = getNumberFromNode(l1);
        BigInteger secondNumber = getNumberFromNode(l2);
        BigInteger sum = firstNumber.add(secondNumber);
        StringBuilder reversed = new StringBuilder(String.valueOf(sum)).reverse();
        ListNode node = createNode(reversed.toString());
        return node;
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

    private static BigInteger getNumberFromNode(ListNode node) {
        StringBuilder stringBuilder = new StringBuilder();
        ListNode temp = node;
        while(temp != null) {
            stringBuilder.append(temp.val);
            temp = temp.next;
        }
        StringBuilder reverse = stringBuilder.reverse();
        return new BigInteger(reverse.toString());
    }
}
