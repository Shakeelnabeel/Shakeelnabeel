package logic.arrays;       //  SUBMITTED

public class RemoveValues27 {
    public static void main(String[] args) {
        int[] num = new int[]{0,1,1,2,2,3,4,5};
        System.out.println(remove(num, 2));

    }

    private static int remove(int[] nums, int val) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j ;
    }
}
