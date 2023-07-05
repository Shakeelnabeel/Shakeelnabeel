package DSA.linkedlist;     //      SUBMITTED

public class MergeNodesBetweenZeros2181 {
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
        ListNode h1 = new ListNode(0);
        ListNode h2 = new ListNode(3);
        h1.next = h2;
        ListNode h3 = new ListNode(3);
        h2.next = h3;
        ListNode h4 = new ListNode(0);
        h3.next = h4;
        ListNode h5 = new ListNode(4);
        h4.next = h5;
        ListNode h6 = new ListNode(0);
        h5.next = h6;
        return h1;
    }

    public static void main(String[] args) {
        merge(getLinkedList());
    }

    private static ListNode merge(ListNode head) {
        int sum = 0;
        ListNode curr = head;

        ListNode res = new ListNode();
        ListNode output = res;
        curr = curr.next;
        while (curr != null) {
            if (curr.val == 0) {
                res.next = new ListNode(sum);
                res = res.next;
                sum = 0;
            } else {
                sum = sum + curr.val;
            }
            curr = curr.next;
        }
        return output.next;
    }
}
