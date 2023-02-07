package DSA.recursion;          //  CORRECT CODE

public class ReverseNumber {
    public static void main(String[] args) {
        int s = 234;
        reverseString(s);
    }

    private static void reverseString(int s) {

        if (s == 0) {
            return;
        }
        System.out.print(s % 10);
        reverseString(s / 10);
    }
}
