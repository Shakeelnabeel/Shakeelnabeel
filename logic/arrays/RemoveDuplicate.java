package logic.arrays;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 1,1};
        System.out.println(removeDuplicate(nums));
    }

    private static int removeDuplicate(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums.length <= 2) {
                if (nums[0] == nums[1]) {
                    return nums[i];
                }else {
                    return nums.length;
                }
            }
            if (nums[i] == nums[i + 1]) {
                count++;
                int move = nums[i + 1];
                for (int j = i + 1; j <= nums.length - 2; j++) {
                    nums[j] = nums[j + 1];
                }
                i--;
                nums[nums.length - 1] = move;
            } else if (nums[i] > nums[i + 1]) {
                break;
            }

        }
        return nums.length - count;
    }
}
