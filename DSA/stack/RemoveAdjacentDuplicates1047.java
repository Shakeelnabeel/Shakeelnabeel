package DSA.stack;      // SUBMITTED

import java.util.Stack;

public class RemoveAdjacentDuplicates1047 {
    public static void main(String[] args) {
        String q = "azxxzy";
        System.out.println(remove(q));
    }


    public static String remove(String s) {
        Stack<Character> st = new Stack<>();
        char[] chars = s.toCharArray();
        st.push(' ');
        for (char a : chars) {
            if (st.peek() != a) {
                st.push(a);
            } else {
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
