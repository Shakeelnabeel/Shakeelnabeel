package logic.arrays;       //      SUBMITTED

public class BuyStock122 {
    public static void main(String[] args) {
        int[] num = new int[]{3,3};
//        System.out.println(stock(num));
        System.out.println(stockNew(num));

    }

    private static int stockNew(int[] num) {
        int curr = 0;
        int next = 1;
        int total = 0;
        while (next < num.length) {
            if (num[curr] > num[next]) {
                curr = next;
                next++;
            } else if (num[curr] < num[next]) {
                while (next < num.length - 1 && num[next] < num[next + 1]) {
                    next++;
                }
                total = num[next] - num[curr] + total;
                curr = next;
                next++;
            }
            else {
                curr++;
                next++;
            }
        }
        return total;
    }

    private static int stock(int[] num) {
        int slow = 0;
        int fast = 1;
        int total = 0;
        int prev = 0;
        while (fast < num.length) {
            if (num[slow] > num[fast]) {
                slow++;
                fast++;
            }
            if (num[fast] > num[slow]) {
                if (prev <= num[fast]) {
                    total = num[fast] - num[slow];
                    prev = num[fast];
                } else {
                    slow = fast;
                }
                fast++;

            } else if (num[fast] < num[slow]) {
                slow = fast++;
                fast++;
            } else if (num[slow] == num[fast]) {
                slow = fast;
                fast++;
            }
        }
        return total;
    }
}
