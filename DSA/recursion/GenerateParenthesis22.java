package DSA.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GenerateParenthesis22 {
    public static void main(String[] args) {
        int n = 2;
        System.out.println(generate(n));

    }

    private static List<String> generate(int n) {
        int i = 0, c = 0, o = 0;
        List<String> res = new ArrayList<>();
        return parenthesis(n, i, c, o, res);
    }

    private static List<String> parenthesis(int n, int i, int c, int o, List<String> res) {
        if (i > n * 2) {
            return Collections.singletonList("");
        }
        if (o < n) {
            res.add("(");
            parenthesis(n, i+1, c, o+1, res);
        }
        if (o > c) {
            res.add(")");
            parenthesis(n, i + 1, c + 1, o, res);
        }
        return res;
    }
}
