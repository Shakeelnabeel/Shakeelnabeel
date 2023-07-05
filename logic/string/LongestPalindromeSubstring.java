package logic.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LongestPalindromeSubstring {
    public static void main(String[] args) {
        String s = "abb";
        System.out.println(check(s));
    }

    private static String check(String s) {
        char[] l = s.toLowerCase().toCharArray();
        List<Character> result = new ArrayList<>();

        char[] clone = l.clone();
        char temp;
        for (int i = 0; i < clone.length / 2; i++) {
            temp = clone[i];
            clone[i] = clone[clone.length - 1 - i];
            clone[clone.length - i - 1] = temp;
        }
        for (int i = 0; i < clone.length; i++) {
        for (int j = 0; j < clone.length; j++) {
            if (s.length() == 2) {
                if (l[0] == l[1]) {
                    result.add(l[0]);
                    result.add(l[1]);
                    break;
                } else {
                    result.add(l[0]);
                    break;
                }
            } else if (s.length() == 1) {
                result.add(l[0]);
                break;
            }
            if (l[i] == clone[j]) {
                result.add(l[j]);
            }else
                break;
        }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (Character ch : result) {
            stringBuilder.append(ch);
        }

        return stringBuilder.toString();
    }
}

