package logic.arrays;

public class RotateImage48 {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        rotate(arr);
        reverse(arr);
    }

    private static void reverse(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length / 2; j++) {
                int temp = arr[i][j];
                 arr[i][j] = arr[i][arr.length - 1 - j ];
                arr[i][arr.length - 1 - j] = temp;
            }
        }
    }

    private static void rotate(int[][] matrix) {
        int temp = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < i; j++) {
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    private static void print(int[][] matrix) {
        for (int[] row : matrix) {
            for (int ele : row) {
                System.out.print(ele + "  ");
            }
            System.out.println();
        }
    }
}
                                                                        