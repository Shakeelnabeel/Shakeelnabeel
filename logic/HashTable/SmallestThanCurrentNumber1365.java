package logic.HashTable;

import java.util.List;

public class SmallestThanCurrentNumber1365 {
    public static void main(String[] args) {
        int[] num = new int[]{8, 1, 2, 2, 3};
        System.out.println(List.of(check(num)));
    }

    private static int[] check(int[] num) {
        int count;
        int[] result = new int[num.length];
        for (int i = 0; i < num.length; i++) {
            count = 0;
            for (int k : num) {
                if (num[i] > k) {
                    count++;
                }
            }
            result[i] = count;
        }
        return result;
    }
}
