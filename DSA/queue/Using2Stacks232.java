package DSA.queue;              //  SUBMITTED

import java.util.Stack;

public class Using2Stacks232 {

    static Stack<Integer> s1 = new Stack<>();
    static Stack<Integer> s2 = new Stack<>();

    static class Queue {

        static void add(int data) {
            s1.add(data);
        }

        static int remove() {
            if (s1.isEmpty()) {
                return -1;
            }
            while (!s1.empty()) {
                s2.add(s1.pop());
            }
            int data = s2.pop();
            while (!s2.empty()) {
                s1.add(s2.pop());
            }
            return data;
        }
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.add(1);
        queue.add(2);
        queue.add(3);

        System.out.println(queue.remove());

        while (s1.size() != 0) {
            System.out.println(queue.remove());
        }
    }
}
