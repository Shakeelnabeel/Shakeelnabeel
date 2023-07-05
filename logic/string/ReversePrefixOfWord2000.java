package logic.string;       // SUBMITTED

public class ReversePrefixOfWord2000 {
    public static void main(String[] args) {
        String word = "abcdefd";
        char ch = 'd';
        System.out.println(reverse(word, ch));
    }

    private static String reverse(String word, char ch) {
        StringBuilder newString = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != ch) {
                newString.append(word.charAt(i));
            } else {
                newString.append(word.charAt(i));
                newString.reverse();
                newString.append(word.substring(i + 1));
                break;
            }
        }
        return newString.toString();

    }

}
