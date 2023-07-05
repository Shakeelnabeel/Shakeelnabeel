package DSA.recursion;

public class ReverseArray {
    public static void main(String[] args) {
        int[] num = new int[]{1, 2, 3, 0, 5};
        reverseArray(num, num.length);
        for (int a : num) {
            System.out.println(a);
        }
    }

    private static void reverseArray(int[] num, int n) {
        if (n == 0) {
            return;
        }
        reverseArray(num, n - 1);
    }
}
