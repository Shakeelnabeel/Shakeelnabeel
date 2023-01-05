package DSA;        //      SUBMITTED  21. LEETCODE

public class ListNode {
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

    public static void insert(int val, ListNode head) {             //      CODE TO ADD IN LINKED LIST

        ListNode node = new ListNode(val);
        if (head == null) {
            head = node;
        } else {
            ListNode n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }
    }

    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        ListNode list2 = new ListNode(1);

        insert(2, list2);
        insert(6, list2);
        insert(6, list2);
        insert(6, list2);

        insert(3, list1);
        insert(4, list1);

        System.out.println(mergeTwoLists(list1, list2));
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode prehead = new ListNode(-1);
        ListNode cur = prehead;

        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                cur.next = l1;
                l1 = l1.next;
            } else {
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }

        if (l1 != null) {
            cur.next = l1;
            l1 = l1.next;
        }

        if (l2 != null) {
            cur.next = l2;
            l2 = l2.next;
        }
        return prehead.next;
    }

}
