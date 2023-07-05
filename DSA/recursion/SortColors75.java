package DSA.recursion;      //  SUBMITTED

import javax.swing.*;
import java.util.HashMap;

public class SortColors75 {

    public static void main(String[] args) {
        int[] nums = new int[]{2,0,2,1,1,0};

        System.out.println(sorts(nums));

    }

    private static int[] sorts(int[] nums) {
        HashMap<Integer, Integer> over = new HashMap<>();
        for (int n : nums) {
            if (over.containsKey(n)) {
                Integer integer = over.get(n);integer++;
                over.put(n, integer);
            } else{
                over.put(n, 1);
            }
        }
            int index =0;
        while (index < nums.length - 1) {
            for (int i = 0; i < 3; i++) {
                Integer total = over.get(i);
                if (total != null ) {
                    for (int j = 0; j < total && index <= nums.length - 1; j++) {
                        nums[index] = i;
                        index++;
                    }
                }

            }

        }
        return nums;
    }


}
