import java.util.Arrays;

public class SearchIn2D {
    public static void main(String[] args) {
        int[][] matrix = {{10,20,30,40}, {15,25,35,45}, {28,29,37,49}, {33,34,38,50}};
        int target = 25;
        System.out.println(Arrays.toString(searchin2D(matrix, target)));
    }
    public static int[] searchin2D(int[][] matrix, int target){
        int row = 0;
        int col = matrix.length-1;
        while(row < matrix.length && col >= 0){
            if(target == matrix[row][col]){
                return new int[]{row, col};
            }
            if(target < matrix[row][col]){
                col--;
            }
            else{
                row++;
            }
        }
        return new int[]{-1,-1};
    }
}
