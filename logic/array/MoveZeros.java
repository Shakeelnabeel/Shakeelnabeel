package logic.arrays;          //  SUBMITTED 283. LEETCODE

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int[] nums = {1, 0, 0, 2, 3};
        System.out.print(Arrays.toString(moveZeros(nums)));
    }

    private static int[] moveZeros(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int move;
            count++;
            if (count > nums.length) {
                return nums;
            }
            if (nums[i] == 0) {
                move = 0;
                for (int j = i; j < nums.length - 1; j++) {
                    nums[j] = nums[j + 1];
                }
                nums[nums.length - 1] = move;
                i--;
            }
        }
        return nums;

    }
}
