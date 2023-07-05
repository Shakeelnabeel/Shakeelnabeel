package logic.arrays;       // SUBMITTED

public class PairsAbsoluteDifferenceK2006 {
    public static void main(String[] args) {
        int[] num = new int[]{1, 2, 2, 1};
        int k = 1;
        System.out.println(difference(num, k));

    }

    private static int difference(int[] num, int k) {
        int result = 0;
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {
                if (num[i] - num[j] == k && i != j) {
                    result++;
                }
            }
        }
        return result;
    }
}
