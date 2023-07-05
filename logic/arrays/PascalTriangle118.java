package logic.arrays;       //      SUBMITTED

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle118 {
    public static void main(String[] args) {
        int k = 5;
        pascal(k);
    }

    private static List<List<Integer>> pascal(int k) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        temp.add(1);
        result.add(temp);
        temp = new ArrayList<>();
        for (int i = 1; i < k; i++) {
            temp.add(1);
            for (int j = 1; j < i; j++) {
                temp.add(result.get(i - 1).get(j - 1) + result.get(i - 1).get(j));
            }
            temp.add(1);
            result.add(temp);
            temp = new ArrayList<>();
        }
        return result;
    }
}
