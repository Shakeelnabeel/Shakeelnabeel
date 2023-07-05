package DSA.linkedlist;     //  SUBMITTED

public class RemoveNodeFromEnd19 {
    public static void main(String[] args) {
        ListNode linkedList = getLinkedList();
        int n = 1;
        System.out.println(remove(linkedList, n));
    }

    private static ListNode remove(ListNode head, int n) {
        if(head == null || head.next == null) return null;

        ListNode p1 = head;
        ListNode p2 = head;
        ListNode prev = null;
        int cnt = 0;

        while(p1 != null) {
            p1 = p1.next;

            if(cnt >= n) {
                prev = p2;
                p2 = p2.next;
            }
            cnt++;
        }
        if(prev == null)  {
            return p2.next;
        }

        prev.next = p2.next;
        return head;
    }


    private static ListNode getLinkedList() {
        ListNode head = null;
        ListNode node1 = new ListNode(1);
        head = node1;

//        ListNode node2 = new ListNode(2);
//        node1.next = node2;

//        ListNode node3 = new ListNode(3);
//        node2.next = node3;
//
//        ListNode node4 = new ListNode(4);
//        node3.next = node4;
//
//        ListNode node5 = new ListNode(5);
//        node4.next = node5;


        return head;
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
}
