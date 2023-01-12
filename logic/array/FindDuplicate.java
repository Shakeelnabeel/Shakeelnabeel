package logic.arrays;

import java.util.HashMap;

public class FindDuplicate {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 1};
        System.out.println(duplicate(nums));
    }

    private static int duplicate(int[] nums) {
        HashMap<Integer, Integer> check = new HashMap<>();
        int duplicate = 0;
        for (int num : nums) {
            if (!check.containsKey(num)) {
                check.put(num, 1);
            } else {
                duplicate = num;
            }
        }
        return duplicate;
    }

}
