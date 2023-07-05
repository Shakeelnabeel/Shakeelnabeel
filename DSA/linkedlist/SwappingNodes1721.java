package DSA.linkedlist;     // SUBMITTED

public class SwappingNodes1721 {
    public static void main(String[] args) {
        SwappingNodes1721 node = new SwappingNodes1721();
        ListNode1 linkedList = node.getLinkedList();
        int k = 5;
        System.out.println(replace(linkedList, k));
    }

    private static ListNode1 replace(ListNode1 linkedList, int k) {
        int count = 1;
        int temp ;
        ListNode1 first = null;
        ListNode1 current = linkedList;
        ListNode1 second = null;
        while (current != null) {
            if (second != null) {
                second = second.next;
            }
            if (count == k) {
                first = current;
                second = linkedList;
            }
            current = current.next;
            count++;
        }
        temp = second.val;
        second.val = first.val;
        first.val = temp;
        return linkedList;
    }

    private SwappingNodes1721.ListNode1 getLinkedList() {
        SwappingNodes1721.ListNode1 head = null;
        SwappingNodes1721.ListNode1 node1 = new SwappingNodes1721.ListNode1(7);
        head = node1;

        SwappingNodes1721.ListNode1 node2 = new SwappingNodes1721.ListNode1(9);
        node1.next = node2;

        SwappingNodes1721.ListNode1 node3 = new SwappingNodes1721.ListNode1(6);
        node2.next = node3;

        SwappingNodes1721.ListNode1 node4 = new SwappingNodes1721.ListNode1(6);
        node3.next = node4;

        SwappingNodes1721.ListNode1 node5 = new SwappingNodes1721.ListNode1(7);
        node4.next = node5;

        SwappingNodes1721.ListNode1 node6 = new ListNode1(8);
        node5.next = node6;

        SwappingNodes1721.ListNode1 node7 = new ListNode1(3);
        node6.next = node7;

        SwappingNodes1721.ListNode1 node8 = new ListNode1(0);
        node7.next = node8;

        SwappingNodes1721.ListNode1 node9 = new ListNode1(9);
        node8.next = node9;

        SwappingNodes1721.ListNode1 node10 = new ListNode1(5);
        node9.next = node10;


        return head;
    }

    public class ListNode1 {
        int val;
        SwappingNodes1721.ListNode1 next;

        ListNode1() {
        }

        ListNode1(int val) {
            this.val = val;
        }

        ListNode1(int val, SwappingNodes1721.ListNode1 next) {
            this.val = val;
            this.next = next;
        }
    }
}
