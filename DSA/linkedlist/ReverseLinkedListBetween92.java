package DSA.linkedlist;

public class ReverseLinkedListBetween92 {
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
        ListNode h1 = new ListNode(1);
        ListNode h2 = new ListNode(2);
        h1.next = h2;
//        ListNode h3 = new ListNode(3);
//        h2.next = h3;
//        ListNode h4 = new ListNode(4);
//        h3.next = h4;
//        ListNode h5 = new ListNode(5);
//        h4.next = h5;
        return h1;
    }

    public static void main(String[] args) {
        int left = 1;
        int right = 2;
        reverse(left, right, getLinkedList());
    }

    private static ListNode reverse(int left, int right, ListNode head) {
        int count = 1;
        ListNode first = null;
        ListNode reversed = head;
        while (count < left - 1) {
            reversed = reversed.next;
            count++;
        }

        ListNode revs;
        if (left == 1) {
            revs= reversed;
        } else {
             revs = reversed.next;
        }
        reversed.next = null;
        first = head;



        reversed = revs;
        while (count < right - 1) {
            reversed = reversed.next;
            count++;
        }
        ListNode last = reversed.next;
        reversed.next = null;


        reversed = null;

        while (revs != null) {      // REVERSE LOGIC  reverseBetween
            ListNode temp = revs.next;
            revs.next = reversed;
            reversed = revs;
            revs = temp;
        }

        ListNode tempFirst = first;
        ListNode tempLast = reversed;
        while (tempFirst.next != null) {
            tempFirst = tempFirst.next;
        }

        while (tempLast.next != null) {
            tempLast = tempLast.next;
        }

        tempLast.next = last;
        tempFirst.next = reversed;


        return head;
    }
}
