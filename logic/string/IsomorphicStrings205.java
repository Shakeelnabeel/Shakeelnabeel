package logic.string;

import java.util.HashMap;

public class IsomorphicStrings205 {
    public static void main(String[] args) {
        String s = "badc";
        String t = "baba";
        System.out.println(isomorphic(s, t));
    }

    private static boolean isomorphic(String s, String t) {
        HashMap<Character, Character> result = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!result.containsKey(s.charAt(i))) {
                if (result.containsValue(t.charAt(i))) {
                    return false;
                }
                result.put(s.charAt(i), t.charAt(i));
            } else {
                if (result.get(s.charAt(i)) != t.charAt(i)) {
                    return false;
                }
            }
        }
        for (char a : s.toCharArray()) {
            Character character = result.get(a);
        }
        return true;
    }
}
