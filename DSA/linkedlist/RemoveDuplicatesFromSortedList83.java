package DSA.linkedlist;     //      SUBMITTED


public class RemoveDuplicatesFromSortedList83 {
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

    static ListNode getLinkedList() {
        ListNode h1 = new ListNode(1);
        ListNode h2 = new ListNode(3);
        h1.next = h2;
        ListNode h3 = new ListNode(3);
        h2.next = h3;
        ListNode h4 = new ListNode(4);
        h3.next = h4;
        return h1;
    }

    public static void main(String[] args) {
        removeDuplicates(getLinkedList());

    }

    private static ListNode removeDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }
        ListNode prev = head;
        ListNode curr = head.next;

        while ( curr != null) {
            if (prev.val == curr.val) {
                curr = curr.next;
                prev.next = curr;
            } else {
                curr = curr.next;
                prev = prev.next;
            }
        }
        return head;
    }
}
