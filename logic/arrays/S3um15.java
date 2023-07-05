package logic.arrays;       //      SUBMITTED

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class S3um15 {
    public static void main(String[] args) {
        int[] num = {-1, 0, 1, 2, -1, -4};
        threeSum(num);

    }

    public static List<List<Integer>> threeSum(int[] num) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(num);
        for (int i = 0; i < num.length - 1; i++) {
            if (i == 0 || num[i] != num[i - 1]) {
                int left = i + 1;
                int right = num.length - 1;
                while (left < right) {
                    if (num[i] + num[left] + num[right] > 0) {
                        right--;
                    } else if (num[i] + num[left] + num[right] < 0) {
                        left++;
                    } else if ( num[i] + num[left] + num[right] == 0){
                        result.add(List.of(num[i], num[left], num[right]));
                        left++;
                        right--;
                        while (left < num.length && num[left] == num[left - 1]) {
                            left++;
                        }
                    }
                }
            }
        }
        return result;
    }

    private static void checkTwoSum(int current, int[] nums, List<List<Integer>> result) {
        System.out.println("Current: " + current);
        int low = current + 1;
        int high = nums.length - 1;
        while (high > low) {
            int sum = nums[current] + nums[low] + nums[high];
            if (sum == 0) {
                result.add(List.of(nums[current], nums[low], nums[high]));
                low++;
                high--;
                while (low < nums.length && nums[low] == nums[low - 1]) {
                    low++;
                }
            } else if (sum < 0) {
                low++;
            } else {
                high--;
            }
        }
    }
}
