package Practice_Daily;

import java.util.ArrayList;

public class _87_TransposeMatrix {
    //Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
    //Output: [[1,4,7],[2,5,8],[3,6,9]]
    //[1,2,3],[4,5,6]
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3}, {4,5,6}};
        int[][] numbers = transpose(matrix);
        for (int i = 0; i < numbers.length ; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] numbers = numbers = new int[cols][rows];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                numbers[j][i] = matrix[i][j];
            }
        }
        return numbers;
    }
}
