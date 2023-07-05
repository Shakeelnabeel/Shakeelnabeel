package logic.arrays;       //  SUBMITTED

public class ContainsDuplicate219 {
    public static void main(String[] args) {
        int[] num = new int[]{1, 2, 3, 1, 2, 3};
        int k = 2;
        System.out.println(duplicate(num, k));

    }

    private static boolean duplicate(int[] num, int k) {
        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] == num[j]) {
                    if (j - i <= k) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
