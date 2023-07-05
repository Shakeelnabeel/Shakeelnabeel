package DSA.recursion;

import java.util.Stack;

public class DecodeString394 {

    public static void main(String[] args) {
        String s = "3[a]2[bc]";
        System.out.println(string(s));

    }

    private static String string(String s) {
        StringBuilder result = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        Stack<Integer> num = new Stack<>();
        Stack<Character> characters = new Stack<>();

        int i = 0;
        while(i < s.length()) {
            char c = s.charAt(1);
            num.push((int) s.charAt(i));
            i++;
            while (s.charAt(i + 1) != ']') {
                characters.push(s.charAt(i));
            }
            while (!characters.isEmpty()) {
                for (int j = 0; j < num.pop(); j++) {
                result.append(characters.pop());
                }
            }
        }
        return result.toString();
    }
}
