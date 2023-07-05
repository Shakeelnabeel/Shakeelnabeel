package DSA.linkedlist;         //      SUBMITTED

public class LinkedListCycle141 {
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
        ListNode head = null;
        ListNode node1 = new ListNode(1);
        head = node1;

        ListNode node2 = new ListNode(2);
        node1.next = node2;

//        ListNode node3 = new ListNode(3);
//        node2.next = node3;
//
//        ListNode node4 = new ListNode(4);
//        node3.next = node2;
        return head;
    }

    public static void main(String[] args) {
        ListNode head = getLinkedList();
        cycle(head);
    }

    private static boolean cycle(ListNode head) {
        if(head == null || head.next == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast != null) {
            if (slow == fast) {
                return true;
            }
            slow = slow.next;
            if(fast.next != null) fast = fast.next.next;
        }
        return false;
    }
}
