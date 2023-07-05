package logic.arrays;

public class MaximumAvgSubArray643 {
    public static void main(String[] args) {
        int[] num = new int[]{1,12,-5,-6,50,3};
        int k = 4;

        System.out.println(avg(num, k));
    }

    private static double avg(int[] num, int k) {
        int left = 0;
        int right = 0;
        double sum = 0;

        while (right < k - 1) {
            sum = sum + num[right];
            right ++;
        }
        while (right < num.length) {
            double temp = sum - num[left];
            if (temp < 0) {
                temp = 0;
            }
            temp = temp + num[right];
            if (temp > sum) {
                sum = temp;
            }
            left ++;
            right ++;
        }
        return sum / 2;
    }
}
