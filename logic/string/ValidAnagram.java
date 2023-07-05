package logic.string;      //  SUBMITTED   242. LEETCODE

import java.util.Arrays;

public class ValidAnagram {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "cat";
        System.out.println(checkAnagram(s, t));
    }

    private static boolean checkAnagram(String s, String t) {
        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();
        Arrays.sort(sChar);
        Arrays.sort(tChar);
        if (s.length() != t.length())
            return false;
        for (int i = 0; i < s.length(); i++) {
            if (tChar[i] != sChar[i]) {
                return false;
            }
        }
        return true;
    }

}
