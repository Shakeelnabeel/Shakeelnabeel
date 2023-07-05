package logic.arrays;

import java.util.Arrays;

public class ArrayPermutation {
    public static void main(String[] args) {
        int[] num = new int[]{5,0,1,2,3,4};
        System.out.println(Arrays.toString(array(num)));
    }

    private static int[] array(int[] num) {
        int[] clone = num.clone();
        for (int i = 0; i < num.length ; i++) {
            int temp = num[num[i]];
            clone[i] = temp;

        }
        return clone;
    }
}

