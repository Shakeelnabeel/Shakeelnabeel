package logic.arrays;       //      SUBMITTED

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionOfTwoArrays350 {
    public static void main(String[] args) {
        int[] num1 = new int[]{4,9,5};
        int[] num2 = new int[]{9,4,9,8,4};
        System.out.println(Arrays.toString(intersect(num1, num2)));

    }

    private static int[] intersect(int[] nums1, int[] nums2) {
//        List<Integer> result = new ArrayList<>();     My Solution
//        for (int i = 0; i < num1.length; i++) {
//            for (int j = 0; j < num2.length; j++) {
//                if (num1[i] == num2[j]) {
//                    result.add(num2[j]);
//                    num2[j] = -1;
//                    num1[i] = -2;
//                }
//            }
//        }
//        int[] arr = new int[result.size()];
//        for (int i = 0; i < result.size(); i++)
//            arr[i] = result.get(i);
//
//        return arr;
        int ans[]=new int[1001];        //  Best solution
        int res[]=new int[1001];
        for(int i:nums1) ans[i]++;
        int cnt=0;
        for(int i:nums2){
            if(ans[i]>0){
                res[cnt++]=i;
                ans[i]--;
            }
        }
        return Arrays.copyOfRange(res,0,cnt);
    }

}
