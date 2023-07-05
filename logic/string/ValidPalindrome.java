package logic.string;          //SUBMITTED 215. LEETCODE can be still optimised

public class ValidPalindrome {
    public static void main(String[] args) {
        String s =
                "A man, a plan, a canal: Panama"
                ;
        System.out.println(validPalindrome(s));
    }

    private static boolean validPalindrome(String s) {
        if (s.length() == 1) {
            return true;
        }
        char[] chars = s.toLowerCase().toCharArray();
        for (int i = 0; i < s.length(); i++) {
            char a = chars[i];
            if (a >= 'a' && a <= 'z' || a >= '0' && a <= '9') {

            } else {
                chars[i] = ' ';
            }
        }
        String newString = new String(chars);
        String mainString = newString.replaceAll("\\s+", "");
        char[] newChar = mainString.toCharArray();
        for (int i = 0; i < mainString.length() / 2; i++) {
            if (newChar[i] != newChar[newChar.length - 1 - i]) {
                return false;
            }

        }
        return true;
    }

}
