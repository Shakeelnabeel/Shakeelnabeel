package logic.string;       //      SUBMITTED

import java.util.HashMap;

public class RansomNote383 {
    public static void main(String[] args) {
        String ransom = "aa";
        String magazine = "aab";
        System.out.println(check(ransom, magazine));
    }

    private static boolean check(String ransom, String magazine) {
        char[] ransomC = ransom.toLowerCase().toCharArray();
        char[] magazineC = magazine.toLowerCase().toCharArray();
        HashMap<Character, Integer> result = new HashMap<>();
        for (char a : ransomC) {
            if (!result.containsKey(a)) {
                result.put(a, 1);
            }else {
                Integer count = result.get(a);
                count++;
                result.put(a, count);
            }
        }

        for (char b : magazineC) {
            if (result.containsKey(b)) {
                Integer count = result.get(b);
                if (count == 1 || count == 0) {
                    result.remove(b);
                }else {
                    result.put(b, count - 1);
                }
            }
        }
        return result.size() == 0;
    }
}
