package logic.arrays;

public class FarthestElement0 {
    public static void main(String[] args) {
        int[] num = new int[]{2, -4, 1, 8, 2, 0, -8};
        System.out.println(element(num));
    }

    private static int element(int[] num) {
        int pos_num = 0;
        int j = 0;
        int result = 0;
        int[] clone = num.clone();
        for (int i = 0; i < num.length; i++) {
            if (num[i] < 0) {
                pos_num = -num[i];
            } else
                pos_num = num[i];

            if (result < pos_num) {
                result = pos_num;
                j = i;
            }
        }
        return clone[j];
    }
}
