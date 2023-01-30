package DSA.stack;      //      SUBMITTED

import java.util.LinkedList;

public class Using2Queue {
    static java.util.Queue<Integer> q1 = new LinkedList<>();
    static java.util.Queue<Integer> q2 = new LinkedList<>();

    static class Stack {

        static void add(int data) {
            while (!q1.isEmpty()) {
                q2.add(q1.poll());
            }
            q1.add(data);
            while (!q2.isEmpty()) {
                q1.add(q2.poll());
            }
        }

        static int remove() {       // peek
            if (q1.isEmpty()) {
                return -1;
            }
            return q1.poll();
        }
    }

    public static void main(String[] args) {
        Stack.add(1);
        Stack.add(2);
        Stack.add(3);
        Stack.add(4);
        System.out.println(Stack.remove());
    }
}
