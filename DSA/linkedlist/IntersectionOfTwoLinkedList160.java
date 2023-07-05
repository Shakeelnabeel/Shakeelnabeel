package DSA.linkedlist;     //  SUBMITTED

import java.util.ArrayList;
import java.util.List;

public class IntersectionOfTwoLinkedList160 {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }

        ListNode() {
        }
    }

    static List<ListNode> getLinkedList() {
        ListNode head = null;
        ListNode head2 = null;
        ListNode node1 = new ListNode(1);
        head = node1;
        ListNode node2 = new ListNode(2);
        node1.next = node2;
        ListNode node3 = new ListNode(3);
        node2.next = node3;
        ListNode node4 = new ListNode(4);
        node3.next = node4;


        ListNode listNode1 = new ListNode(1);
        head2 = listNode1;
        listNode1.next = node3;

        List<ListNode> listNodeList = new ArrayList<>();
        listNodeList.add(head);
        listNodeList.add(head2);
        return listNodeList;
    }

    public static void main(String[] args) {
        List<ListNode> listNode = getLinkedList();
        intersect(listNode.get(0), listNode.get(1));
    }

    private static ListNode intersect(ListNode headA, ListNode headB) {
        ListNode head1 = headA;
        ListNode head2 = headB;
        while (head1 != head2) {
            if (head1 == null) {
                head1 = headB;
            } else {
                head1 = head1.next;
            }

            if (head2 == null) {
                head2 = headA;
            } else {
                head2 = head2.next;
            }
        }
        return headA;
    }
}
