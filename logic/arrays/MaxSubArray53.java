package logic.arrays;       //      SUBMITTED

public class MaxSubArray53 {
    public static void main(String[] args) {
        int[] num = {-2,-1};
        System.out.println(sum(num));
    }

    private static int sum(int[] num) {
        if(num.length == 1) {
            return num[0];
        }
        int maxSum = Integer.MIN_VALUE;
        int curSum = 0;
        for (int j : num) {
            curSum = curSum + j;
            if (maxSum < curSum) {
                maxSum = curSum;
            }
            if (curSum < 0) {
                curSum = 0;
            }

        }
        return maxSum;
    }
}
