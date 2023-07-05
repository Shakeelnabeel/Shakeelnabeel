package logic.arrays;       //      SUBMITTED

public class RotateArray189 {
    public static void main(String[] args) {
        int[] num = {-1,-100,3,99};
        int k = 2;
        rotate(num, k);
    }

    private static void rotate(int[] num, int k) {
        k = k % num.length;
        int[] temp = new int[k];
        int p = 0;
        for (int j = num.length - k; j < num.length; j++) {
            temp[p] = num[j];
            p++;
        }
        for (int i = num.length - k - 1; i >= 0; i--) {
            num[i + k] = num[i];
        }
        for (int x = 0; x < k; x++) {
            num[x] = temp[x];
        }
    }
}
