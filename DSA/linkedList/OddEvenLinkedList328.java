package DSA.linkedlist;         //      SUBMITTED

public class OddEvenLinkedList328 {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        node1.next = node2;
        Node node3 = new Node(3);
        node2.next = node3;
        Node node4 = new Node(4);
        node3.next = node4;
        Node node5 = new Node(5);
        node4.next = node5;
        Node node6 = new Node(6);
        node5.next = node6;
        Node node7 = new Node(7);
        node6.next = node7;
        Node node8 = new Node(8);
        node7.next = node8;

        System.out.println(oddEven(node1));


    }

    private static Node oddEven(Node head) {
        Node odd = new Node(0);
        Node result = odd;
        Node even = new Node(0);
        Node temp = even;
        while (head != null) {
            odd.next = new Node(head.data);
            odd = odd.next;
            if (head.next != null) {
                even.next = new Node(head.next.data);
                even = even.next;
                head = head.next.next;
            } else {
                head = null;
            }

        }
        odd.next = temp.next;
        return result.next;
    }

}
