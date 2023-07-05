package logic.arrays;       //      SUBMITTED

import java.util.Arrays;

public class PlusOne66 {

    public static void main(String[] args) {
        int[] num = {9,9,9};
        System.out.println(Arrays.toString(plus(num)));

    }

    private static int[] plus(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; --i) {
            if (digits[i] == 9) {
                digits[i] = 0;
            }
            else {
                digits[i]++;
                return digits;
            }
        }
        digits = new int[n + 1];
        digits[0] = 1;
        return digits;
    }
}
