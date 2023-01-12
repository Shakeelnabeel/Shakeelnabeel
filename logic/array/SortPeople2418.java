package logic.arrays;

import java.util.Arrays;

public class SortPeople2418 {
    public static void main(String[] args) {
        String[] names = new String[]{"Alice","Bob","Bob"};
        int[] height = new int[]{155,185,150};

        System.out.println(Arrays.toString(people(names, height)));
    }

    private static String[] people(String[] names, int[] height) {
        int temp;
        String temps;
        for (int i = 0; i < height.length - 1; i++) {
            if (height[i] < height[i + 1]) {
                temp = height[i];
                temps = names[i];

                height[i] = height[i + 1];
                height[i + 1] = temp;

                names[i] = names[i + 1];
                names[i + 1] = temps;
                i =- 1;
            }
        }
        return names;
    }
}
