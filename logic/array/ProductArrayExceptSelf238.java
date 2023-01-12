package logic.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ProductArrayExceptSelf238 {
    public static void main(String[] args) {
        int[] num = new int[]{1,2,3,4};
        System.out.println(Arrays.toString(product(num)));
    }

    private static int[] product(int[] nums) {          //  OFFICIAL SOLUTION
        int n = nums.length;

        int[] leftProducts = new int[n];
        leftProducts[0] = 1;
        for (int i = 1; i < n; i++) {
            leftProducts[i] = leftProducts[i - 1] * nums[i - 1];
        }

        int[] rightProducts = new int[n];
        rightProducts[n - 1] = 1;

        for (int i = n - 2; i >= 0; i--) {
            rightProducts[i] = rightProducts[i + 1] * nums[i + 1];
        }

        int[] res = new int[n];

        for (int i=0; i < n; i++) {
            res[i] = leftProducts[i] * rightProducts[i];
        }
        return res;
    }

    private static int[] product1(int[] num) {          //  MY SOLUTION
        int[] result = new int[num.length];
        int prod = 1;
        Set<Integer> k = new HashSet<>();

        for (int i = 0; i < num.length; i++) {
            if (num[i] != 0) {
                prod = prod * num[i];
            } else {
                k.add(i);
            }
        }

        if (k.size() > 1) {
            return new int[num.length];
        }
        for (int i = 0; i < num.length; i++) {
            if (k.size() == 0) {
                result[i] = prod / num[i];
            } else if (num[i] == 0) {
                result[i] = prod;
            } else if (k.contains(i)) {
                result[i] = 0;
            }
        }
        return result;
    }
}
