package logic.string;          //      SUBMITTED 387. LEETCODE

public class UniqueCharacterInString {
    public static void main(String[] args) {
        String s = "leetcode";
        System .out.println(unique(s));
    }

    private static int unique(String s) {
        int[] freq = new int[26];
        for (char c: s.toCharArray()) {
            freq[c - (int)'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (freq[c - (int)'a'] == 1) {
                return i;
            }
        }
        return -1;
    }
}
