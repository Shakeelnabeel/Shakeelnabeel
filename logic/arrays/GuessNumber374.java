package logic.arrays;       //  SUBMITTED

public class GuessNumber374 {
    public static void main(String[] args) {
        int n = 10;
        int pick = 6;
        System.out.println(guess(n, pick));
    }

    private static int guess(int n, int pick) {
        int low = 0;
        int high = n;
        int mid = 0;
        while (low <= high) {
            mid = low + (high - low) / 2;
            int res = guessN(mid, pick);
            if (res == 0) {
                return mid;
            } else if (res == -1) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return mid;
    }

    private static int guessN(int mid, int pick) {
        return Integer.compare(pick, mid);
    }
}


