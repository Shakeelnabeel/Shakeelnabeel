package logic.arrays;      // SUBMITTED  215. LLETCODE

import java.util.PriorityQueue;

public class KthlargestNumber {
    public static void main(String[] args) {
        int k = 2;
        int[] nums = new int[]{3, 2, 1, 1, 1, 3, 3, 3, 5, 6, 6, 4};
        System.out.println(largestNumber(nums, k));
    }

    private static int largestNumber(int[] nums, int k) {
        PriorityQueue<Integer> heap =
                new PriorityQueue<>();
        // keep k largest elements in the heap
        for (int n : nums) {
            heap.add(n);
            if (heap.size() > k)
                heap.poll();
        }
        // output
        return heap.poll();
    }


}
