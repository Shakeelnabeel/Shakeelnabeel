package DSA.linkedlist;     //SUBMITTED

public class ReverseLinkedList206 {
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

    private static ListNode getHead1() {
        ListNode h1 = new ListNode(1);
        ListNode h2 = new ListNode(2);
        h1.next = h2;
        ListNode h3 = new ListNode(3);
        h2.next = h3;
        ListNode h4 = new ListNode(4);
        h3.next = h4;
        return h1;
    }

    public static void main(String[] args) {
        ListNode head = getHead1();
        reverse(head);

    }

    private static ListNode reverse(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        while (curr != null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        return prev;

    }
}
