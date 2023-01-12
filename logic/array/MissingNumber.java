package logic.arrays;      //      SUBMITTED       268. LEETCODE

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = new int[]{0,1};
        System.out.println(missingNumber(nums));
    }

    public static int missingNumber(int[] num) {
        int check = 0;
        Arrays.sort(num);
        List<Integer> values = new ArrayList<>();
        for (int i = 0; i<num.length ; i++) {
            values.add(i);

            if (values.get(i) != num[i]) {
                check = i;
                return check;
            }
                check = num[num.length - 1] + 1;

        }
        return check;
    }

}
