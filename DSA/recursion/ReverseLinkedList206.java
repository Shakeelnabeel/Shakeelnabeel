package DSA.recursion;
//  Completed but not submitted.
public class ReverseLinkedList206 {
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

        System.out.println(reverse(node1));


    }

    private static Node reverse(Node head) {
        if (head.next == null) {
            return head;
        }
        Node ref = reverse(head.next);
        head.next.next = head;
        head.next = null;

        return ref;

    }
}
