package logic.arrays;

import java.util.LinkedList;
import java.util.Queue;

public class SlidingWindow239 {
    public static void main(String[] args) {
        int[] num = new int[]{1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        slide(num, k);

    }

    private static int[] slide(int[] num, int k) {
        int[] res = new int[num.length - k + 1];
        int temp = Integer.MIN_VALUE;
        for (int i = 0; i + k < num.length + 1; i++) {
            if (temp == Integer.MIN_VALUE) {
                for (int j = i; j < i + k; j++) {
                    if (temp < num[j]) {
                        temp = num[j];
                    }
                }
            }
            if (temp < num[i + k - 1]) {
                temp = num[i + k - 1];
            } else {
                temp = Integer.MIN_VALUE;
                for (int j = i; j < i + k; j++) {
                    if (temp < num[j]) {
                        temp = num[j];
                    }
                }
            }
            res[i] = temp;
        }
        return res;
    }
}
