package logic.arrays;      //  SUBMITTED 1929 .  LEETCODE

public class ConcatenationArray {
    public static void main(String[] args) {
        int[] num = new int[]{1, 2, 1};
        System.out.println(cArray(num));
    }

    private static int[] cArray(int[] num) {
        int[] result = new int[num.length + num.length];
        for (int i = 0; i < num.length; i++) {
            result[i] = num[i];
            result[i + num.length] = num[i];
        }
        return result;
    }
}
