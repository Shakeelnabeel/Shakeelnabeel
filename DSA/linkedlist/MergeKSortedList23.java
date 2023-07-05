package DSA.linkedlist;

import java.util.LinkedList;
import java.util.List;

public class MergeKSortedList23 {
    private static ListNode[] getList() {
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(4);
        head1.next.next = new ListNode(5);

        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(3);
        head2.next.next = new ListNode(4);

        ListNode head3 = new ListNode(2);
        head3.next = new ListNode(6);

        return new ListNode[]{head1, head2, head3};
    }

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

    public static <List> void main(String[] args) {
        ListNode[] list = getList();
        merge(list);
    }

    private static ListNode merge(ListNode[] list) {
        ListNode l3 = new ListNode();
        for (int i = 0; i < list.length - 1; i++) {
            ListNode l1 = list[i];
            ListNode l2 = list[i + 1];
            l1 = sortedList(l1, l2);
        }
        return null;
    }

    private static ListNode sortedList(ListNode l1, ListNode l2) {
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                ListNode temp = new ListNode(l2.val);
                l1.next = temp;
                temp.next = l1.next.next;
                l1 = l1.next;
            } else {
                ListNode temp = new ListNode(l2.val);
                temp.next = l1.next;
                l1.next = temp;
                l2 = l2.next;
            }
        }
        while (l2 != null) {
            l1.next = l2;
            l2 = l2.next;
        }
        return l1;

    }
}
