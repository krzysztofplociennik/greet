package com.plociennik.testing.mains.one;

import com.plociennik.testing.resources.ListNode;
import com.plociennik.testing.resources.NodeHelper;

public class RM01 {

    public static void main(String[] args) {

        String s = "12345";
        ListNode nodeFromString = NodeHelper.createNodeFromString(s);

        ListNode nodeCopyFromNode = createNodeCopyFromNode(nodeFromString);
        ListNode l = new ListNode();
    }

    private static ListNode createNodeCopyFromNode(ListNode original) {
        ListNode result = new ListNode();

        ListNode originalTemp = original;
        ListNode resultTemp = result;

        while (originalTemp != null) {
//            result.val = originalTemp.val;

            resultTemp.val = originalTemp.val;

            originalTemp = originalTemp.next;
            resultTemp = resultTemp.next;
        }

        return result;
    }


}
