package logic.arrays;       //SUBMITTED

public class TruncateSentence1816 {
    public static void main(String[] args) {
        String s =
                "chopper is not a tanuki"
                ;
        int k = 5;

        System.out.println(sentence(s, k));
    }

    private static String sentence(String s, int k) {
        s = s + ' ';
        char[] array = s.toLowerCase().toCharArray();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (array[i] == ' ') {
                count++;
            }
            if (count == k) {
                return   s.substring(0, i);
            }
        }
        return null;
    }
}
