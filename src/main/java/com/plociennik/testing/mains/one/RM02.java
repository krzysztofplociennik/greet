package com.plociennik.testing.mains.one;

import com.plociennik.testing.resources.ListNode;
import com.plociennik.testing.resources.NodeHelper;
import org.w3c.dom.Node;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RM02 {

    public static void main(String[] args) {

        String s = "124";
        ListNode nodeFromString = NodeHelper.createNodeFromString(s);
        List<Integer> listFromNode = NodeHelper.createIntegerListFromNode(nodeFromString);
        ListNode nodeFromList = NodeHelper.createNodeFromList(listFromNode, 0);

        String s2 = "134";
        ListNode nodeFromString2 = NodeHelper.createNodeFromString(s2);
        List<Integer> listFromNode2 = NodeHelper.createIntegerListFromNode(nodeFromString2);
        ListNode nodeFromList2 = NodeHelper.createNodeFromList(listFromNode2, 0);


        List<Integer> merge = merge(listFromNode, listFromNode2);
        ListNode finalNode = NodeHelper.createNodeFromList(merge, 0);


        ListNode l = new ListNode();
    }

    public static List<Integer> merge(List<Integer> list1, List<Integer> list2) {
        list1.addAll(list2);
        List<Integer> sorted = list1.stream()
                .sorted()
                .collect(Collectors.toList());
        return sorted;
    }


}
