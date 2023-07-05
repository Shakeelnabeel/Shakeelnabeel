package logic.arrays;       //  SUBMITTED

public class MatrixDiagonalSum1572 {
    public static void main(String[] args) {
        int[][] mat = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        System.out.println(matrixSum(mat));

    }

    private static int matrixSum(int[][] mat) {
        int sum = 0;
        int i = 0;
        int j = mat[0].length - 1;
        int index = 0;
        while (index < mat[0].length) {
            if (i != j) {
                sum = mat[index][j] + mat[index][i] + sum;
            } else {
                sum = mat[index][i] + sum;
            }
            index++;
            i++;
            j--;


        }
        return sum;
    }
}
