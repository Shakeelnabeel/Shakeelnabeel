package logic.string;

import javax.management.MBeanAttributeInfo;

public class GoatLatin824 {
    public static void main(String[] args) {
        String sentence = "I speak Goat Latin";
        System.out.println(bruteForce(sentence));

    }

    private static String bruteForce(String sentence) {
        String[] arr = sentence.split(" ");
        StringBuilder suffix = new StringBuilder("m");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].charAt(0) != 'a' && arr[i].charAt(0) != 'e' && arr[i].charAt(0) != 'i' && arr[i].charAt(0) != 'o' && arr[i].charAt(0) != 'u'
                    && arr[i].charAt(0) != 'A' && arr[i].charAt(0) != 'E' && arr[i].charAt(0) != 'I' && arr[i].charAt(0) != 'O' && arr[i].charAt(0) != 'U') {
                String substring = arr[i].substring(1);
                arr[i] = substring + arr[i].charAt(0);
            }

            arr[i] = arr[i] + suffix;
            suffix.append("a");

        }
        StringBuilder result = new StringBuilder();
        for (String a : arr) {
            result.append(a).append(" ");
        }
        return result.toString().trim();
    }
}