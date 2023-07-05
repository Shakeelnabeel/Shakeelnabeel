package DSA.recursion;

public class PowerOfFour342 {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(power(n));
    }

    private static boolean power(float n) {
        if (n == 1) {
            return true;
        } else if (n < 1) {
            return false;
        }
        return power(n / 4);

    }
}
