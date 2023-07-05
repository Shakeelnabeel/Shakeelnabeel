package logic.arrays;

public class JumpGame55 {
    public static void main(String[] args) {
        int[] num = new int[]{2, 3, 1, 1, 4};
        System.out.println(jump(num));
    }

    private static boolean jump(int[] num) {
        int jump = num[0];
        int length = 0;
        while (jump > num.length) {
            length = length + jump;
            return true;
        }
        return true;
    }
}
