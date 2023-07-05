package logic.arrays;       //      SUBMITTED

public class BinarySearch704 {
    public static void main(String[] args) {
        int[] num = new int[]{5};
        int target = 5;
        System.out.println(binarySearch(num, target));
    }

    private static int binarySearch(int[] num, int target) {
        int low = 0;
        int high = num.length - 1;
        int mid = 0;

        while (low <= high) {
            mid = (low + high) / 2;
            if (num[mid] < target) {
                low = mid + 1;
            } else if (num[mid] > target) {
                high = mid - 1;
            } else if (num[mid] == target) {
                return mid;
            }
        }
        return -1;
    }
}
/**
 * Hashmap
 * HashTable
 */