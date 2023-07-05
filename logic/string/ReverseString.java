package logic.string;          //SUBMITTED 344. LEETCODE

public class ReverseString {
    public static void main(String[] args) {
        char[] s = new char[]{'s', 'q', 'r'};
        System.out.println(reverseString(s));
    }

    private static char[] reverseString(char[] s) {
        char temp;
        for (int i = 0; i < s.length / 2; i++) {
            temp = s[i];
            s[i] = s[s.length -1 - i];
            s[s.length - 1 - i] = temp;
        }
        return s;
    }
}
