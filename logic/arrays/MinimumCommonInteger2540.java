package logic.arrays;       //      SUBMITTED

public class MinimumCommonInteger2540 {
    public static void main(String[] args) {
        int[] num1 = new int[]{3,5};
        int[] num2 = new int[]{3};
        System.out.println(common(num1, num2));
    }

    private static int common(int[] num1, int[] num2) {
        int p1 = 0;
        int p2 = 0;

        while (p1 < num1.length && p2 < num2.length) {
            if (num1[p1] < num2[p2]) {
                p1++;
            } else if (num1[p1] > num2[p2]) {
                p2++;
            } else return num1[p1];
        }
        return -1;
    }


    private static int binarySearchRecur(int[] num, int k, int low, int high) {

        if (low > high) {
            return -1;
        }
        int mid = (low + high) / 2;
        if (num.length - 1 < mid) {
           return mid;
        }


        if (k == num[mid]) {
            return mid;
        }
        if (k < num[mid]) {
            return binarySearchRecur(num, k, low, mid - 1);
        }
        if (k > num[mid]) {
            return binarySearchRecur(num, k, mid + 1, high);
        }
        return mid;
    }
}
