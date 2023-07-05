package logic.HashTable;        //  CORRECT CODE        - NOT SUBMITTED

import java.util.HashSet;
import java.util.Set;

public class RemoveLetterToEqualizeFrequency2423 {
    public static void main(String[] args) {
        String s = "abcc";
        System.out.println(equalize(s));
    }

    private static boolean equalize(String s) {
        int[] counts = new int[26];
        for (char a : s.toCharArray()) {
            counts[a - 'a'] = ++counts[a - 'a'];
        }
        for (int i = 0; i < 26; i++) {
            counts[i]--;
            Set<Integer> set = new HashSet<>();
            for (int j = 0; j < 26; j++) {
                if (counts[j] == 0) {
                    continue;
                }
                set.add(counts[j]);
            }
            if (set.size() == 1) {
                return true;
            }
            counts[i]++;
        }
        return false;
    }
}
