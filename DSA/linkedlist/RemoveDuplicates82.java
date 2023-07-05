package DSA.linkedlist;


import DSA.ListNode;

public class RemoveDuplicates82 {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode getLinkedList() {
        ListNode head = null;
        ListNode node1 = new ListNode(1);
        head = node1;

        ListNode node2 = new ListNode(2);
        node1.next = node2;

        ListNode node3 = new ListNode(3);
        node2.next = node3;

        ListNode node4 = new ListNode(3);
        node3.next = node4;

        ListNode node5 = new ListNode(4);
        node4.next = node5;

        ListNode node6 = new ListNode(5);
        node5.next = node6;


        return head;
    }

    public static void main(String[] args) {
        ListNode head = getLinkedList();

        System.out.println(deleteDuplicate(head));

    }

    private static ListNode deleteDuplicate(ListNode head) {
        ListNode curr = head;
        ListNode temp = curr.next;

        while (temp.next != null) {
            if (curr.val != temp.val) {
                if ( temp.next.next != null && temp.next != temp.next.next) {
                    curr = curr.next;
                }
            }
            temp = temp.next;
        }
        return head;
    }
}
