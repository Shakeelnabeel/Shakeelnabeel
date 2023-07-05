package DSA.recursion;

import DSA.ListNode;
import DSA.queue.LinkedListImplementation;

public class RemoveNodes2487 {

    public static void main(String[] args) {
        ListNode head = ListNode.getLinkedList();
        removeNodes(head);

    }

    private static ListNode removeNodes(ListNode head) {
        if (head.next == null) {
            return null;
        }
        ListNode listNode = removeNodes(head.next);
        if (head.val > head.next.val) {
            head = head.next;
        }
        return head;
    }
}
