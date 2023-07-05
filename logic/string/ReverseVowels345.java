package logic.string;       //      SUBMITTED

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseVowels345 {
    public static void main(String[] args) {
        String s = ".";
        System.out.println(reverse(s));
    }

    private static String reverse(String s) {
        if (s.trim().isEmpty()) {
            return s;
        }
        int left = 0;
        int right = s.length() - 1;
        char[] chars = s.toCharArray();
        StringBuilder res = new StringBuilder();
        List<Character> vowels = new ArrayList<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');


        while (left <= right) {
            while (left < chars.length && !vowels.contains(chars[left]) ) {
                left++;
            }
            while (left <= right &&  !vowels.contains(chars[right])) {
                right--;
            }
            if (left <= right) {
                char temp = chars[right];
                chars[right] = chars[left];
                chars[left] = temp;
            }
            left++;
            right--;
        }

        for (char a : chars) {
            res.append(a);
        }
        return res.toString();
    }
}
