package DSA.stack;

import static DSA.stack.Implementation.Stack.pushAtBottom;

public class Implementation {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Stack {

        public static Node head;
        public  void push(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        public  int pop() {
            if (head == null) {
                return -1;
            }
            int data = head.data;
            head = head.next;
            return data;
        }

        public int peek() {
            if (head == null) {
                return -1;
            }
            return head.data;
        }

        public static void pushAtBottom(int data, Stack stack) {
            if (stack.peek() == -1) {
                stack.push(data);
                return;
            }
            int top = stack.pop();
            pushAtBottom(data, stack);
            stack.push(top);
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        pushAtBottom(4, s);

        while (Stack.head != null) {
            System.out.println(s.pop());
        }
    }
}
