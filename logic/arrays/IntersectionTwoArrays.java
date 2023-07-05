package logic.arrays;

import java.util.*;

public class IntersectionTwoArrays {
    public static void main(String[] args) {
        int nums1[] = new int[]{4, 9, 5};
        int nums2[] = new int[]{9, 4, 9, 8};
        System.out.println(intersect(nums1, nums2));
    }

    private static int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> check = new HashMap<>();
        for (int j : nums1) {
            if (!check.containsKey(j)) {
                check.put(j, 1);
            } else {
                Integer count = check.get(j);
                count++;
                check.put(j, count);
            }
        }

        for (int j : nums2) {
            if (check.containsKey(j)) {
                Integer count = check.get(j);
                count--;
                check.put(j, count);
            }
        }
        List<Integer> result = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : check.entrySet()) {
            if (entry.getValue() == 0) {
                Integer key = entry.getKey();
                result.add(key);

            }
        }
        int[] arr = new int[result.size()];
        for (int i = 0; i < result.size(); i++)
            arr[i] = result.get(i);

        // Printing elements of array on console
//        for (int x : arr)
//            System.out.print(x + " ");

        return arr;
    }
}
