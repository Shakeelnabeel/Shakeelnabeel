package logic.string;

public class ReverseWordsInSentence151 {
    public static void main(String[] args) {
        String s = "  hello world  ";
        System.out.println(reverse(s));
    }

    private static String reverse(String s) {
        s = s + " ";
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder resultString = new StringBuilder();
        char[] chars = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if (chars[i] != ' ') {
                stringBuilder.append(chars[i]);
            } else {
                if (stringBuilder.length() != 0) {
                    resultString.insert(0, stringBuilder + " ");
                    stringBuilder = new StringBuilder();
                }
            }
        }
        return resultString.toString().trim();
    }
}
