package Algorithms;         //      CORRECT CODE


public class BinarySearch {
    public static void main(String[] args) {
        int[] num = new int[]{-1,0,3,5,9,12};
        int k = 9;
//        System.out.println(binarySearchRecur(num, k, 0, num.length));
        System.out.println(binarySearch(num, k));
    }

    private static int binarySearch(int[] num, int k) {
        int low = 0, high = num.length;
        int mid = 0;
        while (low == high) {
            mid = (low + high) / 2;
            if (k == mid) {
                return mid;
            } else if (k < mid) {
                low = mid - 1;
            } else if (k > mid) {
                high = mid - 1;
            }
        }
        return mid;
    }

    private static int binarySearchRecur(int[] num, int k, int low, int high) {

        int mid = (low + high) / 2;

        if (k == num[mid]) {
            return mid;
        } else if (k < num[mid]) {
            return binarySearchRecur(num, k, low, mid - 1);
        } else if (k > num[mid]) {
            return binarySearchRecur(num, k, mid + 1, high);
        }
        return mid;
    }
}
