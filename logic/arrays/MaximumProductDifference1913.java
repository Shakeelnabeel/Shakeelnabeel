package logic.arrays;       //LEETCODE

public class MaximumProductDifference1913 {
    public static void main(String[] args) {
        int[] num = new int[]{5, 6, 2, 7, 4};
        System.out.println(difference(num));
    }

    private static int difference(int[] nums) {
        int largest = 0, secondLargest = 0, smallest = Integer.MAX_VALUE, secondSmallest = Integer.MAX_VALUE;
        for (int k : nums) {
            if (k >= largest) {
                secondLargest = largest;
                largest = k;
            } else if (k > secondLargest)
                secondLargest = k;
            if (k <= smallest) {
                secondSmallest = smallest;
                smallest = k;
            } else if (k < secondSmallest)
                secondSmallest = k;
        }
        return largest * secondLargest - smallest * secondSmallest;
    }
}
