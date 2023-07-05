package DSA.linkedlist;     //      SUBMITTED

import DSA.stack.PalindromeLinkedList234;

public class RotateListKTimes61 {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {

        }

        ListNode(int data) {
            this.val = data;
            this.next = null;
        }
    }

    private static ListNode getLinkedList() {
        ListNode h1 = new ListNode(1);

        ListNode h2 = new ListNode(2);
        h1.next = h2;
        ListNode h3 = new ListNode(3);
        h2.next = h3;
        ListNode h4 = new ListNode(4);
        h3.next = h4;
        ListNode h5 = new ListNode(5);
        h4.next = h5;
//        ListNode h6 = new ListNode(1);
//        h5.next = h6;
        return h1;
    }

    public static void main(String[] args) {
        ListNode head = getLinkedList();
        int k = 10;
        rotate(head, k);
    }

    private static ListNode rotate(ListNode head, int k) {
        ListNode temp = head;
        if (head == null) return null;
        if (head.next == null) return head;
        ListNode prev = head;
        ListNode last = head.next;
        int count = 0;
        while (count != k) {
            if (last == temp) {
                k = k % count;
                count = 0;
                if (count == k) {
                    return head;
                }
            }
            while (last.next != null) {
                prev = last;
                last = last.next;
            }
            prev.next = null;
            last.next = head;
            head = last;
            count++;
        }
        System.out.println(head.val);
        return head;
    }
}
