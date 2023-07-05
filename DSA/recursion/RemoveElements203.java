package DSA.recursion;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class RemoveElements203 {
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    static class ListNode {
        int val;
        ListNode next;
    }

    static ListNode getLinkedList() {
        return new ListNode(2, new ListNode(2, new ListNode(5, new ListNode(4, new ListNode()))));
    }
    public static void main(String[] args) {
        remove(getLinkedList(),2);
    }

    private static ListNode remove(ListNode head, int k) {
        if (head == null) {
            return null;
        }
        head.next = remove(head.next, k);
        if (head.val == k) {
            return head.next;
        }
        return head;
    }
}
