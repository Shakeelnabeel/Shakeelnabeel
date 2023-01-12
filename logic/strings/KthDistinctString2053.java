package logic.string;       //LEETCODE

import java.util.HashMap;

public class KthDistinctString2053 {
    public static void main(String[] args) {
        String[] arr = new String[]{
                "a","b","a"
        };
        int k = 3;
        System.out.println(distinct(arr, k));

    }

    private static String distinct(String[] arr, int k) {
        HashMap<String, Integer> check = new HashMap<>();
        int count = 0;
        for (String a : arr) {
            if (!check.containsKey(a)) {
                check.put(a, count);
            }else {
                Integer value = check.get(a);
                value++;
                check.put(a, value);
            }
        }

        int nDistinct = 0;
        for (String a : arr) {
            if (check.get(a) == 0) {
                nDistinct++;
                if (nDistinct == k) {
                    return a;
                }
            }
        }
        return "";
    }
}
