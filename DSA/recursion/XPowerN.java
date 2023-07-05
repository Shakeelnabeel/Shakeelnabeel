package DSA.recursion;      //  CORRECT CODE

public class XPowerN {
    public static void main(String[] args) {
        int x = 3;
        int n = 3;
        System.out.println(sqrt(x,n));
    }

    private static int sqrt(int x, int n) {
        if (n == 0) {
            return 1 ;
        }
        int sqrt = sqrt(x, n - 1);
        sqrt = x * sqrt;
        return sqrt;
    }

}
