package logic.arrays;       //      SUBMITTED

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DuplicateInArray442 {
    public static void main(String[] args) {
        int num[] = new int[]{1};
        System.out.println(duplicateArray(num));
    }

    private static List<Integer> duplicateArray(int[] num) {
        HashMap<Integer, Integer> result = new HashMap<>();
        List<Integer> check = new ArrayList<>();
        for (int a : num) {
            if (!result.containsKey(a)) {
                result.put(a, 1);
            }else {
                check.add(a);
            }
        }

        return check;

    }
}
