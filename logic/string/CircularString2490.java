package logic.string;       // LEETCODE

public class CircularString2490 {
    public static void main(String[] args) {
        String s = "ab a";


        System.out.println(sentence(s));
    }

    private static boolean sentence(String s) {
        char[] array = s.toCharArray();
        if (array[0] == array[s.length() - 1]) {
            for (int i = 0; i < s.length() - 1; i++) {
                if (array[i] == ' ') {
                    if (array[i - 1] != array[i + 1]) {
                        return false;
                    }
                }
            }
        } else {
            return false;
        }
        return true;
    }
}
