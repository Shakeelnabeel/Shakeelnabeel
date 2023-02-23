package DSA.linkedlist;     //      SUBMITTED

import DSA.ListNode;

public class ReplacePairs24 {
    public static void main(String[] args) {

        ReplacePairs24 pairs = new ReplacePairs24();
        ListNode head = pairs.getLinkedList();
        System.out.println(replace(head));
    }

    private ListNode getLinkedList() {
        ListNode head = null;
        ListNode node1 = new ListNode(1);
        head = node1;

        ListNode node2 = new ListNode(1);
        node1 = node2;

        ListNode node3 = new ListNode(2);
        node2.next = node3;

        ListNode node4 = new ListNode(3);
        node3.next = node4;

        ListNode
                = new ListNode(3);
        node4.next = node5;


        return head;
    }

    private static ListNode replace(ListNode head) {
        if (head == null && head.next == null) {
            return head;
        }
        ListNode temp1 = head;
        ListNode temp2 = head.next;
        int val;

        while (temp2 != null) {
            val = temp1.val;
            temp1.val = temp2.val;
            temp2.val = val;
            if (temp2.next != null) {
                temp1 = temp1.next.next;
                temp2 = temp2.next.next;
            } else {
                return head;
            }
        }

        return temp1;
    }

}
