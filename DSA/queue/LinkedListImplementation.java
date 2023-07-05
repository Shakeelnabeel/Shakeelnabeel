package DSA.queue;

public class LinkedListImplementation {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }


        static class Queue {
            static Node head = null;
            static Node tail = null;

        public static boolean isEmpty() {
            return head == null && tail == null;
        }
            public static void add(int data) {
                Node newNode = new Node(data);
                if (head == null && tail == null) {
                    head = tail = newNode;
                }
                tail.next = newNode;
                tail = newNode;
            }


            public static int remove() {
                if (isEmpty()) {
                    System.out.println("Queue is empty");
                    return -1;
                }
                //single node
                if(head == tail) {
                    tail = null;
                }
                int data = head.data;
                head = head.next;
                return data;
            }

            public static int peek() {
                if (isEmpty()) {
                    System.out.println("Queue is empty");
                    return -1;
                }
                return head.data;
            }
        }
    }
    public static void main(String[] args) {
        Node.Queue q = new Node.Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.remove();
        q.remove();
        q.add(6);
        q.add(7);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
