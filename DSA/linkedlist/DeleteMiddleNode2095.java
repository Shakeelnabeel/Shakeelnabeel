package DSA.linkedlist;

public class DeleteMiddleNode2095 {

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

    private static ListNode getLinkedList() {
        ListNode head = null;
        ListNode node1 = new ListNode(1, new ListNode(2, new ListNode(2)));
        head = node1;

//        ListNode node2 = new ListNode(2);
//        node1.next = node2;
//
//        ListNode node3 = new ListNode(3);
//        node2.next = node3;
//
//        ListNode node4 = new ListNode(4);
//        node3.next = node4;
//
//        ListNode node5 = new ListNode(1);
//        node4.next = node5;
//
//        ListNode node6 = new ListNode(2);
//        node5.next = node6;
//
//        ListNode node7 = new ListNode(8);
//        node6.next = node7;

        return head;
    }
    public static void main(String[] args) {
        ListNode head = getLinkedList();
        delete(head);
    }

    private static ListNode delete(ListNode head) {
        ListNode prev = null;
        if (head.next == null) {
            return null;
        }
        if (head.next.next == null) {
            head.next = null;
            return head;
        }

        ListNode slow = head;
        ListNode fast = head.next;
        while (fast != null) {
            prev = slow;
            if (fast.next == null) {
                slow.next = slow.next.next;
                return head;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = slow.next;

        return head;
    }

    public static ListNode deleteMiddle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;
        while(fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        if(prev == null){
            return slow.next;
        }
        prev.next = slow.next;
        return head;
    }
}
