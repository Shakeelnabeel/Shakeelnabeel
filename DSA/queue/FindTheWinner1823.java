package DSA.queue;      //      SUBMITTED

import java.util.LinkedList;
import java.util.Queue;

public class FindTheWinner1823 {
    public static void main(String[] args) {
        int n = 6, k = 5;
        System.out.println(winner(n, k));
    }

    private static int winner(int n, int k) {
        Queue<Integer> queue = new LinkedList<>();
        int count = 1;
        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }
        while (queue.size() != 1) {
            if (count == k) {
                queue.poll();
                count = 0;
            } else {
                Integer addLast = queue.poll();
                queue.add(addLast);
            }
            count++;
        }
        return queue.peek();
    }
}
