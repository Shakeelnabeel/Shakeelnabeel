package DSA.linkedlist;
//while (head1.val != a) {
//        head1 = head1.next;
//        }
//        curr = head1;
//        while (head1.val != b) {
//        head1 = head1.next;
//        }
//        prev = head1.next;
//        curr.next = head2;
//        while (curr.next != null) {
//        curr = curr.next;
//        }
//        curr.next = prev;
//
//        return result;
public class MergeInBetweenLinkedLists1669 {
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
        ListNode h1 = new ListNode(0);
        ListNode h2 = new ListNode(3);
        h1.next = h2;
        ListNode h3 = new ListNode(2);
        h2.next = h3;
        ListNode h4 = new ListNode(1);
        h3.next = h4;
        ListNode h5 = new ListNode(4);
        h4.next = h5;
        ListNode h6 = new ListNode(5);
        h5.next = h6;
        return h1;
    }

    private static ListNode getHead2() {
        ListNode h1 = new ListNode(1000);
        ListNode h2 = new ListNode(1001);
        h1.next = h2;
        ListNode h3 = new ListNode(1002);
        h2.next = h3;
        return h1;
    }

    public static void main(String[] args) {
        ListNode head1 = getHead1();
        ListNode head2 = getHead2();
        int a = 3, b = 4;
        merge(head1, head2, a, b);

    }

    private static ListNode merge(ListNode head1, ListNode head2, int a, int b) {
        ListNode result = head1;
        ListNode curr = null;
        ListNode prev = null;
        ListNode next = head1.next;
        int count = 1;
        while (count != a) {
            count++;
            next = next.next;
            head1 = head1.next;
        }
        curr = head1;
        while (count != b) {
            count++;
            head1 = head1.next;
        }
        prev = head1.next;
        curr.next = head2;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = prev.next;
        return result;
    }


}
