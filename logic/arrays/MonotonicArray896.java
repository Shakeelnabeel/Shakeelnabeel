package logic.arrays;

public class MonotonicArray896 {
    public static void main(String[] args) {
        int[] num = new int[]{6,5,4,4};
        System.out.println(mono(num));
    }

    private static boolean mono(int[] nums) {
        boolean inc = true;
        boolean dec = true;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]<nums[i+1])
                inc = false;
            if(nums[i]>nums[i+1])
                dec = false;
        }

        return inc || dec;
    }
}
