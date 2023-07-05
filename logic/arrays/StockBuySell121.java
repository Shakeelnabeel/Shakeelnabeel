package logic.arrays;       //   SUBMITTED

public class StockBuySell121 {
    public static void main(String[] args) {
        int num[] = new int[]{
                7,6,4,3,1
        };
        System.out.println(stock(num));

    }

    private static int stock(int[] prices) {
        int smallest = Integer.MAX_VALUE;
        int current = 0;
        int diff = 0;
        for (int a : prices) {
            if (a < smallest) {
                smallest = a;
            }
            current = a - smallest;
            if (current > diff) {
                diff = current;
            }
        }
        return diff;
    }
}
