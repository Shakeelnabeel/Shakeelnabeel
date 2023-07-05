package DSA.recursion;      //   CORRECT CODE

public class SwapArray {
    public static void main(String[] args) {
        int[] num = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        swapArray(num, num.length - 1, 0);
        for (int a : num) {
            System.out.println(a);
        }
    }

    private static void swapArray(int[] num, int last, int first) {
        if (last < first) {
            return;
        }
        int temp = num[last];
        num[last] = num[first];
        num[first] = temp;

        swapArray(num, last - 1, first + 1);
    }
}
