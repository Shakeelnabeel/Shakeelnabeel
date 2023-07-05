package logic.string;      // SUBMITTED


public class LastWordLength {

    public static void main(String[] args) {
        String s = "   fly withme to thre moon   ";
        System.out.println((lastWorldLength(s)));

    }

    private static int lastWorldLength(String s) {
        char[] chars = s.toCharArray();
            int length = 0;
        for (int i = chars.length - 1; i >= 0; i--) {
//        for (int i = 0; i < chars.length; i++) {
            if(chars[i] != ' '){
                length++;
            } else if (chars[i] == ' ' && length != 0) {
                break;
            }

        }
        return length;
    }


}
