package logic.arrays;       //      SUBMITTED

public class ContainerWithMostWater11 {
    public static void main(String[] args) {
        int[] height = new int[]{2, 3, 4, 5, 18, 17, 6};
        System.out.println(mostWater(height));
    }

    private static int mostWater(int[] height) {
        int first = 0;
        int second = height.length - 1;
        int length = height.length - 1;
        int area = 0;
        int current = 0;
        for (int i = 0; i < height.length; i++) {
            int min = Math.min(height[first], height[second]);
            current = min * length;
            if (height[first] >= height[second]) {
                second--;
            } else {
                first++;
            }
            if (area < current) {
                area = current;
            }
            length--;
        }
        return area;
    }
}
