package logic.arrays;

import java.util.HashMap;
import java.util.Hashtable;

public class RomanToInteger {
    public static void main(String[] args) {
        String n = "MCMXCIV";
        System.out.println(CheckNumber(n));
    }

    private static int CheckNumber(String s) {
        Hashtable<Character, Integer> check = new Hashtable<>();
        check.put('I', 1);
        check.put('V', 5);
        check.put('X', 10);
        check.put('L', 50);
        check.put('C', 100);
        check.put('D', 500);
        check.put('M', 1000);
        char[] chars = s.toCharArray();

        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            Integer integer = check.get(chars[i]);
            count += integer;
        }
        return count;
    }


}
