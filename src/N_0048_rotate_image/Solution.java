package N_0048_rotate_image;

import java.util.Arrays;

public class Solution {
    public static int[][] rotate(int[][] matrix) {
        transposeMatrix(matrix);
        reverseRows(matrix);
        return matrix;
    }

    private static void transposeMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j <= i; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    private static void reverseRows(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            int left = 0;
            int right = matrix[i].length - 1;
            while (left < right) {
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] result = rotate(matrix);
        System.out.print(Arrays.deepToString(result));
    }
}
