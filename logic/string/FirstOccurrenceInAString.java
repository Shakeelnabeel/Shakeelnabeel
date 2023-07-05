package logic.string;

public class FirstOccurrenceInAString {
    public static void main(String[] args) {
        String needle = "leeto";
        String hayStack = "leetcode";
        System.out.println(occurance(needle, hayStack));
    }

    private static int occurance(String needle, String hayStack) {
        return hayStack.indexOf(needle);
    }
}
