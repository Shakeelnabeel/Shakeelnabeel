package logic.string;       //  SUBMITTED

public class ReverseString557 {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverse(s));
    }

    private static String reverse(String s) {
        StringBuilder newString = new StringBuilder();
        StringBuilder resultString = new StringBuilder();
        s = ' ' + s + ' ';
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                resultString.append(newString.reverse());
                newString = new StringBuilder();
            }
            newString.append(s.charAt(i));

        }
        return resultString.toString().trim();
    }
}
