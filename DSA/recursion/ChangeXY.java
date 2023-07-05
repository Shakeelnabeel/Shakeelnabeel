package DSA.recursion;

public class ChangeXY {
    public static void main(String[] args) {
        String s = "yyhiyy";
        int count = 0;
        pair(count, s);
    }

    private static String pair(int curr, String s) {
        if (curr > s.length()) {
            return "";
        }
        String replace = new String();
        if (s.charAt(curr) == 'x') {
            replace = s.replace(s.charAt(curr), 'y');
        }
        if (s.charAt(curr) == 'y') {
             replace = s.replace(s.charAt(curr), 'x');
        }
        curr++;
        return pair(curr, replace);
    }

}
