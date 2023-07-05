package DSA.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TimeToBuyTickets2073 {
    public static void main(String[] args) {
        int[] tickets = new int[]{5, 1, 1, 1};
        int k = 0;
        System.out.println((timeQue(tickets, k)));
//        System.out.println((timeArr(tickets, k)));
    }

    private static int timeArr(int[] tickets, int k) {
        int count = 0;
        int i = 0;
        while (tickets[k] != 0) {

            for (i = 0; i < tickets.length; i++) {
                if (tickets[i] != 0) {
                    if (tickets[k] == 0) {
                        return count;
                    }
                    tickets[i] = tickets[i] - 1;
                    count++;
                }
            }
            i = 0;
        }
        return count;
    }

    private static int timeQue(int[] tickets, int k) {
        Queue<Integer> queue = new LinkedList<>();
        int aCount = 0;
        int count = 0;
        queue.add(null);
        while (tickets[k] != 0) {
            for (int a : tickets) {
                if (a == 0) {
                    aCount++;
                }
                queue.add(--a);
                queue.poll();
                count++;
            }
        }
        return count;
    }
}
