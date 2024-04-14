package com.plociennik.leetcode.problems.easy.p21dMergeTwoSortedLists;

/**
 * You are given the heads of two sorted linked lists list1 and list2.
 *
 * Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.
 *
 * Return the head of the merged linked list.
 *
 *
 *
 * Example 1:
 *
 * Input: list1 = [1,2,4], list2 = [1,3,4]
 * Output: [1,1,2,3,4,4]
 *
 * Example 2:
 *
 * Input: list1 = [], list2 = []
 * Output: []
 *
 * Example 3:
 *
 * Input: list1 = [], list2 = [0]
 * Output: [0]
 *
 *
 *
 * Constraints:
 *
 *     The number of nodes in both lists is in the range [0, 50].
 *     -100 <= Node.val <= 100
 *     Both list1 and list2 are sorted in non-decreasing order.
 *
 *     The problem can be found at: https://leetcode.com/problems/merge-two-sorted-lists/
 */


import com.plociennik.testing.resources.ListNode;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

public class MergeTwoSortedLists {

    public static void main(String[] args) {



    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        List<Integer> integers1 = createIntegerListFromNode(list1);
        List<Integer> integers2 = createIntegerListFromNode(list2);
        integers1.addAll(integers2);

        List<Integer> sortedIntegers = integers1.stream()
                .sorted()
                .toList();

        ListNode resultNode = createNodeFromList(sortedIntegers, 0);

        return resultNode;
    }

    public static List<Integer> createIntegerListFromNode(ListNode node) {
        List<Integer> result = new ArrayList<>();

        if (node == null) {
            return result;
        }

        ListNode tempNode = node;

        while (tempNode != null) {
            result.add(tempNode.val);
            tempNode = tempNode.next;
        }

        return result;
    }

    public static ListNode createNodeFromList(List<Integer> list, int index) {
        if (list.isEmpty()) {
            return null;
        }
        if (index == list.size() - 1) {
            return new ListNode(list.get(index));
        } else {
            int i = list.get(index);
            return new ListNode(i, createNodeFromList(list, index + 1));
        }
    }
}
