package DSA.stack;

import java.util.Stack;

public class GreatString1544 {
    public static void main(String[] args) {
        String s = "abBAcC";
        System.out.println(string(s));
    }

    private static String string(String s) {
        Stack<Character> st = new Stack<>();
        st.push(' ');
        char[] chars = s.toCharArray();
        for (char a : chars) {
            if (st.peek() != (a + 32) && st.peek() != (a - 32)) {
                st.push(a);
            }else {
                st.pop();
            }
        }
        StringBuilder newS = new StringBuilder();
        for (char a : st) {
            if (a != ' ') {
                newS.append(a);
            }
        }
        return newS.toString();
    }
}
