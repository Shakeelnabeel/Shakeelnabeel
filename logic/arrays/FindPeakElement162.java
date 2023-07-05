package logic.arrays;   //      SUBMITTED

public class FindPeakElement162 {
    public static void main(String[] args) {
        int[] num = new int[]{1,2,3};
        System.out.println(peak(num));
    }

    private static int peak(int[] num) {
        if (num.length <= 2) {
            if (num.length == 1) {
                return 0;
            }
            if (num[0] > num[1]) {
                return 0;
            } else return 1;
        }
        int prev = 0;
        int curr = 1;
        int next = 2;
        int result = 0;
        while (next < num.length) {
            if (num[curr] > num[next]) {
                if (num[prev] < num[curr]) {
                    result = curr;
                    return result;
                }
            }
            prev++;
            curr++;
            next++;
        }
        int highest = 0;
        int highestInd = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] > highest) {
                highest = num[i];
                highestInd = i;
            }
        }
        return highestInd;
    }
}
