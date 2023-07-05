package logic.string;   //  SUBMITTED

public class ReverseOnlyLetters917 {
    public static void main(String[] args) {
        String s = "z<*zj";

        System.out.println(reverse(s));
    }

    private static String reverse(String s) {
        StringBuilder result = new StringBuilder();
        int first = 0;
        int last = s.length() - 1;
        char[] letters = s.toCharArray();

        while (first < s.length()) {
            if (!Character.isLetter(letters[first])) {
                result.append(letters[first]);
                first++;
            } else {
                while (!Character.isLetter(letters[last])) {
                    last--;
                }
                result.append(letters[last]);
                first++;
                last--;
            }
        }
        return result.toString();
    }


}
