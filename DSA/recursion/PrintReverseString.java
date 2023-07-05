package DSA.recursion;      // CORRECT CODE

public class PrintReverseString {
    public static void main(String[] args) {
        String s = "abcd";
        reverseString(s);
    }

    private static void reverseString(String s) {
        int n = s.length();
        if (n == 0) {
            return;
        }
        System.out.println(s.charAt(n - 1));
        reverseString(s.substring(0, n - 1));
    }
}
