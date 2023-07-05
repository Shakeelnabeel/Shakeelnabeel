package logic.arrays;       //      correct answer

public class SecondLargestNumberArray {
    public static void main(String[] args) {
        int[] num = new int[]{4,2,3,9,5,2,7,2,9};
        System.out.println(largestNumber(num));
    }

    private static int largestNumber(int[] num) {
        if (num.length < 2) {
            return -1;
        }
        int lar = num[0];
        int secLar = num[0];
        for (int curr : num) {
             if (curr == lar) {
                continue;
            }
            if (curr > lar) {
                secLar = lar;
                lar = curr;
            } else if (curr > secLar) {
                secLar = curr;
            }
        }
            return secLar;
    }
}
