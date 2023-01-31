package DSA.stack;          //  SUBMITTED

import java.util.Stack;

public class MaxTwinSum2130 {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public static void main(String[] args) {


        Node l1 = new Node(1);
        Node l2 = new Node(2);
        l1.next = l2;
        Node l3 = new Node(3);
        l2.next = l3;
        l3.next = new Node(4);
        System.out.println(twinSum(l1));

    }

    private static int twinSum(Node head) {
        Stack<Integer> s1 = new Stack<>();
        Node fast = head;
        Node slow = head;
        int total = 0;
        while (fast != null) {
            s1.push(slow.data);
            slow = slow.next;
            fast = fast.next.next;
        }
        while (slow != null) {
            total = Math.max(total, s1.pop() + slow.data);
            slow = slow.next;
        }
        return total;
    }
}
