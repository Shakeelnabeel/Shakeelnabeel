package logic.arrays;

public class SearchInsertPosition35 {
    public static void main(String[] args) {
        int[] num = new int[]{1, 2, 5, 6, 7, 9};
        int target = 8;
        System.out.println(search(num, target));
    }

    private static int search(int[] num, int target) {
        int start = 0;
        int last = num.length - 1;
        while (start <= last) {
            int mid = start + (last - start) / 2;
            if (num[mid] == target) {
                return mid;
            }
            if (num[mid] < target) {
                start = mid + 1;
            }
            if (num[mid] > target) {
                last = mid - 1;
            }
        }
        return start;
    }
}
