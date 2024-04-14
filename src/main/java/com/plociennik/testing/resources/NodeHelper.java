package com.plociennik.testing.resources;

import java.util.ArrayList;
import java.util.List;

public class NodeHelper {

    public static ListNode createNodeFromArray(String[] array) {


        return null;
    }

    public static ListNode createNodeFromString(String s) {
        if (s.length() == 1) {
            int i = Integer.parseInt(s);
            return new ListNode(i);
        } else {
            int i = Integer.parseInt(String.valueOf(s.charAt(0)));
            s = s.substring(1);
            return new ListNode(i, createNodeFromString(s));
        }
    }

    public static ListNode createNodeFromList(List<Integer> list, int index) {
        if (index == list.size() - 1) {
            return new ListNode(list.get(index));
        } else {
            int i = list.get(index);
            return new ListNode(i, createNodeFromList(list, index + 1));
        }
    }

    public static String createStringFromNode(ListNode node) {
        StringBuilder result = new StringBuilder();
        ListNode tempNode = node;

        while (tempNode != null) {
            String val = String.valueOf(tempNode.val);
            result.append(val);
        }

        return result.toString();
    }

    public static List<Integer> createIntegerListFromNode(ListNode node) {
        List<Integer> result = new ArrayList<>();
        ListNode tempNode = node;

        while (tempNode != null) {
            result.add(tempNode.val);
            tempNode = tempNode.next;
        }

        return result;
    }
}
