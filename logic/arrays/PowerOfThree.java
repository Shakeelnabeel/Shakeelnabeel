package logic.arrays;

public class PowerOfThree {
    public static void main(String[] args) {
        int n = 19684;
        System.out.println(power(n));
    }

    private static boolean power(int n) {
//        if (n <= 0) {
//            return false;
//        }
//        while (n != 3 && n > 0) {
//            n = n/3;
//        }
//        return n == 3;
        if (n < 1) {
            return false;
        }

        while (n % 3 == 0) {
            n /= 3;
        }

        return n == 1;
    }
}
