package logic.string;

import java.util.Arrays;

public class FindTheDistanceValueBetweenTwoArrays1385 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 4, 2, 3};
        int[] arr2 = new int[]{-4, -3, 6, 10, 20, 30};

        int d = 3;

//        System.out.println(bruteForce(arr1, arr2, d));
        System.out.println(optimized(arr1, arr2, d));
    }

    private static int optimized(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);
        int count = 0;
        int max;
        int min;
        boolean ifTrue = false;
        for (int i = 0; i < arr1.length; i++) {
            max = Math.abs(arr1[i] + d);
            min = Math.abs(arr1[i] - d);
            for (int j = 0; j < arr2.length; j++) {
                if (arr2[j] >= min && arr2[j] < max) {
                    ifTrue = true;
                    break;
                }
            }
            if (!ifTrue) {
                count++;
            }
        }
        return count;
    }

    private static int bruteForce(int[] arr1, int[] arr2, int d) {
        int count = 0;
        boolean ifTrue = false;
        for (int j : arr1) {
            ifTrue = false;
            for (int k : arr2) {
                int abs = Math.abs(j - k);
                if (abs <= d) {
                    ifTrue = true;
                    break;
                }
            }
            if (!ifTrue) {
                count++;
            }
        }
        return count;
    }

}
