package logic.string;

import java.util.Arrays;

public class ShortestDistanceToACharacter821 {
    public static void main(String[] args) {
        String s = "loveleetcode";
        char c = 'e';
        System.out.println(Arrays.toString(distance(s, c)));
    }

    static int currAlpha = 0;
    static int reqPrevChar = 0;

//    private static int[] distance(String s, char c) {
//        char[] chars = s.toCharArray();
//        int[] result = new int[chars.length];
//        int reqChar = 0;
//
//        for (int i = 0; i < s.length(); i++) {
//            if (chars[reqChar] != c) {
//                updateResult(reqChar, reqPrevChar, result);
//            }
//            currAlpha++;
//            reqPrevChar = reqChar;
//            reqChar++;
//        }
//        return result;
//    }

    private static void updateResult(int reqChar, int reqPrevChar, int[] result) {

    }


    private static int[] distance(String s, char c){
        char[] chars = s.toCharArray();
        int[] result = new int[chars.length];
        int reqChar = 0;
        int temp = 0;
        while (chars[temp] != c) {
            reqChar = temp + 1;
            temp++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (chars[i] != c) {
                updateResult(reqChar, reqPrevChar, result);
            }
            reqPrevChar = reqChar;
        }
        return result;
    }
}
